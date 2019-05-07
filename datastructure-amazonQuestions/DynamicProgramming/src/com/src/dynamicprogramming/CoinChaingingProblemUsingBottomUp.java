package com.src.dynamicprogramming;

public class CoinChaingingProblemUsingBottomUp {
	public static void main(String[] args) {
		int[] coins = {7,2,3,6};
		int total = 13;
		System.out.println(findNumberOfCoin(coins,total));
	}

	public static int findNumberOfCoin(int[] coins,int total)
	{
		int[] t= new int[total+1];
		int[] ind = new int[total+1];
		for(int i=1;i<t.length;i++)
		{
			t[i] = Integer.MAX_VALUE;
			ind[i] = -1;
		}
		int prev=0;
		for(int i=0;i<coins.length;i++)
		{
			for(int j=0;j<=total;j++)
			{
				if(j>=coins[i])
				{
					if(t[j-coins[i]]<t[j]) {
					
						t[j] = t[j-coins[i]]+1;
						ind[j] = i;
					}
				}
			}
		}
		
		
		return t[coins.length];
	}
	}











