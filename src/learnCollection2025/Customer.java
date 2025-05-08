package learnCollection2025;

public class Customer implements Comparable<Customer> {
	
	private Integer orderId;
	private Double amount;
	private String customerName;
	
	
	public Customer(Integer orderId, Double amount, String customerName) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.customerName = customerName;
	}


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	@Override
	public String toString() {
		return "Customer [orderId=" + orderId + 
				", amount=" + amount + 
				", customerName=" + customerName + "]";
	}


	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
//		if(o.orderId > this.orderId) {
//			return 1;
//		}else {
//			return -1;
//		}
		
		//for safer version 
		return o.orderId.compareTo(this.orderId);
	}
}
