package com.src.dynamicprogramming;

public class CountPath {

	public static void main(String[] args) {
		System.out.println(countPath(3,3));
	}
	public static int countPath(int n,int m)
	{
		if(n==1 || m==1)
			return 1;
		return countPath(n-1,m)+countPath(n, m-1);
	}
}
