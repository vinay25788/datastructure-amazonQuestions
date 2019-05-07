package com.practise.binaryTree;

import java.util.HashSet;
import java.util.Set;

public class HeapSort {
	public static void main(String[] args) {
		int[] a= {5,10,2,1,20};
		heapSort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		int sum = 7;
		findSum(a,sum);
		
		findpairCountUsingSet(a,sum);
	}
	
	public static void findpairCountUsingSet(int[] a,int sum)
	{
		int count=0;
		Set<Integer> set = new HashSet<>();
		for(int e:a)
		{
			int dif = sum -e;
			if(set.contains(dif))
			{
				count++;
			}
			else
				set.add(e);
		}
		System.out.println(" count in set "+count);
	}
	
	public static void findSum(int[] a,int sum)
	{
		int l=0;
		int r = a.length-1;
		int count=0;
		while(l<r)
		{
			if(a[l]+a[r]== sum)
			{
				count++;
				l++;
				r--;
			}
			else if(a[l]+a[r] <sum)
			{
				l++;
			}
			else
			{
				r--;
			}
				
		}
		System.out.println("pair count "+count);
	}

	public static void heapSort(int[] a)
	{
		for(int i=(a.length/2)-1;i>=0;i--)
		{
			heapify(a,i,a.length-1);
		}
		
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i] <a[0]) {
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			heapify(a,0,i);
			}
		}
		
		
	}
	
	public static void heapify(int[] a,int i,int n)
	{
		int larger = i;
		int l=2*i+1;
		int r = 2*i+2;
		if(l<n && a[l] > a[larger])
			larger = l;
		if(r<n && a[r]> a[larger])
			larger = r;
		if(i!=larger)
		{
			int temp = a[larger];
			a[larger] = a[i];
			a[i] = temp;
			heapify(a,larger,n);
		}
	}
}
