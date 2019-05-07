package com.src.dynamicprogramming;

public class ReverseString {
	public static void main(String[] args) {
		String s="Hello welcome to sapient";
		reveseString(s);
	}

	public static void reveseString(String s)
	{
		String[] st=s.split(" ");
		String sb="";
		for(int i=st.length-1;i>=0;i--)
			{
			sb+=st[i];
			if(i!=0)
			sb+=" ";
			}
		System.out.println(sb.toString());
				
		
	}
}
