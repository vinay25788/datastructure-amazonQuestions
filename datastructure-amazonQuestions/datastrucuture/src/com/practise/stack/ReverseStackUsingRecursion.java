package com.practise.stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {

	Stack<Integer> st = new Stack<>();
	
	public void reverse()
	{
		if(st.isEmpty() == true)
			return;
		else
		{
			int x = st.pop();
			reverse();
			insertAtBottom(x);
		}
	}
	
	public void insertAtBottom(int x)
	{
		if(st.isEmpty() == true)
			st.push(x);
		else
		{
			int a = st.pop();
			insertAtBottom(x);
			st.push(a);
		}
	}
	
	public void print()
	{
		while(st.isEmpty() == false)
			System.out.println(st.pop());
	}
	
	public static void main(String[] args) {
		ReverseStackUsingRecursion obj = new ReverseStackUsingRecursion();
		obj.st.push(1);
		obj.st.push(2);
		obj.st.push(3);
		obj.st.push(4);
		obj.st.push(5);
		obj.reverse();
		obj.print();
	}
}
