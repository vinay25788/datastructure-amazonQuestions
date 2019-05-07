package com.practise.tree;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		//int[] a= {10,80,30,90,40,50,70};
		int[] a= {3,1,2,10,0,50,70};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public  static void quickSort(int[] a,int low,int high)
	{
		if(low<high)
		{
			int part = partition(a,low,high);
			quickSort(a, low, part-1);
			quickSort(a, part+1, high);
		}
	}
	
	public static int partition(int[] a,int low,int high)
	{
		int pivot = a[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[high];
		a[high] = a[i+1];
		a[i+1] = temp;
		return i+1;
	}
}
