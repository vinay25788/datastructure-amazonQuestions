package com.src.dynamicprogramming;

public class LongestCommonSubSequence {
	public static void main(String[] args) {
		String a="abcdaf";
		String b="acbcf";
		System.out.println(longestCommon(a,b));
	}
	
	public static int longestCommon(String a,String b)
	{
		int[][] dp=new int[b.length()+1][a.length()+1];
		
		for(int i=1;i<=b.length();i++)
		{
			for(int j=1;j<=a.length();j++)
			{
				if(b.charAt(i-1) == a.charAt(j-1))
				{
					dp[i][j] = dp[i-1][j-1]+1;
				}
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		StringBuffer sb = new StringBuffer();
		int i=b.length();
		int j=a.length();
		
		while(i>0 && j>0)
		{
			
			
				if(dp[i][j] != dp[i-1][j] && dp[i][j]  != dp[i][j-1])
				{
					sb.append(a.charAt(j-1));
					i=i-1;
					j=j-1;
				}
				else if(dp[i][j] == dp[i-1][j])
					{
					i = i-1;
					}
				else if (dp[i][j] == dp[i][j-1])
					{
					j= j-1;
					}
				/*else
				{
					sb.append(a.charAt(j-1));
					i=i-1;
					j=j-1;
				
				}*/
		}
		System.out.println(sb);
		return dp[b.length()][a.length()];
	}

}
