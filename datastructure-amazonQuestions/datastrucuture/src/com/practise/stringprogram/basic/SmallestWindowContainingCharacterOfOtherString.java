package com.practise.stringprogram.basic;

public class SmallestWindowContainingCharacterOfOtherString {
	
	public static void main(String[] args) {
		String st1= "this is vinay";
		String pat = "yaniv";
		String sub = findSubString(st1,pat);
		if(sub.isEmpty() == false)
		System.out.println(" substring -->"+sub);
		else
			System.out.println(" no window exist ");
	}
	
	public static String findSubString(String st1,String pat)
	{
		int len1= st1.length();
		int len2 = pat.length();
		
		if(len1<len2)
		{
			System.out.println(" no window exist ");
			return "";
		}
		
		int hash_str[] = new int[256];
		int hash_pat[]= new int[256];
		
		for(int i=0;i<pat.length();i++)
		{
			hash_pat[pat.charAt(i)]++;
		}
		
		int start=0,count=0;
		int startIndex=-1;
		int minLenght = Integer.MAX_VALUE;
		
		for(int i=0;i<st1.length();i++)
		{
			hash_str[st1.charAt(i)]++;
			
			if(hash_pat[st1.charAt(i)] !=0 && hash_str[st1.charAt(i)]<= hash_pat[st1.charAt(i)])
				count++;
			
			if(count == len2)
			{
				while(hash_str[st1.charAt(start)]> hash_pat[st1.charAt(start)] || hash_pat[st1.charAt(start)] == 0)
					{
					
					if(hash_str[st1.charAt(start)]> hash_pat[st1.charAt(start)])
						hash_str[st1.charAt(start)]--;
					
					start++;
					}						
				int len_window = i-start+1;
				if(minLenght > len_window)
				{
					minLenght = len_window;
					startIndex = start;
				}	
				
			}
			
			
		}
		
		if(startIndex == -1)
		{
			return "";
		}
		
		return st1.substring(startIndex, startIndex+minLenght);
		
		
	}

}
