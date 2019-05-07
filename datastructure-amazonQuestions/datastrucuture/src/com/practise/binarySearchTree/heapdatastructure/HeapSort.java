package com.practise.binarySearchTree.heapdatastructure;

public class HeapSort {

	public static void main(String[] args) {
		int a[] = {4,6,1,7,5,11,9};
		HeapSort obj = new HeapSort();
		obj.sort(a);
		
		obj.print(a);
		
	
	}
	

	public void print(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
	}
	public int[] sort(int a[])
	{
		int size = a.length;
		
		for(int i=size/2 -1;i>=0;i--)
		{
			heapify(a,size,i);
		}
		
		for(int i=size-1;i>=0;i--)
		{
			int swap = a[0];
			a[0] = a[i];
			a[i] = swap;
			heapify(a,i,0);
		}
		
		return a;
	}
	
	public void heapify(int a[],int n,int i)
	{
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && a[l]>a[largest])
		{
			largest = l;
		}
		if(r<n && a[r]> a[largest])
			largest = r;
		
		if(largest!=i)
		{
			int swap = a[i];
			a[i] = a[largest];
			a[largest] = swap;
			heapify(a,n,largest);
		}
			
	}
}
