package com.test.array.rotation;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		
		int[] a= {4,3,5,6,7,8};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(int[] a,int l,int h)
	{
		if(l<h)
		{
			int mid = (l+h)/2;
			sort(a,l,mid);
			sort(a,mid+1,h);
			merge(a,l,mid,h);
		}
	}
	
	public static void merge(int[] a,int l,int mid,int h)
	{
		int n1= mid-l+1;
		int n2 = h-mid;
		int left[] =  new int[n1];
		int right[] = new int[n2];
		for(int i=0;i<n1;i++)
		{
			left[i]=a[l+i];
		}
		for(int i=0;i<n2;i++)
		{
			right[i] = a[mid+1+i];
		}
		int k=l;
		int i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				a[k] = left[i];
				i++;
			}
			else
				{
				a[k] = right[j];
				j++;
				}
			k++;
		}
		while(i<n1)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}

}
