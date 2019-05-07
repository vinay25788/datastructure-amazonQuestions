package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] a= {4,1,3,6,12,9};
		System.out.println(Arrays.toString(a));
		int k=3;
		heap(a,k);
	}

	public static void heap(int[] a,int k)
	{
		int n= a.length;
		for(int i=k-1 ;i>=0;i--)
		{
			heapify(a,i,n);
		}
		
		for(int i=n-1;i>=k;i--)
		{
			if(a[0]>a[i]) {
				int temp = a[i];
				a[i] = a[0];
				a[0] = temp;
				heapify(a, 0, i);
			}
		}
		System.out.println(a[0]);
		//System.out.println(Arrays.toString(a));
	}
	
	public static void heapify(int[] a,int i,int n)
	{
		int smallest = i;
		int left= 2*i+1;
		int right = 2*i+2;
		if(left<n && a[left] >=a[smallest])
		{
			smallest = left;
		}
		if(right<n && a[right] >=a[smallest])
		{
			smallest = right;
		}
		if(smallest != i)
		{
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
			heapify(a, smallest, n);
		}
		
	}
}
