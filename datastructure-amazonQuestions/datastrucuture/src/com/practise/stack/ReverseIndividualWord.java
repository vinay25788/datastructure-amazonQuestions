package com.practise.stack;

import java.util.Stack;

public class ReverseIndividualWord {
	
	public void reverse(String str)
	{
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
			{
				st.push(str.charAt(i));
				
			}
			else
			{
				while(st.isEmpty() == false)
					System.out.print(st.pop());
				System.out.print(" ");
			}
			
		}
		
		while(st.isEmpty() == false)
			System.out.print(st.pop());
	}
	public static void main(String[] args) {
		String st ="vinay kumar";
		ReverseIndividualWord obj = new ReverseIndividualWord();
		obj.reverse(st);
	}

}
