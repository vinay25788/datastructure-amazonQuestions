package com.practise.tree;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
		 int arr[] = {3, 34, 4, 12, 5, 2};
		 int[] sub =new int[arr.length];
		 int n = arr.length;
		 findSubarray(arr,sub,n,0,9);
		 Scanner sc = new Scanner(System.in);
		 int n1 =sc.nextInt();
		 int[] b=new int[n1];
		 for(int i=0;i<n1;i++)
			 b[i] =sc.nextInt();
	}
	
	public static int  findSubarray(int[] a,int[] sub,int n,int k,int sum)
	{
		if(sum==0)
		{
			for(int i=0;i<k;i++)
				System.out.print(sub[i]+" ");
			System.out.println();
			k=0;
			return 1;
		}
		if(sum!=0 && n<=0)
			{
			//System.out.println(" not found ");
			return 0;
			}
		sub[k] = a[n-1];
		 return findSubarray(a, sub, n-1, k+1, sum-a[n-1]) +findSubarray(a, sub, n-1, k, sum);
	}
}
