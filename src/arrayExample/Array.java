package arrayExample;

public class Array{
	public static void main(String args[]) {
		
		
		int arr[] = {-10,1,5,6,-11};

		int smallest = arr[0];
	

		for(int i=0; i<arr.length; i++) {
			if(arr[i] < smallest)
			smallest = arr[i];
		}
		System.out.println("Smallest elemet: " +smallest);
	}
}