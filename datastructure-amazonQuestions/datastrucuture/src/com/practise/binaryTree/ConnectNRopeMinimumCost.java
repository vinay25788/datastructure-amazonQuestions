package com.practise.binaryTree;

import java.util.PriorityQueue;

public class ConnectNRopeMinimumCost {
	
	public static void main(String[] args) {
		 int len[] = {4, 3, 2, 6}; 
		 connectCost(len);
	}
	
	public static void connectCost(int[] a)
	{
		int n = a.length;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++)
			pq.add(a[i]);
		
		int first =0,second=0,sum=0;
		
		while(pq.size()>1)
		{
			first = pq.poll();
			second = pq.poll();
			sum += first+second;
			pq.add(first+second);
		}
		
		System.out.println(sum);
		
	}

}
