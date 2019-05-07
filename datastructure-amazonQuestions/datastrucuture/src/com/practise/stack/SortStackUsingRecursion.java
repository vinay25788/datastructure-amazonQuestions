package com.practise.stack;

import java.util.Stack;

public class SortStackUsingRecursion {

	
	Stack<Integer> st = new Stack<>();
	
	SortStackUsingRecursion(Stack<Integer> st)
	{
		this.st = st;
	}
	
	public void sortStack()
	{
		if(st.isEmpty() == false)
		{
			int x = st.pop();
			sortStack();
			sortInsert(x);
		}
	}
	
	public void sortInsert(int x)
	{
		if(st.isEmpty() == true || st.peek() < x)
		{
			st.push(x);
		}
		else
		{
			int a = st.pop();
			sortInsert(x);
			st.push(a);
		}
	}
	
	public void print()
	{
		while(st.isEmpty()== false)
			System.out.println(st.pop());
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(5);
		st.push(4);
		st.push(20);
		st.push(2);
		SortStackUsingRecursion obj = new SortStackUsingRecursion(st);
		obj.sortStack();
		obj.print();
	}
}
