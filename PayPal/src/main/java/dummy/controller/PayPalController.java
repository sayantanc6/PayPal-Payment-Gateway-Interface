package dummy.controller;


import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

import dummy.entity.OrderEntity;
import dummy.model.OrderModel;
import dummy.repo.OrderRepository;
import dummy.service.PayPalService;



@RestController
public class PayPalController {
	
	@Autowired
	DozerBeanMapper mapper;
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	OrderRepository repo;
	
	@Autowired
	PayPalService service;

	public static final String SUCCESS_URL = "pay/success";
	public static final String CANCEL_URL = "pay/cancel";

	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("Welcome");
	}

	@PostMapping("/pay")
	public ModelAndView payment(@ModelAttribute("order") OrderModel order) {
		try {
			Payment payment = service.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(),
					order.getIntent(), order.getDescription(), "http://localhost:9090/" + CANCEL_URL,
					"http://localhost:9090/" + SUCCESS_URL);
			for(Links link:payment.getLinks()) {
				if(link.getRel().equals("approval_url")) {
					return new ModelAndView("redirect:"+link.getHref()); 
				}
			}
			
		} catch (PayPalRESTException e) {
		
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/");
	}
	
	 @GetMapping(value = CANCEL_URL)
	    public ModelAndView cancelPay() {
	        return new ModelAndView("cancel");
	    }

	    @GetMapping(value = SUCCESS_URL)
	    public ModelAndView successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId) {
	        try {
	            Payment payment = service.executePayment(paymentId, payerId);
	            System.out.println(payment.toJSON());
	            if (payment.getState().equals("approved")) {
	            	OrderModel orderModel = context.getBean(OrderModel.class);
	            	repo.save(mapper.map(orderModel, OrderEntity.class)); 
	                return new ModelAndView("success");
	            }
	        } catch (PayPalRESTException e) {
	         System.out.println(e.getMessage());
	        }
	        return new ModelAndView("redirect:/");
	    }
}
