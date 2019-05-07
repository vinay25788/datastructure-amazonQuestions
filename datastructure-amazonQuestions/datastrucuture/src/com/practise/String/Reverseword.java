package com.practise.String;

public class Reverseword {
	public static void main(String[] args) {
		String st=" i love programming in java";
		reverse(st);
		String s = " vinay kumar ";
		reverString(s);
	}
	public static void reverse(String st)
	{
		String[] s= st.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
			System.out.print(s[i]+" ");
	}
	
	public static void reverString(String s)
	{
		int l=0,r=s.length()-1;
		char[] ch = s.toCharArray();
		while(l<r)
		{
			char temp = ch[l];
			ch[l] = ch[r];
			ch[r] = temp;
			l++;
			r--;
		}
		
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);
	}

}
