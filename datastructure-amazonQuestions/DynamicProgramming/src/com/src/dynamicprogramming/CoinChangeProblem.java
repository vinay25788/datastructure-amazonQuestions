package com.src.dynamicprogramming;

public class CoinChangeProblem {

	public static void main(String[] args) {
		int[] a= {1,5,6,8};
		int givenSum=11;
		System.out.println(" find number of minmum coin -->"+coin(a,givenSum));
	}
	
	public static int coin(int[] a,int givenSum)
	{
		int[][] dp = new int[a.length][givenSum+1];
		for(int i=0;i<a.length;i++)
			dp[i][0] = 0;
		for(int i=1;i<=givenSum;i++)
		{
			if(i>=a[0])
			{
				int coin = i/a[0];
				dp[0][i] = coin;
			}
		}
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<=givenSum;j++)
			{
				if(j>=a[i])
				{
					dp[i][j]=Math.min(dp[i-1][j], dp[i][j-a[i]]+1);
					
				}
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		return dp[a.length-1][givenSum];
	}
}
