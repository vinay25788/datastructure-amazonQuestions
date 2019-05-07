package com.practise.arrayRotations;

import java.util.Arrays;

public class Sagregate0s1s {
	public static void main(String[] args) {
		int[] a= {0,1,0,0,0,1,1,0,1};
		sagregate(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sagregate(int[] a)
	{
		int start=0;
		int end=a.length-1;
		while(start<end)
		{
			while(start <end && a[start] ==0)
				start++;
			while(start<end && a[end] == 1)
				end--;
			if(start<end)
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
	}
	
}
