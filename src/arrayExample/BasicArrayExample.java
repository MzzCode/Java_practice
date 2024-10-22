package arrayExample;

public class BasicArrayExample {
	
	public static void main(String args[]) {
//		dataType Arrayname = new Datatype [Size_of _Array]
		int arr[] = new int[6];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 12;
		arr[3] = 14;
		arr[4] = 20;
		arr[5] = 20;
		for(int i=0; i<arr.length; i++){
			System.out.println("Element in the array at index "+i+ " : "+arr[i]);
		}
		
	}

}
