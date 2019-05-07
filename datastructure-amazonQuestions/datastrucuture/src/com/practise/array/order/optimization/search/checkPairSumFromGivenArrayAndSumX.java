package com.practise.array.order.optimization.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class checkPairSumFromGivenArrayAndSumX {
	
	public static void main(String[] args) {
		int[] a= {3,2,1,8,4,5,1,};
		//int[] a = {1, 4, 45, 6, 10, -8}; 
		checkPairSum(a,a.length	,16);
		usingHashSet(a,5);
	}
	
	public static void usingHashSet(int[] a,int sum)
	{
		Set<Integer> set = new HashSet<Integer>();
		for(int el:a)
		{
			int temp = sum-el;
			
			if(temp>0 && set.contains(temp))
			{
				System.out.println(" first "+el+ "second "+temp);
			}
			set.add(el);
		}
	}

	public static void checkPairSum(int[] a,int n,int sum)
	{
		Arrays.sort(a);
		int l=0,r=n-1;
	int 	count =0;
		while(l<r)
		{
			if(a[l]+a[r] == sum)
			{
				count++;
				l++;
				r--;
			}
			else if(a[l]+a[r]<sum)
			{
				l++;
			}
			else
				r--;
			
		}
		
		System.out.println("pair count "+count);
	}
}
