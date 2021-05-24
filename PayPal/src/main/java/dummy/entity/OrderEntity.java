package dummy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "ORDER_PAYPAL")
public class OrderEntity {

	@Id
	@Column(name = "ORDER_ID",nullable = false,columnDefinition="VARCHAR(64)")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paypal_generator")
	@GenericGenerator(
					name = "book_generator",
					strategy = "dummy.entity.StringSequenceIdentifier"
					)
	private String orderId;
	
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "METHOD")
	private String method;
	
	@Column(name = "INTENT")
	private String intent;
	
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "PRICE")
	private double price;
	
	
	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public String getMethod() {
		return method;
	}


	public void setMethod(String method) {
		this.method = method;
	}


	public String getIntent() {
		return intent;
	}


	public void setIntent(String intent) {
		this.intent = intent;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", currency=" + currency + ", method=" + method + ", intent="
				+ intent + ", description=" + description + ", price=" + price + "]";
	}
	
}
