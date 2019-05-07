package com.practise.binarySearchTree.heapdatastructure;

public class KsmallestElementUsingMinHeap {

	public static void main(String[] args) {
		//int[] a= {10,8,7,1,11,2,50};
		int[] a= {4,2,5,1,8,9,3};
		int k=3;
		KsmallestElementUsingMinHeap obj = new KsmallestElementUsingMinHeap();
		obj.sort(a,k);
		
		for(int i=0;i<k;i++)
			System.out.print(" "+a[i]);
	}
	
	public void sort(int[] a,int k)
	{
		int size = a.length-1;
		
		for(int i=k-1;i>=0;i--)
		{
			heapify(a,size,i);
		}
		
		for(int i=size;i>=k;--i)
		{
			if(a[i]<a[0]) {
			
				int swap = a[0];
				a[0] = a[i];
				a[i] = swap;
				heapify(a,i,0);
			}
			
		}
	}
	
	public void heapify(int[] a,int n,int i)
	{
		int largest = i;
		int l= 2*i+1;
		int r = 2*i+2;
		
		if(l<n && a[l]>a[largest])
			largest = l;
		
		if(r<n && a[r]>a[largest])
			largest = r;
		
		if(largest != i)
		{
			int swap = a[i];
			a[i] = a[largest];
			a[largest] = swap;
			heapify(a, n, largest);
					
		}
	}
}

