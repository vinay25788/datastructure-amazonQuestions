package com.src.datastructure.matrix;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] a= {4,2,1,10,11,15,30};
		window(a,3);
	}
	public static void window(int[] a,int k)
	{
		Deque<Integer> q = new LinkedList<>();
		int i=0;
		for( i=0;i<k;i++)
		{
			while(q.isEmpty() == false && a[i]>a[q.peek()] )
				q.removeFirst();
			q.add(i);
		}
		
		while(i<a.length)
		{
			System.out.print(" "+a[q.peek()]);
			while(q.isEmpty() == false && q.peek()<= i-k)
				q.removeFirst();
			while(q.isEmpty() ==false && a[q.peekLast()]<=a[i])
				q.removeLast();
			q.addLast(i);
			i++;
		}
	}
}








