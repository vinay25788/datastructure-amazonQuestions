package com.practise.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowUsingDqueue {
	public static void main(String[] args) {
		int arr[]={12, 1, 78, 90, 57, 89, 56}; 
        int k=3; 
        printMax(arr, arr.length,k); 
	}

	public static void printMax(int[] a,int n,int k)
	{
		Deque<Integer> q= new LinkedList<>();
		int i=0;
		for(;i<k;i++)
		{
			while(!q.isEmpty() && a[i] >= a[q.peekLast()])
				q.removeLast();
			q.add(i);
		}
		
		while(i<n)
		{
			System.out.print(" "+a[q.peek()]);
			
			while(!q.isEmpty() && q.peek()<= i-k)
				q.removeFirst();
			while(!q.isEmpty() && a[q.peekLast()] <= a[i])
				q.removeLast();
			q.addLast(i);
			i++;
		}
		
		System.out.println(" "+a[q.peek()]);
		
	}
}
