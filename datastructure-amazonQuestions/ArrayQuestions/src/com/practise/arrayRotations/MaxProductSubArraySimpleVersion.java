package com.practise.arrayRotations;

public class MaxProductSubArraySimpleVersion {
	public static void main(String[] args) {
		int arr[] = { -1, -3, -10, 0, 60 }; 
		findProduct(arr);
	}
	public static void findProduct(int[] a)
	{
		int max_ending_here=1;
		int min_ending_here=1;
		int max_so_far=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				max_ending_here = max_ending_here*a[i];
				min_ending_here = Math.min(min_ending_here*a[i], 1);
			}
			else if (a[i] ==0)
			{
				max_ending_here =1;
				min_ending_here =1;
				
			}
			else 
			{
				int temp = max_ending_here;
				max_ending_here= Math.min(min_ending_here*a[i], 1);
				min_ending_here = min_ending_here*a[i];
			}
			
			if(max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		System.out.println(max_so_far);
	}

}
