package com.test.array.rotation;

import java.util.Arrays;

public class RearrangePosAndNeg {
	public static void main(String[] args) {
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9}; 
		arrange(arr);
	}
	public static void arrange(int[] a)
	{
		int i=-1;
		int pos=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<0)
			{
				++i;
				int temp =a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		int neg=0;
		pos=i+1;
		while(pos<a.length && neg<pos&& a[neg]<0)
		{
			int temp =a[neg];
			a[neg] =a[pos];
			a[pos] = temp;
			pos++;
			neg+=2;
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
