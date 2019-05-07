package main.java.ecs.impl;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	
	public static void main(String[] args) {
		int arr[]={12, 1, 78, 90, 57, 89, 56}; 
        int k=3; 
        printMax(arr, arr.length,k); 
	}
	
	public static void printMax(int[] a,int n,int k)
	{
		Deque<Integer> qi = new LinkedList<>();
		int i=0;
		for( i=0;i<k;i++)
		{
			while(!qi.isEmpty() && a[i]>=a[qi.peekLast()])
			{
				qi.removeLast();
			}
			qi.addLast(i);
		}
		
		for(;i<n;i++)
		{
			System.out.print(a[qi.peek()]+" ");
			while(!qi.isEmpty() && qi.peek() <= i-k)
			{
				qi.removeFirst();
			}
			
			while(!qi.isEmpty() && a[i]>= a[qi.peekLast()])
				qi.removeLast();
			qi.addLast(i);
		}
		
		System.out.print(a[qi.peek()]);
	}

}
