package com.practise.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePushOperationCostly {
	
	public static class Stack
	{
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		
		int size ;
		public void push(int data)
		{
			size++;
			
			while(!q1.isEmpty())
			{
				q2.add(q1.poll());
			}
			q1.add(data);
			
			while(!q2.isEmpty())
			{
				q1.add(q2.poll());
			}
		}
		
		public void pop()
		{
			if(q1.isEmpty())
			{
				System.out.println(" stack is empty ");
			}
			else{
				System.out.println(q1.poll());
			}
		}

	}
	
	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
	}
	
	

}
