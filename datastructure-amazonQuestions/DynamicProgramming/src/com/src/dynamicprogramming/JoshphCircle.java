package com.src.dynamicprogramming;

public class JoshphCircle {

	public static void main(String[] args) {
		int[] a= {7,3,8,2,13,11};
		int n=6;
		int k =1;
		
		//System.out.println(findWinner(n,k));
		System.out.println(a[findWinner(n, k)]);
	}
	
	public static int findWinner(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return (findWinner(n-1, k)+k-1)%n;
	
	}
}
