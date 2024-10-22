package arrayExample;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
	public static void main(String args[]) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(24);
		numbers.add(36);
		numbers.add(39);
		numbers.add(12);
		numbers.add(24);
		
		int index = 0; // for index create index variable manually
		
		for(Integer num : numbers) {
			System.out.println("Element are at "+index+ ": " +num);
			
			index++;
			
		}
		//for check size --> Arraylist_Name.size();
		System.out.println("Size of array list is: " +numbers.size()); //6
	}

}
