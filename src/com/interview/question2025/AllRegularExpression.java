package com.interview.question2025;

public class AllRegularExpression {
	public static void main(String args[]) {
		
		String str1 = "Mega123 @wars25";
		
		//remove non-digit //here we are not replacing anything on non-digit value
		
		System.out.println("only digit: "+ str1.replaceAll("\\D", ""));//12325 
		
		//remove non-digit also with replacement
		System.out.println("only digit with replacement: "+ str1.replaceAll("\\D", "*"));
		
		System.out.println(str1.replaceAll("\\d", ""));  //remove digit Mega @wars 
		System.out.println(str1.replaceAll("\\w", ""));  //remove word character @
		System.out.println(str1.replaceAll("\\W", ""));  //remove non-word chars Mega123wars25
		System.out.println(str1.replaceAll("\\s", ""));  //remove spaces Mega123@wars25
		System.out.println(str1.replaceAll("\\S", "*")); //Replaces non-spaces → ******* *******
	}
}
