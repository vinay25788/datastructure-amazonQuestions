package com.src.dynamicprogramming;

public class Decodway {
	public static void main(String[] args) {
		 char[] a= {'1','2','3','4'};
		 System.out.println(countway(a));
		 System.out.println(countWay(a,a.length));
	}
	
	public static int countWay(char[] a,int n)
	{
		if(n==0 || n==1)
			return 1;
		int count=0;
		if(a[n-1] >'0')
		count = 	countWay(a, n-1);
		
		if(a[n-2] =='1' ||(a[n-2] == '2' && a[n-1] <'7'))
		{
			count+=countWay(a, n-2);
		}
		return count;
	}

	public static int countway(char[] a)
	{
		int[] dp = new int[a.length+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=a.length;i++)
		{
			if(a[i-1]>'0')
			{
				dp[i] = dp[i-1];
			}
			if(a[i-2] =='1' || (a[i-2] == '2' && a[i-1]<'7'))
			{
				dp[i] = dp[i]+dp[i-2];
			}
			
		}
		return dp[a.length];
	}
}
