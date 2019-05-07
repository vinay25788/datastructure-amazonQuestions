package com.src.dynamicprogramming;

public class CuttingRodProblem {
	public static void main(String[] args) {
		 int arr[] = new int[] {2,5,7,8}; 
	        int size = 5; 
	        System.out.println("max Profit-->"+maxProfit(arr,size));
	}

	public static int maxProfit(int[] a,int size)
	{
		int[][] dp = new int[a.length][size+1];
		for(int i=0;i<a.length;i++)
			dp[i][0]=0;
		
		for(int i=1;i<=size;i++)
		{
			dp[0][i] = a[0]*i;
		}
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(j>=i+1)
				{					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-i-1]+a[i]);
					
				}
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		return dp[a.length-1][size];
	}
}
