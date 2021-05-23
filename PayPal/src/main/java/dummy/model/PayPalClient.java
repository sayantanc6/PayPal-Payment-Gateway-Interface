package dummy.model;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;

@Component
public class PayPalClient {


	@Value("${paypal.client.id}")
	private String clientId;
	
	@Value("${paypal.secret.id}")
	private String secretId;	
	

	  /**
	   *Method to get client object
	   *
	   *@return PayPalHttpClient client
	   */
	public PayPalHttpClient client() {
//		PayPalEnvironment environment = new PayPalEnvironment.Live(clientId,secretId);
		PayPalEnvironment environment = new PayPalEnvironment.Sandbox(clientId,secretId);
		  
		PayPalHttpClient client = new PayPalHttpClient(environment);
		client.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(900));
		return client;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public void setSecretId(String secretId) {
		this.secretId = secretId;
	}
}
