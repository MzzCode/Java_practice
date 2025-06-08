package com.interview.question2025;

public class ValidPalindrome {
    public static void main(String args[]) {

        // Step 1: string to be checked for palindrome
        String str1 = "A man, a Plan, a canal: Panama";
        
        	// String str1 = " race a car ";
		
     		// String str1 = "race car";
     		
     		// String str1 = "";

        //step 2: Convert the string to lowercase to make it case-insensitive
        str1 = str1.toLowerCase();

        //step 3: Convert the string to a character array for easier iteration
        char arr[] = str1.toCharArray();

        // Step 4: Create a new string to store only alphanumeric characters
        String str2 = "";

        // step 5: for each loop to filter out alphanumeric number
        for (char c : arr) {
            if (Character.isLetterOrDigit(c)) {
                str2 = str2 + c; // Append valid character to str2
            }
        }

        // Step 3: Find the length of the cleaned string
        int length = str2.length();

        // Create a new string to store the reversed version of the cleaned string
        String str3 = "";

        // Step 4: Reverse the cleaned string using a loop
        for (int i = length - 1; i >= 0; i--) {
            str3 = str3 + str2.charAt(i); 
        }

        // Step 5: Compare both string
        if (str2.equals(str3)) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
