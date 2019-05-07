package com.practise.array.order;

public class KthSmallestElementUsingMinHeap {
	public static void main(String[] args) {
		
		KthSmallestElementUsingMinHeap obj = new KthSmallestElementUsingMinHeap();
		int[] a= {4,2,5,1,8,9,3};
		 
		 
		int k=2;
		minHeap(a,k);
	}
	
	public static void minHeap(int[] a, int k)
	{
		if(k>a.length)
			return;
		
		int n = a.length-1;

		for(int i=k-1; i>=0;i--)
		{
			heapify(a,i,n);
		}
		

		
		for(int i=n;i>=k;i--)
		{
			if(a[0]>a[i])
			{
				int temp = a[0];
				a[0] = a[i];
				a[i]= temp;
				heapify(a, 0, i);
			}
		}
		
		System.out.println(" kth smallest element "+ a[0]);
	/*	for(int i=0;i<k;i++)
		System.out.println(" "+a[i]);*/
	}
	
	public static void heapify(int[] a,int i,int n)
	{
		int first = 2*i+1;
		int second = 2*i+2;
		int largest = i;
		
		if(first<n && a[first] > a[largest])
			largest = first;
		
		if(second<n && a[second] > a[largest])
			largest = second;
		
		if(largest != i)
		{
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			heapify(a, largest, n);
		}
	}

}
