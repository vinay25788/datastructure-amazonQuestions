package com.src.dynamicprogramming;

public class LongestPallindromeSubsequence {
	public static void main(String[] args) {
		String a="agbdba";
		System.out.println(recursive(a,0,a.length()-1));
		usingDP(a);
	}
	public static int recursive(String a,int l,int h)
	{
		if(l==h)
			return 1;
		if(a.charAt(l) == a.charAt(h))
			return 2+recursive(a,l+1,h-1);
		return Math.max(recursive(a, l+1, h), recursive(a, l, h-1));
	}
	
	public static void  usingDP(String a)
	{
		int[][] T = new int[a.length()][a.length()];
		for(int i=0;i<a.length();i++)
			T[i][i] =1;
		for(int l=2;l<=a.length();l++)
		{
			for(int i=0;i<a.length()-l+1;i++)
			{
				int j = i+l-1;
				if(l==2 && a.charAt(i)== a.charAt(j))
					T[i][j]= 2;
				else if (a.charAt(i) == a.charAt(j))
					T[i][j] = T[i+1][j-1]+2;
				else
					T[i][j] = Math.max(T[i][j-1], T[i+1][j]);
			}
		}
		System.out.println(T[0][a.length()-1]);
	}
		
}
