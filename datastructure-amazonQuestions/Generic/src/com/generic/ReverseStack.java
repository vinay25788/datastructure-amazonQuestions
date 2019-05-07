package com.generic;

import java.util.Stack;

public class ReverseStack {
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
	 reverse(st);
	 System.out.println(st);
	}
	public static void reverseUtil(Stack<Integer> st,int x)
	{
		if(st.size() ==0)
			{
			st.push(x);
			return;
			}
		if(st.size()!=0)
		{
			int y=st.pop();
			reverseUtil(st, x);
			st.push(y);
		}
		
	}
	public static void reverse(Stack<Integer> st)
	{
		
		if(st.size()==0)
			return ;
		int x = st.pop();
		reverse(st);
		
		reverseUtil(st,x);
	}

}
