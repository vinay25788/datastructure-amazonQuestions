package com.practise.binarySearchTree.heapdatastructure;

import java.util.PriorityQueue;

public class ConnectingNRopesWithMinimumCost {
	public static void main(String[] args) {
		 int len[] = {14, 3, 8, 6,5}; 
		    int size = len.length; 
		    System.out.println("Total cost for connecting"+ 
		                " ropes is " + minCost(len, size)); 
		    System.out.println("Total cost for connecting"+ 
	                " ropes is " + minProduct(len, 3)); 
	}
	
	public static int minCost(int[] len,int size)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int sum =0;
		for(int i=0;i<len.length;i++)
		{
			pq.add(len[i]);
			
		}
		
		while(pq.size()>1)
		{
			int a= pq.poll();
			int b= pq.poll();
			sum = a+b;
			pq.add(sum);
		}
		
		return sum;
	}

	public static int minProduct(int[] len,int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int sum =1;
		for(int i=0;i<len.length;i++)
		{
			pq.add(len[i]);
			
		}
		
		int count=0;
		while(pq.isEmpty() == false && count<k)
		{
			int a= pq.poll();
			sum = sum* a;
			count++;
		}
		
		return sum;
	}
}
