package com.src.dynamicprogramming;

public class EggDroppingProblem {

	public static void main(String[] args) {
		int floor = 6;
		int egg = 2;
		System.out.println(findMinimumAttemp(floor,egg));
	}
	public static int findMinimumAttemp(int floor,int egg)
	{
		int[][] dp = new int[egg+1][floor+1];
		for(int i=1;i<=floor;i++)
		{
			
			dp[1][i]=i;
		}
		
		for(int i=0;i<=egg;i++)
			dp[i][0] =0;
		
		for(int i=2;i<=egg;i++)
		{
			for( int j=1;j<=floor;j++)
			{
				dp[i][j] = Integer.MAX_VALUE;
				for(int k=1;k<=j;k++)
				{
					if(i>j)
						dp[i][j] = dp[i-1][j];
					else
					{
						int c = 1+Math.max(dp[i-1][k-1], dp[i][j-k]);
						if(c<dp[i][j])
							dp[i][j] = c;
						
					}
				}
			}
		}
		
		
		
		return dp[egg][floor];
	}
}
