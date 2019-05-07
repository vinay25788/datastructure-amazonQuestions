package src.stringquestion.copystring.customTreadpool;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianOfRunningIntegerINStream {
	static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=1;i<a.length;i++)
		{
			insert(a[i]);
			findMedian();
		}
	}
	
	public static void insert(int a)
	{
		maxHeap.offer(a);
		minHeap.offer(maxHeap.poll());
		if(maxHeap.size()<minHeap.size())
		{
			maxHeap.offer(minHeap.poll());
		}
	}
	
	public static void findMedian()
	{
		if(maxHeap.size() == minHeap.size())
		{
			double d = (maxHeap.peek()+minHeap.peek())/2.0;
			System.out.println(d);
			
		}
		else
			System.out.println(maxHeap.peek());
	}
	

}
