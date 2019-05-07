package com.practise.arrayRotations;

import com.sun.glass.ui.Cursor;
import com.sun.javafx.geom.Curve;

/*
 https://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/
 Maximum sum of i*arr[i] among all rotations of a given array
 */
public class MaximumSumOfProduct {
	public static void main(String[] args) {
		 int arr[] = {1,2,3,4}; 
		 System.out.println(maximumSum(arr));
	}
	public static int maximumSum(int[] a)
	{
		int cur_sum=0;
		int cur_val=0;
		int next_val=0;
		int res=0;
		
		for(int i=0;i<a.length;i++)
			cur_sum+=a[i];
		System.out.println("cur sum "+cur_sum);
		for(int i=0;i<a.length;i++)
			cur_val +=a[i]*i;
		System.out.println(" cur val "+cur_val);
		for(int i=1;i<a.length;i++)
		{
			next_val = cur_val -(cur_sum-a[i-1])+ a[i-1]*(a.length-1);
			System.out.println("cur_sum-a[i-1] "+(cur_sum-a[i-1])+"a[i-1]*(a.length-1) "+a[i-1]*(a.length-1) +" nextvalue-->"+next_val +" a[i-1] "+a[i-1]);
			cur_val = next_val;
			res = Math.max(res, next_val);
		}
		return res;
	}

}
