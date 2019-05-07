package com.src.dynamicprogramming;

public class SubsetSumProblem {

	public static void main(String[] args) {
		int[] a= {2,3,7,8,10};
		int givenSum=11;
		System.out.println(" subset sum is present true or false-->"+subsetSum(a,givenSum));
	}
	public static boolean subsetSum(int[] a,int givenSum)
	{
		boolean[][] dp = new boolean[a.length][givenSum+1];
		for(int i=0;i<a.length;i++)
			dp[i][0] = true;
		
		for(int i=0;i<=givenSum;i++)
		{
			if(a[0]==i)
				dp[0][i] = true;
		}
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<=givenSum;j++)
			{
				if(j<a[i])
					dp[i][j] = dp[i-1][j];
				else
					dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i]];
			}
		}
		
		
		return dp[a.length-1][givenSum];
	}
}
