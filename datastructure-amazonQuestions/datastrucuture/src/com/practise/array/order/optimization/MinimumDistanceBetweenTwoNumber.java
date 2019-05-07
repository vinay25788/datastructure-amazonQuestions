package com.practise.array.order.optimization;

public class MinimumDistanceBetweenTwoNumber {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,3};
		findMin(a,a.length-1,3,7);
	}
	
	public static void findMin(int[] a,int n,int x,int y)
	{
		
		int prev=0;
		
		int i=0;
		for(i =0;i<=n;i++)
		{
			if(a[i] == x || a[i] == y)
			{
				prev = i;
				i++;
				break;
			}
		}
		
		int minDistance=Integer.MAX_VALUE;
		for(;i<=n;i++)
		{
			if(a[i] == x|| a[i] == y)
			{
				if(a[prev] !=  a[i ] && Math.abs((prev-i))<minDistance)
				{
					minDistance = Math.abs(prev -i);
					prev = i;
				}
				else
					prev = i;
			}
			
			
		}
		
		System.out.println( minDistance);
	}
	
}
