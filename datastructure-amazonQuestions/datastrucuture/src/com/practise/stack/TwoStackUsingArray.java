package com.practise.stack;

public class TwoStackUsingArray {
	
	int a[];
	int size;
	int top1=-1,top2;
	
	public TwoStackUsingArray(int size	) {
		top1=-1;
		top2 = size;
		a= new int[size];
		this.size = size;
	}
	
	public void push1(int data)
	{
		if(top1 < top2 -1)
		{
			a[++top1] = data;
			
		}
		else
		{
			System.out.println("stack is full");
		}
	}
	
	public void push2(int data)
	{
		if(top1 <top2 -1)
		{
			a[--top2] = data;
		}
		else
			System.out.println(" stack 2 is full ");
		
	}
	
	public void pop1()
	{
		if(top1 < 0)
			System.out.println(" stack1 is empty ");
		else
		{
			System.out.println(a[top1--]);
		}
	}
	
	public void pop2()
	{
		if(top2<size)
		{
			System.out.println(a[top2++]);
		}
		else
		{
			System.out.println(" stack2 is empty ");
		}
	}
	
	public static void main(String[] args) {
		TwoStackUsingArray obj = new TwoStackUsingArray(6);
		obj.push1(1);
		obj.push1(2);
		obj.push1(3);
		obj.push1(4);
		obj.push2(5);
		obj.push2(6);
		obj.push2(7);
		obj.push2(8);
		
		obj.pop1();
		obj.pop1();
		obj.pop1();
		obj.pop1();
		obj.pop1();
		obj.pop1();
		obj.pop1();
		obj.pop1();
		obj.pop2();
		obj.pop2();
		
		obj.pop2();
		obj.pop2();
		obj.pop2();
		obj.pop2();
		
		
		
	}
}
