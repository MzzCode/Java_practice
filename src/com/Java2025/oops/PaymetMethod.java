package com.Java2025.oops;

// interface 
interface PaymentProvider{
    
    double initiatePayment();
    void processPayment();
    double refundPayment(double amount);
}

class Paypal implements PaymentProvider{
    
    double amount;
    
    // constructor
    Paypal(double amount){
        this.amount = amount;
    }
    
    // implement abstract method
    
   public double initiatePayment(){
        System.out.println("paypal - initiate payment: " +amount);
        return amount;
    }
   public void processPayment(){
        System.out.println("payment is processing...");
    }
    
    public double refundPayment(double amount){
        System.out.println("refund payment: " +amount);
        return amount;
    }
}

class Stripe implements PaymentProvider{
    
    double amount;
    
    Stripe(double amount){
        this.amount = amount;
    }
    
    // implement abstract method
    
   public double initiatePayment(){
        System.out.println("\nstripe - initiate payment: " +amount);
        return amount;
    }
   public void processPayment(){
        System.out.println("payment is processing...");
    }
    
    public double refundPayment(double amount){
        System.out.println("refund payment: " +amount);
        return amount;
    }
}

class Razorpay implements PaymentProvider{
    
    double amount;
    
    Razorpay(double amount){
        this.amount = amount;
    }
    
    // implement abstract method
    
   public double initiatePayment(){
        System.out.println("\nrazorpay- initiate payment: " +amount);
        return amount;
    }
   public void processPayment(){
        System.out.println("payment is processing...");
    }
    
    public double refundPayment(double amount){
        System.out.println("refund payment: " +amount);
        return amount;
    }
}

public class PaymetMethod{
    public static void main(String args[]){
        
        PaymentProvider paypal = new Paypal(40);
        paypal.initiatePayment();
        paypal.processPayment();
        paypal.refundPayment(30);
                
        PaymentProvider stripe = new Stripe(20);
        stripe.initiatePayment();
        stripe.processPayment();
        stripe.refundPayment(15.5);
                
        PaymentProvider razorpay = new Razorpay(10);
        razorpay.initiatePayment();
        razorpay.processPayment();
        razorpay.refundPayment(8);
    }
}