package com.practise.array.order.optimization;

import com.sun.glass.ui.Cursor;

public class MinimumLengthSubArraySumGreaterTHanGivenValue {
	
	public static void main(String[] args) {
		 int a[] = {- 8, 1, 4, 2, -6}; 
		int givenSum = 6;
		findLength(a,a.length-1,givenSum);
	}
	
	public static void findLength(int[] a,int n,int x)
	{
		int start =0,end=0;
		int cur_sum=0;
		int minLength =n+1;
		while(end<=n)
		{
			while(cur_sum <= x && end<=n)
			{
				if(cur_sum <=0 && x>0)
				{
					start = end;
					cur_sum =0;
				}
				cur_sum += a[end++];
			}
			
			while(cur_sum >x && start<=n)
			{
				if(minLength > end-start)
				{
					minLength = end-start;
				}
				
				cur_sum -= a[start++];
			}
		}
		
		System.out.println(" min Lenght "+minLength);
	}

}
