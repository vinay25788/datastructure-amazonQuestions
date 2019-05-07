package com.practise.arrayRotations;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximumK {
	public static void main(String[] args) {
		 int arr[]={12, 1, 78, 90, 57, 89, 56}; 
		 
		 max(arr,3);
	}
	public static void max(int[] a,int k)
	{
		Deque<Integer> q = new LinkedList<>();
		int i=0;
		for( i=0;i<k;i++)
		{
			while(q.isEmpty() == false && a[q.peekLast()]<=a[i])
			{
				q.removeLast();
			}
			q.addLast(i);
		}
		int n=a.length;
		while(i<n)
		{
			System.out.print(" "+a[q.peek()]);
			while(q.isEmpty() == false && q.peek()<=i-k)
				{
				q.removeFirst();
				
				}
			while(q.isEmpty()== false && a[q.peekLast()]<=a[i])
				q.removeLast();
			q.addLast(i);
			i++;
		}
		
		System.out.print(" "+a[q.peek()]);
	}

}
