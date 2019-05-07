package com.practise.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePOPOperationCostly {

	public static class Stack {
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();

		int size;

		public void push(int data) {
			q1.add(data);
		}

		public void pop() {
				while (q1.size() !=1) {
					q2.add(q1.poll());
				}
				System.out.println(q1.poll());
			Queue<Integer> temp = q2;
			q2 = q1;
			q1 = temp;
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
