package com.practise.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class TestSubString {

	// Returns true if x is vowel.
	static boolean isVowel(char x) {
		// Function to check whether a character is
		// vowel or not
		return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');
	}

	// Function to FindSubstrings of string
	static void findSubstring(String str) {
		HashSet<Character> hash = new LinkedHashSet<Character>();
		List<Character> list = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		// To store vowels
		int count = 0;
		int start = 0;
		int startIndext = 0;
		char ch=' ';
		boolean check = false;
		int mapElement=0;
		for (int i = 0; i < str.length(); i++) {
			// If current character is vowel then
			// insert into hash ,
			if (isVowel(str.charAt(i)) == true) {
				hash.add(str.charAt(i));
				list.add(str.charAt(i));
				if (map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), 1 + map.get(str.charAt(i)));
				} else
					map.put(str.charAt(i), 1);
				// If all vowels are present in current
				// substring
				
				while (hash.size() == 5) {
					
					for (Map.Entry<Character, Integer> entry : map.entrySet()) {
						int val = entry.getValue();
							
						if (mapElement == map.size()) {
							check = false;
							ch = entry.getKey();
							hash.remove(entry.getKey());
							break;
						}
						if(val>1)
						map.put(entry.getKey(), val-1);
						mapElement++;
					}
					if (!check)
						{
						check=true;
						count++;
						}
				}
				if(!check)
					{
					hash.add(ch);
					mapElement=0;
					}
				} else {
					start = i + 1;
					hash.clear();
					startIndext = i + 1;
					map.clear();
				}
			
		}
		System.out.println(count);
	}

	// Driver Code
	public static void main(String[] args) {
		//String str = "aeoibsddaeiouudb";
		String st = "aeeiouxa";
		//String sb = "aeioaexaaeuiou";
		findSubstring(st);
	}

}
