package com.src.dynamicprogramming;

public class LongestPallindromSubsequence {

	public static void main(String[] args) {
		String a="agbdba";
		System.out.println(findLength(a));
	}
	public static int findLength(String a)
	{
		int[][] dp = new int[a.length()][a.length()];
		for(int i=0;i<a.length();i++)
		{
			dp[i][i] =1;
			
		}
		
		for(int l=2;l<=a.length();l++)
		{
			for(int i=0;i<a.length()-l+1;i++)
			{
				int j=i+l-1;
				
				if(a.charAt(i) == a.charAt(j))
				{
					dp[i][j] = 2+dp[i+1][j-1];
				}
				else
				{
					dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
				}
				
			}
		}
		
		return dp[0][a.length()-1];
	}
}
