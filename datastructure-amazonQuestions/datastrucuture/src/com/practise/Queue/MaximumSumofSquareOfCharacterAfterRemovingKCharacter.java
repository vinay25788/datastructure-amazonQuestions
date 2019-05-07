package com.practise.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class CustomComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a>b?-1:1;
	}
	
}
public class MaximumSumofSquareOfCharacterAfterRemovingKCharacter {
	
	public static  void calculateSumOfSquare(String str,int k)
	{
		if(k>str.length())
			{
			System.out.println(" sum is not possible");
			return;
			}
		int[] ch= new int[26];
		for(int i=0;i<str.length();i++)
		{
			ch[str.charAt(i)-'a']++;
		}
		
		CustomComparator obj = new CustomComparator();
		PriorityQueue<Integer> pq = new PriorityQueue<>(obj);
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] !=0)
				pq.add(ch[i]);
		}
		
		for(int i=0;i<k;i++)
		{
			int temp = pq.peek();
			pq.remove();
			temp--;
			pq.add(temp);
		}
		int result=0;
		while(pq.isEmpty() == false)
		{
			int temp = pq.peek() * pq.peek();
			result+= temp;
			pq.poll();
		}
		System.out.println("result "+result);
	
	}
	public static void main(String[] args) {
		String str = "abbccc";   // Input 1 
        int k = 2; 
        calculateSumOfSquare(str, k); 
	}
}
