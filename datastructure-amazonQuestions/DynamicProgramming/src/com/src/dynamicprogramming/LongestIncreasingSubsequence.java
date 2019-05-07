package com.src.dynamicprogramming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] a= {3,4,-1,0,6,2,3};
		int n=a.length;
		System.out.println(findLongestSubsequnceLengeth(a,n));
	}
	
	public static int findLongestSubsequnceLengeth(int[] a,int n)
	{
		int[] dp = new int[n];
		for(int i=0;i<n;i++)
			dp[i] = 1;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]<a[i])
				{
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<dp[i])
				max = dp[i];
		}
		return max;
	}
}
