package src.stringquestion.copystring.customTreadpool;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStreamOfInteger {
	
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	
	public static void insert(int a)
	{
		maxHeap.offer(a);
		minHeap.offer(maxHeap.poll());
		if(maxHeap.size()<minHeap.size())
			maxHeap.offer(minHeap.poll());
			
	}
	
	public static void median()
	{
		if(maxHeap.size() == minHeap.size())
		{
			float d= (maxHeap.peek()+minHeap.peek())/2;
			System.out.println(d);
		}
		else
		{
			System.out.println(maxHeap.peek());
		}
	}
	public static void main(String[] args) {
	int a[]= {5, 15, 10, 20, 3};
		
		for(int i:a)
		{
			insert(i);
			median();
		}
	}

}
