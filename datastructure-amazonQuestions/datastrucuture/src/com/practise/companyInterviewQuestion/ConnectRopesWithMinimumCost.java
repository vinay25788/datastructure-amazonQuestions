package com.practise.companyInterviewQuestion;

import java.util.PriorityQueue;

public class ConnectRopesWithMinimumCost {
	
	public static void main(String[] args) {
		 int a[] = {4, 3, 2, 6}; 
		 minumumCost(a);
	}
	
	public static  void minumumCost(int[] a)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<a.length;i++)
			pq.add(a[i]);
		
		int res =0;
		
		while(pq.size()>1)
		{
			int p = pq.poll();
			int q = pq.poll();
			res += p+q;
			pq.add(p+q);
		}
		
		System.out.println(res);
	}

}
