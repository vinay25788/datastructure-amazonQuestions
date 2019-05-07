package main.java.ecs.impl;

public class LongestPallindromeSubSequence {
	
	public static void main(String[] args) {
		String sb="GEEKSFORGEEKS";
		int n= sb.length();
		System.out.println(findLength(sb,0,n-1));
		System.out.println("using DP-->"+findLongest(sb));
	}

	
	public static int findLongest(String sb)
	{
		int n = sb.length();
		int[][] lps = new int[n][n];
		
		int i,j,cl;
		
		for( i=0;i<sb.length();i++)
		{
			lps[i][i] =1;
		}
		
		for(cl=2;cl<=n;cl++)
		{
			for( i=0;i<n-cl+1;i++)
			{
				 j=i+cl-1;
				if(sb.charAt(i) == sb.charAt( j)  && cl==2)
				{
					lps[i][j] =2;
				}
				else if (sb.charAt(i) == sb.charAt(j))
				{
					lps[i][j] = lps[i+1][j-1]+2;
				}
				else 
				{
					lps[i][j] = Math.max(lps[i][j-1],lps[i+1][j]);
				}
			}
			
		}
		
		return lps[0][n-1];
		
	}
	
	
	
	
	
	public static int findLength(String sb,int i,int j)
	{
		if(i==j)
		{
			return 1;
		}
		
		if(sb.charAt(i) == sb.charAt(j) && i+1==j)
		{
			return 2;
		}
		
		if( sb.charAt(i) == sb.charAt(j))
		{
			return findLength(sb, i+1, j-1)+2;
		}
		
		return Math.max(findLength(sb, i+1, j), findLength(sb, i, j-1));
	}
}
