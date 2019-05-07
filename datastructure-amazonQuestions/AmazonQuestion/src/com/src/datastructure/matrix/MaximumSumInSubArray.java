package com.src.datastructure.matrix;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumInSubArray {
	public static void main(String[] args) {
		int[] a= {0,9,-1,1};
		maxSum(a);
		
		List list = new ArrayList<>();
		list.add(1);
		list.add(3.4);
		
	}
	public static void maxSum(int[] a)
	{
		int max_ending_here=0,max_so_far=0;
		for(int i=0;i<a.length;i++)
		{
			max_ending_here += a[i];
			if(max_ending_here>max_so_far)
			{
				max_so_far = max_ending_here;
			}
			if(max_ending_here<0)
			{
				max_ending_here=0;
				
			}
			
			
		}
		System.out.println(max_so_far);
	}

}
