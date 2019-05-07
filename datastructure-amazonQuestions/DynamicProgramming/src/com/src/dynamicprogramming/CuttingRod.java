package com.src.dynamicprogramming;

public class CuttingRod {
	public static void main(String[] args) {
		int[] a= {3,5,8,9,10,20,22,25};
		int length = 4;
		//int[] a= {2,3,4,5,6};
		//int length = 6;
		System.out.println(findProfit(a,length));
	}
	
	public static int findProfit(int[] a,int length)
	{
		int[][] dp = new int[a.length+1][length+1];
		
		for(int i=1;i<=length;i++)
		{
			dp[1][i] = a[0]*i;
		}
		for(int i=2;i<=a.length;i++)
		{
			for(int j=1;j<=length;j++)
			{
				if(j<i)
				{
					dp[i][j] = dp[i-1][j];
				}
				else
				{
					dp[i][j] = Math.max(dp[i-1][j],a[i-1]+dp[i][j-i]);
				}
			}
		}
		return dp[a.length][length];
	}

}
