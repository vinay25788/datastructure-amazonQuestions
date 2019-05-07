package com.src.dynamicprogramming;

public class KnapSackProblem01
{
	public static void main(String[] args) {
		int weight[]= {1,3,4,5};
		int value[]= {1,4,5,7};
		int givenWeight=7;
		System.out.println(maxValue(weight,value,givenWeight));
	}
	public static int maxValue(int w[],int[] v,int given)
	{
		int[][] dp= new int[w.length][given+1];
		
		for(int i=1;i<=given;i++)
		{
			if(i>=w[0])
			{
				dp[0][i] = w[0];
			}
		}
		
		for(int i=1;i<w.length;i++)
		{
			for(int j=1;j<=given;j++)
			{
				if(j<w[i])
				{
					dp[i][j] = dp[i-1][j];
				}
				else
				{
					dp[i][j] = Math.max(v[i]+dp[i-1][j-w[i]], dp[i-1][j]);
				}
			}
		}
		return dp[w.length-1][given];
	}
}
