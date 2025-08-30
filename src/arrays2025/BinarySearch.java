package arrays2025;

public class BinarySearch {
	
	// method for binary search
	
	public static int binarySearch(int arr[], int key){
	    
	    // 1 step create start and end
	    
	    int start = 0, end = arr.length-1;
	    
	    while(start <= end){
	        
	     // 2 step calculate mid
	        
	        int mid = (start + end) / 2;
	        
	        // Comparison
	        
	        if(arr[mid] == key){
	            return mid;
	        }
	        if(arr[mid] > key){       
	           end = mid - 1;  // left side array (end = mid - 1)
	        } 
	        else{
	            start = mid + 1;  // rigth side array (start = start = mid + 1)
	        }
	    }
	    
	    return -1; // if key not found
	}
	
	// main method
	public static void main(String[] args) {

	int arr[] = {2,6,10,15,20,24,30}; // array must be sorted either in incresing or decreasing order

	int key = 20;

	/* this give more control on output
	
	int result = binarySearch(arr, key); // binarySearch method call

	if(result == -1){
     System.out.println("key not present in array");
	 }else{
	   System.out.println("Key at index: " +result);
	 }
	 }
*/
	System.out.println("key present at index: " + binarySearch(arr, key));
	    
	}
	}