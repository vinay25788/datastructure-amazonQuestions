package com.practise.companyInterviewQuestion;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		 String s1 = "AGGTAB"; 
		    String s2 = "GXTXAYB"; 
		    System.out.println(lis(s1.toCharArray(),s2.toCharArray()));
	}
	
	public static int lis(char[] x,char[] y)
	{
		int m = x.length;
		int n = y.length;
		
		int lis[][] = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0)
					lis[i][j] =0;
				else if(x[m-1] == y[n-1])
					lis[i][j] = lis[i-1][j-1]+1;
				else
					lis[i][j]  = Math.max(lis[i][j-1], lis[i-1][j]);
				
			}
		}
		
		
		
		return lis[m][n];
	}
}
