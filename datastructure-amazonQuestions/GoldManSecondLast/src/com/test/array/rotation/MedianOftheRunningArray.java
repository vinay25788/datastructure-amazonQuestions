package com.test.array.rotation;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOftheRunningArray {
	
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	static PriorityQueue< Integer> minHeap = new PriorityQueue<>();
	
	public static void add(int a)
	{
		maxHeap.offer(a);
		minHeap.offer(maxHeap.poll());
		if(maxHeap.size()<minHeap.size())
			maxHeap.offer(minHeap.poll());
	}
	
	public static double findMedian()
	{
		double result=0d;
		if(maxHeap.size()==minHeap.size())
		{
			result = (maxHeap.peek()+minHeap.peek())/2;
			
		}
		else
		{
			result = maxHeap.peek();
		}
		return result;
	}
	
	public static void main(String[] args) {
		int a[]= {5, 15, 10, 20, 3};
		for(int el:a)
		{
			add(el);
			System.out.println(findMedian());
		}
		
	}

}
