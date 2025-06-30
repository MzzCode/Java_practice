package com.interview.question2025;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	public static boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		s = s.toLowerCase();
		char arr[] = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char s_val :arr) {
			
			if(map.containsKey(s_val)) {
				map.put(s_val, map.get(s_val)+1);
			}
			else {
				map.put(s_val,1);
			}
		}
		
		// for t string
		
		t= t.toLowerCase();
		char tarr[] = t.toCharArray();
		
		for(char t_val : tarr) {
			
			if(map.containsKey(t_val)) {
				map.put(t_val , map.get(t_val)-1);
			}
			// Extra character found in t string so return false immediately
			// becoz we do map.containsKey(t_val)
			else{
				return false;
			}
		}
		
		// Check if all values in map are zero by using count in for each loop
		// if it's not zero so it is not an anagram
		for(int count : map.values()) {
			if(count != 0) {
				return false;
			}
			}
		return true;
	}
	public static void main(String args[]) {
		String s = "anaGram";
		String t = "GanamRa";
		
		System.out.println("Are they Anagram: " +isAnagram(s,t));
	}
}
