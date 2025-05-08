package learnCollection2025;

import java.util.PriorityQueue;
import java.util.Queue;

public class CustomerPQ {
	public static void main(String args[]) {
		Queue <Customer> customer = new PriorityQueue<>(new CustomerOrder());
		
		customer.add(new Customer(5, 60.0, "Mega Wars"));
		customer.add(new Customer(10,150.0 , "jhon deo"));
		customer.add(new Customer(2,250.0 , "leo"));
	
	System.out.println("customers Detail: " +customer);
	System.out.println("After poll: " +customer.poll());
	System.out.println("Customer Detail: " +customer);
	}
}
