package com.src.dynamicprogramming;

public class EditDistanceDP {

	public static void main(String[] args) {
		//String a= "abcdef";
		//String b="azced";
		String a="sunday";
		String b="saturday";
		System.out.println(minEdit(a,b));
	}
	public static int min(int x,int y,int z)
	{
		if(x<y && x<z)
			return x;
		if(y<z && y<x)
			return y;
		return z;
	}
	public static int minEdit(String a,String b)
	{
		int m= a.length();
		int n= b.length();
		int[][] T= new int[n+1][m+1];
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				if(i==0)
					T[i][j] = j	;
				else if(j==0)
					T[i][j]=i;
				else if(b.charAt(i-1) == a.charAt(j-1))
					T[i][j] = T[i-1][j-1];
				else 
				{
					T[i][j] = min(T[i-1][j-1], T[i][j-1], T[i-1][j])+1;
				}
			}
		}
		
		
		return T[n][m];
	}
}
