package learnCollection2025;

import java.util.Comparator;

public class CustomerOrder implements Comparator<Customer> {

	
	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o2.getAmount().compareTo(o1.getAmount());
	}
}

