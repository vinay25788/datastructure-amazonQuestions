package com.practise.paytm;

public class FindElementFromSortedRotated {
	public static void main(String[] args) {
		
		//int[] a= {3,4,5,1,2};
		//int[] a= {1,2,3,4,5};
		int[] a= {5,1,2,3,4};
		int x = 4;
		System.out.println(findSorted(a,x,0,a.length-1));
	}
	public static int findSorted(int[] a,int x,int l,int h)
	{
		if(l>h)
			return -1;
		int mid = (l+h)/2;
		if(a[mid] == x)
			return mid;
		if(a[l]<a[mid] )
		{
			if(a[mid]<x)
			return findSorted(a, x, mid+1, h);
			else
			return findSorted(a, x, l, mid-1);
		}
		else
		{
			if(a[mid]<x)
				return findSorted(a, x, mid+1, h);
			return findSorted(a, x, l, mid-1);
		}
		
	}

}
