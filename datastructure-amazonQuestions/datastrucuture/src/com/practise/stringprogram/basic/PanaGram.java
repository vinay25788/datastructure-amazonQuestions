package com.practise.stringprogram.basic;

public class PanaGram {
	
	public boolean panagram(String str)
	{
		boolean[] mark= new boolean[26];
		
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			if('A'<=str.charAt(i) && str.charAt(i)<='Z')
			{
				index = str.charAt(i)-'A';
			}
			
			else if ('a'<=str.charAt(i) && str.charAt(i)>='z')
			{
				index = str.charAt(i)-'a';
			}
			
			mark[index ] = true;
		}
		
		for(int i=0;i<mark.length;i++)
		{
			if(mark[i] == false)
				
				{
				System.out.println(i+'a');
				return false;
				}
		}
		for(int i=0;i<mark.length;i++)
		{
			if(mark[i] == false)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		String st = "this is vinay";
		PanaGram obj = new PanaGram();
		System.out.println(" passed obje is panagram or not "+obj.panagram(st));
	}
}
