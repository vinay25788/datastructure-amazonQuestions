package com.practise.stack;

public class StackUsingArray {
	
	int[]	a;
	int size;
	int top=-1;
	
	StackUsingArray(int size)
	{
		a = new int[size];
		this.size = size;
	}
	
	public void push(int data)
	{
		if(top == size-1)
		{
			System.out.println(" stack is full ");
		}
		else
		{
			a[++top] = data;
		}
	}
	
	public int pop()
	{
		if(top ==-1)
		{
			System.out.println(" stack is empty ");
			
		}
		
			return a[top--];
		
		
	}
	
	public static void main(String[] args) {
		
		StackUsingArray obj = new StackUsingArray(4	);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
	}

}
