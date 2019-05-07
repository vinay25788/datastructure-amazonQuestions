package com.practise.tree;

import java.util.Stack;

public class FixedDiscount {
	public static void main(String[] args) {
		int[] a= {5,3,1,4,6,2};
		 int arr[] = {2, 3, 1, 2, 4, 2};
	        int arr1[] = {5, 1, 3, 4, 6, 2};
		find(arr);
		find(arr1);
		find(a);
	}
	public static void find(int[] a)
	{
		int sum=0;
		int i=0;
		int start =0;
		int n=a.length;
		
		for(i=0;i<n;i++)
		{
			int min=a[i];
			while(start<n)
			{
				if(min>a[start])
				{
					min = a[start];
					break;
				}
				start++;
			}
			
				sum+=min;
				start=0;
		}
		System.out.println(sum);
	}
}
