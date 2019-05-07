package com.practise.tree;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] a= {8,1,3,9,2};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a,int l,int h)
	{
		if(l<h)
		{
			int mid= (l+h)/2;
			sort(a,l,mid);
			sort(a,mid+1,h);
			merge(a,l,mid,h);
		}
	}
	public static void merge(int[] a,int l,int m,int r)
	{
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i=0;i<n1;i++)
			L[i] = a[l+i];
		for(int j=0;j<n2;j++)
			R[j] = a[m+j+1];
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				a[k] = L[i];
				i++;
			}
			else
			{
				a[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			a[k] = L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k] = R[j];
			j++;
			k++;		
		}
			
	}

}
