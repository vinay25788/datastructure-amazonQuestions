package com.practise.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingSingleQueue {
	

	static class Stack
	{
		int size;
		Queue<Integer> q = new LinkedList<Integer>();
		
		public void push(int data)
		{
			size = q.size();
			q.add(data);
			for(int i=0;i<size;i++)
			{
				q.add(q.poll());
			}
		}
		
		public void pop()
		{
			if(q.size() == 0)
				System.out.println(" stack is empty ");
			else
			System.out.println(q.poll());
		}
	}
	
	public static void main(String[] args) {
		Stack  obj = new Stack();
		
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
	}
}
























