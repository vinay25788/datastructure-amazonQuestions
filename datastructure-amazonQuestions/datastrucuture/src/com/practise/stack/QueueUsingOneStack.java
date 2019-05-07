package com.practise.stack;

import java.util.Stack;

import com.practise.stack.QueueUsingStackDequeOperationCostly.Queue;

public class QueueUsingOneStack {
	
	static class Queue
	{
		Stack<Integer> st = new Stack<>();
		
		public void enqueue(int data)
		{
			st.push(data);
		}
		
		public void dequeue()
		{
			dequeueUtil(st);
		}
		public void dequeueUtil(Stack st)
		{
			if(st.isEmpty() == true)
			{
				System.out.println(" no element ");
				return;
			}
			else if(st.size() == 1)
			{
				System.out.println(st.pop());
			}
			else
			{
				int x = (int) st.pop();
				
			 dequeueUtil(st);
				
			 st.push(x);
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
