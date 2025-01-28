package com.oops.abstractJava;
//interface declaration

interface PaymentProvider{
	void initiatePayment(double amount);
	void processPayment();
	void refundPayment(double amount);
}

class PaypalProvider implements PaymentProvider
{
public void initiatePayment(double amount) {
	System.out.println("PayPal: Initiating payment of $ "+amount);
}
	public void processPayment() {
		System.out.println("PayPal: Processing payment...");
	}
	public void refundPayment(double amount) {
		System.out.println("PayPal: Refunding $ "+amount);
	}
}

class Stripe implements PaymentProvider
{
public void initiatePayment(double amount) {
	System.out.println("\nStripe: Initiating payment of $ "+amount);
}
	public void processPayment() {
		System.out.println("Stripe: Processing payment...");
	}
	public void refundPayment(double amount) {
		System.out.println("Stripe: Refunding $ "+amount);
	}
}

class RazorPay implements PaymentProvider
{
public void initiatePayment(double amount) {
	System.out.println("\nRazorPay: Initiating payment of $ "+amount);
}
	public void processPayment() {
		System.out.println("RazorPay: Processing payment...");
	}
	public void refundPayment(double amount) {
		System.out.println("RazorPay: Refunding $ "+amount);
	}
}

public class Example2AbstractionUsingInterface {
public static void main(String args[]) {
	
	PaymentProvider paypalProvider = new PaypalProvider();
	paypalProvider.initiatePayment(40.5);
	paypalProvider.processPayment();
	paypalProvider.refundPayment(30);
	
	PaymentProvider stripe = new Stripe();
	stripe.initiatePayment(20);
	stripe.processPayment();
	stripe.refundPayment(60.4);
	
	PaymentProvider razorpay = new RazorPay();
	razorpay.initiatePayment(550);
	razorpay.processPayment();
	razorpay.refundPayment(44.6);
	
}
}
