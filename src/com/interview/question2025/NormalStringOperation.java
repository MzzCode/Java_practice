package com.interview.question2025;

public class NormalStringOperation {
	
	public static void main(String args[]) {
		
		String str1 = "A man, a Plan, a canal: Panama";
		
		System.out.println("String: " +str1);
		
		// convert string to character array
		
		char ch[] = str1.toCharArray();
		for(char c :ch) {
		
		//Character.isLetterOrDigit() to filter out only letters and digits	
		
			if(Character.isLetterOrDigit(c)) {
				System.out.print(c);
			}
		}
		
		
	}

}
