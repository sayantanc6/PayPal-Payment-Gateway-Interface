package dummy.model;

import org.dozer.Mapping;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class OrderModel {

	@JsonProperty("price") 
	private double price;
	
	@JsonProperty("method")
	private String method;
	
	@JsonProperty("currency")
	private String currency;
	
	@JsonProperty("intent")
	private String intent;
	
	@JsonProperty("description")
	private String description;
	
	@Mapping("price")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Mapping("method")
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@Mapping("currency")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Mapping("intent")
	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	@Mapping("quantity")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Order [price=" + price + ", method=" + method + ", currency=" + currency + ", intent=" + intent
				+ ", description=" + description + "]";
	}
	
	
	
}
