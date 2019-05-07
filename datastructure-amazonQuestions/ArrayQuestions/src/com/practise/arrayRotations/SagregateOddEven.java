package com.practise.arrayRotations;

import java.util.Arrays;

public class SagregateOddEven {
	public static void main(String[] args) {
		int[] a= {3,10,7,12,9,1,11,44,19};
		sagregate(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sagregate(int[] a)
	{
		int start=0;
		int end=a.length-1;
		while(start<end)
		{
			while(start <end && a[start]%2==0)
				start++;
			while(start<end && a[end]%2== 1)
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
