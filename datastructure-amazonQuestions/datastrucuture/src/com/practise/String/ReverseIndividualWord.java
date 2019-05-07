package com.practise.String;

import java.util.Stack;

public class ReverseIndividualWord {

	public static void main(String[] args) {
		String st="My name is vinay";
		reverse(st);
		reverseWord(st,0,st.length()-1);
	}
	
	public static void reverseWord(String st,int start,int end)
	{
		int wstart=0,wend=0;
		for(wstart=wend=start ;wend<end;wend++)
		{
			while(st.charAt(wend) != ' '  && wend<end)
			{
				wend++;
			}
			wend--;
			reverseWordNow(st,wstart,wend);
		}
		System.out.println(" "+st);
	}
	
	public static void reverseWordNow(String st ,int l,int r)
	{
		char [] w = st.toCharArray();
		
		while(l<r)
		{
			char temp = w[l];
			w[l] = w[r];
			w[r] = temp;
			l++;
			r--;
					
		}
	}
	public static void reverse(String st)
	{
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i) !=' ')
			{
				stack.push(st.charAt(i));
			}
			else
			{
				while(stack.isEmpty() == false)
				{
					System.out.print(stack.pop());
				}
			}
			System.out.print(" ");
		}
		while (stack.empty() == false) { 
	        System.out.print(stack.pop()); 
	          
	    } 
		
	}
}
