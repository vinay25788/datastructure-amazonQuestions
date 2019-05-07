package com.src.dynamicprogramming;

public class CoinChangingProblem {

	public static void main(String[] args) {
		int[] a= {9,6,5,1};
		int total =11;
		findCoin(a,total);
	}
	public static void findCoin(int[] a,int total)
	{
		int[] T= new int[total+1];
		int[] ind=new int[total+1];
		T[0]=0;
		//ind[0]=-1;
		for(int i=1;i<=total;i++)
		{
			T[i]=Integer.MAX_VALUE-1;
			ind[i] =-1;
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<=total;j++)
			{
				if(j>=a[i]) {
				if(T[j]>T[j-a[i]]+1)
						{
							T[j] = T[j-a[i]]+1;
							ind[j]=i;
						}
				}
			}
		}
		System.out.println(T[total]);
	}
}
