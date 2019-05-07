package com.test.array.rotation;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] a= {5,6,2,1,8,11};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a,int l,int h)
	{
		if(l<h)
		{
			int part = partition(a,l,h);
			sort(a, l, part-1);
			sort(a, part+1, h);
		}
	}
	public static int partition(int[] a,int l,int h)
	{
		int pivot = a[h];
		int i=l-1;
		for(int j=l;j<h;j++)
		{
			if(a[j]<=pivot)
			{
				++i;
				int temp =a[i];
				a[i] =a[j];
				a[j] =temp;
				
			}
		}
		
		int temp = a[h];
		a[h] = a[i+1];
		a[i+1] = temp;
		return i+1;
	}

}
