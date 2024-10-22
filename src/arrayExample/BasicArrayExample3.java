package arrayExample;

public class BasicArrayExample3 {
	public static void main(String args[]) {
		
		String StringArray[] = {"Mega", "Sega", "Chega", "Bega", "Fega"};
		
		/*
		StringArray[0] = "Mega";
		StringArray[1] = "Sega";
		StringArray[2] = "Chega";
		StringArray[3] = "Bega";
		StringArray[4] = "Fega";
		*/ 
		
		// for printing index in enhanced for loop we manually create index variable.
		int index = 0;
		
		// iterate using enhanced for loop (Variable_Name : ArrayName)
		
		for(String Name : StringArray) {
			System.out.println("you String array is at " +index+ ": "  +Name);
			index++;
		}
		
		
	}
	

}
