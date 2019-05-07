package com.practise.array.order;

public class HeapSort {
	public static void main(String[] args) {
		int[] a= {5,2,1,3,10,9};
		sort(a);
	}
	
	public static void sort(int[] a)
	{
		int n=a.length-1;
		for(int i=n/2;i>=0;i--)
		{
			heapify(a,i,n);
		}
		
		for(int i=n;i>=0;i--)
		{
			int temp = a[i];
			a[i] = a[0];
			a[0]= temp;
			heapify(a,0,i);
		}
		
		for(int i=0;i<=n;i++)
			System.out.print(" "+a[i]);
	}
	
	public static void heapify(int[] a,int i,int n)
	{
		int largest = i;
		int l= 2*i+1;
		int r = 2*i +2;
		
		if(l<n && a[l]<a[largest])
			largest = l;
		if(r<n && a[r] < a[largest])
			largest = r;
		
		if(largest != i)
		{
			int temp = a[largest];
			a[largest] = a[i];
			a[i] = temp;
			heapify(a,largest,n	);
		}
			
	}

}
