package com.src.dynamicprogramming;

public class CuttingRodUsingDp {
	public static void main(String[] args) {
		int[] a={2,5,7,8};
		int len = 5;
		System.out.println(findSol(a,len));
	}

	public static int findSol(int a[],int len)
	{
		int[][] T = new int[a.length][len+1];
		
		for(int i=1;i<=len;i++)
		{
			T[0][i] = a[0]*i;
		}
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<=len;j++)
			{
				if(j>=i)
				{
					T[i][j] = Math.max(T[i-1][j], a[i]+T[i][j-i]);
				}
				else
					T[i][j] = T[i-1][j];
			}
		}
		return T[a.length-1][len];
	}
}
