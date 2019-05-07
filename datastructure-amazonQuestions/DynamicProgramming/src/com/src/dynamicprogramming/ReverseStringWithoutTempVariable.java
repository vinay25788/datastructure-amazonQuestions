package com.src.dynamicprogramming;

public class ReverseStringWithoutTempVariable {
	public static void main(String[] args) {
		String a="vinay";
		int start =0;
		int last=a.length()-1;
		char[] ch = a.toCharArray();
		int len = ch.length;
		for(int i = 0; i < len/2; i++) {
			
		}
		while(start<last)
		{
			ch[start]^=ch[last];
			ch[last]^=ch[start];
			ch[start]^=ch[last];
			start++;
			last--;
		}
		System.out.println(String.valueOf(ch));
	}
	

}
