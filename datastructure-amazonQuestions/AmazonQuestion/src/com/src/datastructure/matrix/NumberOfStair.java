package com.src.datastructure.matrix;

public class NumberOfStair {
	public static void main(String[] args) {
		int n=5;
		System.out.println(findWay(n));
	}
	public static int findWay(int n)
	{
		int f[]= new int[n+1];
		f[1] =1;
		f[2] =2;
		for(int i=3;i<=n;i++)
		{
			f[i] = f[i-1]+f[i-2];
		}
		return f[n];
	}
	
}
