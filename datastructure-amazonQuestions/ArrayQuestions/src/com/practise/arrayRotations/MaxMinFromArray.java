package com.practise.arrayRotations;

public class MaxMinFromArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		findMaxMin(a);
	}
	public static void findMaxMin(int[] a)
	{
		int min=a[0],max=0;
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min = a[i];
			if(max<a[i])
				max=a[i];
		}
		System.out.println(min+" "+max);
	}
	

}
