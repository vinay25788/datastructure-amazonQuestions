package com.test.array.rotation;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] a= {1,3,2,7,6,4};
		heap(a);
		System.out.println(Arrays.toString(a));
	}
	public static void heap(int[] a)
	{
		int n=a.length;
		for(int i=(n-1)/2;i>=0;i--)
		{
			heapify(a,i,n);
		}
		
		for(int i=n-1;i>=0;i--)
		{
				int temp =a[i];
				a[i] =a[0];
				a[0] =temp;
				heapify(a,0,i);
		}
	}
	
	public static void heapify(int[] a,int i,int n)
	{
		int largest =i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && a[l] >a[largest])
		{
			largest =l;
		}
		if(r<n && a[r]>a[largest])
			largest =r;
		if(largest!=i)
		{
			int temp =a[i];
			a[i] =a[largest];
			a[largest] =temp;
			heapify(a,largest,n);
		}
	}

}
