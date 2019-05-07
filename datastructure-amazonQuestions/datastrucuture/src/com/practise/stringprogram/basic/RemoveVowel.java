package com.practise.stringprogram.basic;

/*import java.util.Arrays;
import java.util.List;

public class RemoveVowel {
	public static void main(String[] args) {
		String st = "this is vinay kumaro";
		String removed = removeVowel(st);
		System.out.println(" "+removed);
	}

	public static String removeVowel(String st)
	{
		Character vowel[]= {'a','e','i','o','u'};
 		List<Character> list = Arrays.asList(vowel);
		
		StringBuffer sb = new StringBuffer(st);
		
		for(int i=0;i<sb.length();i++)
		{
			if(list.contains(st.charAt(i)))
			{
				sb.replace(i, i+1, "");
				i--;
			}
		}
		
		return sb.toString();
	}
}
*/
//Java program to remove vowels from a String 

import java.util.Arrays; 
import java.util.List; 

public class RemoveVowel 
{	 
	static String remVowel(String str) 
	{ 
		Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
		
		List<Character> al = Arrays.asList(vowels); 
		
		StringBuffer sb = new StringBuffer(str); 
		
		for (int i = 0; i < sb.length(); i++) { 
			
			if(al.contains(sb.charAt(i))){ 
				sb.replace(i, i+1, "") ; 
				i--; 
			} 
		} 
		
		
		return sb.toString(); 
	} 
	// Driver method to test the above function 
	public static void main(String[] args) 
	{ 
		String str = "this is vinay kumar"; 
		
		System.out.println(remVowel(str)); 
	} 
} 
