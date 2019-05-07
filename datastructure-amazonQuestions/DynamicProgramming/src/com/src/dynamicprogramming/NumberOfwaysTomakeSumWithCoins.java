package com.src.dynamicprogramming;

public class NumberOfwaysTomakeSumWithCoins {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int sum= 5;
		System.out.println(findWays(a,sum));
	}
	public static int findWays(int[] a,int sum)
	{
		int[] table= new int[sum+1];
		table[0] =1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=a[i];j<=sum;j++)
			{
				table[j] = table[j] + table[j-a[i]];
			}
		}
		return table[sum];
	}

}
