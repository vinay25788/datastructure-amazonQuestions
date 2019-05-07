package com.practise.stack;

import java.util.Stack;

public class GetMinOfStackInBigO1 {
	
	int min;
	Stack<Integer> st = new Stack<>();
	
	public void push(int data)
	{
		if(st.isEmpty())
		{
		
			st.push(data);
			min =data;
		}
		else
		{
			if(data <min)
			{
				int x = 2* data - min;
				st.push(x);
				min = data;
			}
			else
			{
				st.push(min);
			}

		}
	}
	
	public void pop()
	{
		if(st.isEmpty() == true)
		{
			System.out.println(" stack is empty ");
		}
		else
		{
			int x = st.pop();
			
			if(x<min)
			{
				System.out.println(min);
				min = 2*min - x;
			}
			else
			{
				System.out.println(min);
			}
		}
	}
	
	public void min()
	{
		System.out.println(min);
	}
	public static void main(String[] args) {
		GetMinOfStackInBigO1 obj = new GetMinOfStackInBigO1();
		obj.push(5);
		obj.push(4);
		obj.push(3);
		obj.push(2);
		obj.push(1);

		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
	}

}
