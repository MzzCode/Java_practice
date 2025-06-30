package com.interview.question2025;

import java.util.Arrays;

public class AnagramUsingSorting {
	
	public static boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		char sArr[] = s.toCharArray();
		char tArr[] = t.toCharArray();
		
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		
		return Arrays.equals(sArr, tArr);
		
	}
	
	public static void main(String args[]) {
		
		String s = "car";
		String t = "ra";
		
		System.out.println("Is Anagrma: "+isAnagram(s, t));
	}

}
