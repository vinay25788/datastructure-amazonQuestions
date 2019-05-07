package com.practise.stringprogram.basic;

public class SubStringStartAndEndsWith1 {
	
	public static void main(String[] args) {
		String str = "00100101"; 
		System.out.println(" Number of SubString -->"+findSubString(str));
	}
	
	public static int findSubString(String st)
	{
		int count=0;
		
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i) == '1')
				count++;
		}
		
		return count*(count-1)/2;
	}

}
