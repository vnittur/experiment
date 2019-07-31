package com.github.vnittur.payment.gateway.instamojo;

import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.vnittur.payment.EntryPoint;
import com.instamojo.wrapper.api.ApiContext;
import com.instamojo.wrapper.api.Instamojo;
import com.instamojo.wrapper.api.InstamojoImpl;
import com.instamojo.wrapper.exception.ConnectionException;
import com.instamojo.wrapper.exception.HTTPException;
import com.instamojo.wrapper.model.PaymentOrder;
import com.instamojo.wrapper.model.PaymentOrderResponse;

@RestController
public class PaymentGatewayController 
{
	private static final Logger log = LoggerFactory.getLogger(EntryPoint.class);
	
	//Not a right thing to store these in code, need to move these to config files stored in kubernetes secret
	private static final String CLIENT_ID = "test_rSjYc8E8T4AJoSxDocqW3Cvea3fd3fgSgBV";
	private static final String CLIENT_SECRET = "test_hV2WKX5fhQXSkRqfsgfWMcJVuX9jgz6DD6aPLZUwyQxEgn2BkLQ3KKwdEtQM0RcgrAl6rgWpiot9q3VDo8mmKBRGFJ8JZFiItOqDVSyKqiEaTlvvk4DOiRS4WPq";
	
	
	//Rest api exposed to outside world.
	public Response getPaymentURL()
	{
		return null;
	}
	
	public Response getPaymentStatus(String paymentId)
	{
		return null;
	}
	
	public Response refundPayment(String paymentId)
	{
		return null;
	}
	
	
	public Response addToCart(String itemId)
	{
		return null;
	}
	
	public Response buyFromCart()
	{
		return null;
	}
	
	private void createPaymentOrder()
	{
		ApiContext context = ApiContext.create(CLIENT_ID, CLIENT_SECRET, ApiContext.Mode.TEST);
		Instamojo api = new InstamojoImpl(context);

		/*
		 * Create a new payment order
		 */
		PaymentOrder order = new PaymentOrder();
		order.setName("John Smith");
		order.setEmail("john.smith@gmail.com");
		order.setPhone("9902012799");
		order.setCurrency("INR");
		order.setAmount(9D);
		order.setDescription("This is a test transaction.");
		order.setRedirectUrl(" http://38e7a81c.ngrok.io/");
		order.setWebhookUrl(" http://38e7a81c.ngrok.io/payment/webhook");
		order.setTransactionId("dxg23522");

		try {
		    PaymentOrderResponse paymentOrderResponse = api.createPaymentOrder(order);
		    System.out.println(paymentOrderResponse.getPaymentOptions().getPaymentUrl());

		} catch (HTTPException e) {
		    System.out.println(e.getStatusCode());
		    System.out.println(e.getMessage());
		    System.out.println(e.getJsonPayload());

		} catch (ConnectionException e) {
		    System.out.println(e.getMessage());
		}
	}
	
	public void confirmPayment()
	{
		
	}
	
	
	@RequestMapping(value = "/payment/webhook", method = RequestMethod.POST, headers = {"content-type=application/x-www-form-urlencoded"})
    public Response webhook(@RequestBody MultiValueMap body) {
		System.out.println(body.get("status"));
		return null;
	}
	
	public static void main(String [] args )
	{
		System.out.println("Testing");
		PaymentGatewayController gateWayController = new PaymentGatewayController();
		gateWayController.createPaymentOrder();
	}
}


