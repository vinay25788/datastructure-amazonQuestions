package com.practise.stack;

import java.util.Stack;

public class QueueUsingStackEnqueueOperationCostly {
	
	static class Queue
	{
		Stack<Integer> st1 = new Stack();
		Stack<Integer> st2 = new Stack<>();
		
		public void enqueue(int data)
		{
			if(st1.isEmpty() == true)
			{
				st1.push(data);
			}
			else
			{
				while( st1.isEmpty() == false)
				{
					int d = st1.pop();
					st2.push(d);
				}
				st1.push(data);
				
				while(st2.isEmpty() == false)
				{
					int d = st2.pop();
					st1.push(d);
				}
			}
		}
		
		public void dequeu()
		{
			if(st1.isEmpty() == true)
			{
				System.out.println(" empty queue ");
				return;
			}
			System.out.println(st1.pop());
					
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
		QueueUsingStackEnqueueOperationCostly obj = new QueueUsingStackEnqueueOperationCostly();
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.dequeu();
		q.dequeu();
		q.dequeu();
		q.dequeu();
		q.dequeu();
		q.dequeu();
		q.dequeu();

		q.dequeu();
		q.dequeu();
	}
}
