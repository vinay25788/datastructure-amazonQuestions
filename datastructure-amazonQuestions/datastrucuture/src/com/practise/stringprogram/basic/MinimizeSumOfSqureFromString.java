package com.practise.stringprogram.basic;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimizeSumOfSqureFromString {

	static class DesComparator implements Comparator<Integer>
	{

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			
			if(o1>o2)
				return -1;
			else if (o1<o2)
			return 1;
			else
				return 0;
			
		}
		
	}
	
	public static void main(String[] args) {
		String str = "abbccc";   // Input 1 
        int k = 2; 
        removeKElement(str, k); 
       
        str = "aaab";           // Input 2 
        k = 2; 
        removeKElement(str, k); 
	}
	
	
	public static void removeKElement(String str,int k)
	{
		
		Comparator<Integer> c = new DesComparator();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(c); 
		
		int[] charA = new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			charA[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<charA.length;i++)
		{
			if(charA[i] !=0)
				pq.add(charA[i]);
		}
		
		while(k>0)
		{
			int temp = pq.peek();
			pq.poll();
			temp = temp-1;
			pq.add(temp);
			k--;
		}
		
		int sum=0;
		while(pq.isEmpty() == false)
		{
			int temp = pq.peek();
			pq.poll();
		 sum += temp*temp;
		 
		}
		System.out.println(" result "+sum);
	}
}
