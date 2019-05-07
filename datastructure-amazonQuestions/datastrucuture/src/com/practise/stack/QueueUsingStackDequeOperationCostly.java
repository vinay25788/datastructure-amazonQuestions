package com.practise.stack;

import java.util.Stack;

import com.practise.stack.QueueUsingStackEnqueueOperationCostly.Queue;

public class QueueUsingStackDequeOperationCostly {
	
	static class Queue
	{
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		
		public void enqueue(int data	)
		{
			st1.push(data);
			
		}
		
		public void dequeue()
		{
			if(st1.isEmpty() == true && st2.isEmpty() == true)
			{
				System.out.println(" queue is emmpty ");
				return;
			}
			
			else
			{
				if(st1.isEmpty()== false)
				{
					while(st1.isEmpty() == false)
					{
						int d = st1.pop();
						st2.push(d);
					}
					
					System.out.println( st2.pop());
					//return;
				}
				else
				{
					System.out.println(st2.pop());
				}
				
				
				
			}
		}
		
		public static void main(String[] args) {
			Queue q = new Queue();
			q.enqueue(1);
			q.enqueue(2);
			q.enqueue(3);
			q.enqueue(4);
			
			q.enqueue(5);
			q.enqueue(6);
			q.enqueue(7);
			q.enqueue(8);
			q.dequeue();
			q.dequeue();
			q.dequeue();
			q.dequeue();
			q.dequeue();
			q.dequeue();
			q.dequeue();q.dequeue();
			
			q.enqueue(11);
			q.enqueue(12);
			q.enqueue(13);
			q.enqueue(14);
			q.dequeue();
			q.dequeue();
			q.dequeue();
			q.dequeue();
			
		}
	}

}
