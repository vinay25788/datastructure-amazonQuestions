package com.src.dynamicprogramming;

public class PartitionProblemSubArrayPresentWithEqualSum {
	public static void main(String[] args) {
		int[] a= {1,5,5,11};
		System.out.println(findSubArray(a));
	}
	public static boolean findSubArray(int [] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		if(sum%2 !=0)
			return false;
		
		return findSubArrayUtil(a,a.length,sum/2);
	}
	
	public static boolean findSubArrayUtil(int[] a,int n,int sum)
	{
		if(sum == 0)
			return true;
		if(n==0 && sum !=0)
			return false;
		if(a[n-1]>sum)
			return findSubArrayUtil(a, n-1, sum);
		return findSubArrayUtil(a, n-1, sum) || findSubArrayUtil(a, n-1, sum-a[n-1]);
	}
	
	public static boolean findSubArrayUsingDp(int[] a)
	{
		int n=a.length;
		int sum =0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		if(sum%2 !=0)
			return false;
		int halfSum = sum/2;
		boolean[][] T = new boolean[n][halfSum+1];
		for(int i=0;i<n;i++)
			T[i][0] = true;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(a[i]<j)
				{
					T[i][j] = T[i-1][j];
				}
				else
					T[i][j] = T[i-1][j] || T[i-1][j-a[i]];
			}
		}
		
		return T[n-1][sum];
	}
}
