package com.practise.companyInterviewQuestion;

import java.util.Deque;
import java.util.LinkedList;

public class PrintMaxInGivenWindow {
	public static void main(String[] args) {
		 int a[]={12, 1, 78, 90, 57, 89, 56}; 
	        int k=3; 
	        maxInGivenWindow(a, k);
	}
	
	public static  void maxInGivenWindow(int[] a,int k)
	{
		int n = a.length;
		Deque<Integer> qi = new LinkedList<>();
		int i=0;
		
		for(;i<k;i++)
		{
			while(!qi.isEmpty() && a[i]>=a[qi.peekLast()])
				qi.removeLast();
			qi.addLast(i);
				
		}
		
		for(;i<n;i++)
		{
			System.out.println(a[qi.peek()]);
			
			while(!qi.isEmpty() && qi.peek()<= i-k)
				qi.removeFirst();
			
			while(!qi.isEmpty() && a[qi.peekLast()]<=a[i])
				qi.removeLast();
			
			qi.addLast(i);
		}
		
		System.out.println(a[qi.peek()]);
	}

}
