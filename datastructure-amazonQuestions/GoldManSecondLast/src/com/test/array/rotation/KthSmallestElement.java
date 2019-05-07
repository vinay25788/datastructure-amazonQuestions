package com.test.array.rotation;

public class KthSmallestElement {
	public static void main(String[] args) {
		int[] a= {3,4,5,2,1};
		int k=3;
		kthSmallest(a,k);
		System.out.println(a[0]);
	}
	
	public static void kthSmallest(int[] a,int k)
	{
		int n=a.length;
		for(int i=k-1;i>=0;i--)
		{
			heapify(a,i,n);
		}
		for(int i=n-1;i>=k;i--)
		{
			if(a[0]>a[i])
			{
				int temp =a[i];
				a[i] = a[0];
				a[0] =temp;
				heapify(a,0,i);
			}
		}
	}
	
	public static void heapify(int[] a,int i,int n)
	{
		int largest = i;
		int l = 2*i+1;
		int r=2*i+2;
		if(l<n && a[l]>a[largest])
			largest =l;
		if(r<n && a[r]>a[largest])
			largest =r;
		if(largest!=i)
		{
			int temp =a[largest];
			a[largest] = a[i];
			a[i] = temp;
			heapify(a,largest,n);
		}
	}
	

}
