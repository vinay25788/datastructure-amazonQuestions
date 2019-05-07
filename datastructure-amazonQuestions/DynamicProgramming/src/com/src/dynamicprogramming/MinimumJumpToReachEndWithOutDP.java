package com.src.dynamicprogramming;

public class MinimumJumpToReachEndWithOutDP {
	public static void main(String[] args) {
		int a[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJum(a));
	}
	public static int minJum(int a[])
	{
		int jumps =1;
		
		int maxReach= a[0];
		int steps=a[0];
		int i=0;
		int n= a.length;
		while(i<n)
		{
			maxReach = Math.min(maxReach, i+a[i]);
			if(i== n-1)
				return jumps;
			steps--;
			if(steps== 0)
			{
				jumps++;
				if(i>=maxReach)
					return -1;
				steps = maxReach-i;
			}
			i++;
		}
		
		
		
		
		return jumps;
	}
}
