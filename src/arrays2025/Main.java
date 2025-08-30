package arrays2025;

// linear Search in array

class Solution{
	//method 
	public static int linearSearch(String arr[], String findName) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(findName)) {
				return i;// index return where the name is found
			}
		}
		return -1; // name not found
	}
}
public class Main {
	public static void main(String args[]) {
		
		String arr[] = {"Mega", "Varun", "Khan", "Mohit", "Alam"};
		String findName = "Alam";
		
		// method call
		int index = Solution.linearSearch(arr, findName);
		
		if(index == -1) {
			System.out.println("Name not present in array");
		}
		else {
			System.out.println(findName + " at index: " +index);
		}
	}

}
