package com.practise.binarySearchTree.heapdatastructure;

public class KLargestElementUsingMinHeap {

	public static void main(String[] args) {
		int[] a= {10,8,7,1,40,2,50};
		int k=4;
		KLargestElementUsingMinHeap obj = new KLargestElementUsingMinHeap();
		obj.sort(a,k);
		
		System.out.println(a[0]);
		//for(int i=0;i<k;i++)
		//	System.out.print(" "+a[i]);
	}
	
	public void sort(int[] a,int k)
	{
		int size = a.length-1;
		
		for(int i=k-1;i>=0;i--)
		{
			heapify(a,size,i);
		}
		
		for(int i=size;i>=k;i--)
		{
			if(a[i]>a[0]) {
			
				int swap = a[0];
				a[0] = a[i];
				a[i] = swap;
				heapify(a,i,0);
			}
			
		}
	}
	
	public void heapify(int[] a,int n,int i)
	{
		int smallest = i;
		int l= 2*i+1;
		int r = 2*i+2;
		
		if(l<n && a[l]<a[smallest])
			smallest = l;
		
		if(r<n && a[r]<a[smallest])
			smallest = r;
		
		if(smallest != i)
		{
			int swap = a[i];
			a[i] = a[smallest];
			a[smallest] = swap;
			heapify(a, n, smallest);
					
		}
	}
}

