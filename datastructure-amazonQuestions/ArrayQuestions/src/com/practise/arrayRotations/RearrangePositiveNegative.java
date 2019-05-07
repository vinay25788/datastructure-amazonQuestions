package com.practise.arrayRotations;

import java.util.Arrays;

public class RearrangePositiveNegative {
	public static void main(String[] args) {
		 int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9}; 
		 rearrange(arr);
		 System.out.println(Arrays.toString(arr));
	}
	public static void rearrange(int[] a)
	{
		int i=-1;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<0)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int pos = i+1;
		int neg =0;
		while(pos<a.length && neg<pos && a[neg]<0)
		{
			int temp = a[pos];
			a[pos] = a[neg];
			a[neg] = temp;
			pos++;
			neg = neg+2;
		}
		
	}

}
