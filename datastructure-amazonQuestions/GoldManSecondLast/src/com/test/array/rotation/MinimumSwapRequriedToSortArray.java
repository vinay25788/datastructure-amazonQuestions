package com.test.array.rotation;

import java.util.Arrays;

public class MinimumSwapRequriedToSortArray {
	public static void main(String[] args) {
		   int a[] = {0, 1, 0, 1, 0}; 
		int count=0;
		int swap=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] ==0)
			{
				int temp =a[i];
				a[i] =a[count];
				a[count] =temp;
				count++;
				swap++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("swap required "+(swap-1));
	}

}
