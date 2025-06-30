package com.interview.question2025.majorityelement;

import java.util.HashMap;
import java.util.Map;

//class
public class FindMajorityElementInArrayUsingHashMap {
	/*
	Using HashMap (Frequency Count)
	Time Complexity: O(n)
	Space Complexity: O(n)
	*/
	
	//method
	public static int majorityElement(int arr[]) {
		 int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		
		// loop
		for(int num: arr) {
			/*
			1) by using containsKey()
			
			if (map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num,1);
			}
			*/
			
			// 2) By getOrDefault()
			map.put(num, map.getOrDefault(num, 0)+1);
			
			if(map.get(num)>n/2) {
				return num;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int arr[] = {1,2,2,4,2,2};
		System.out.println("majority element: "+majorityElement(arr));
	}
}
