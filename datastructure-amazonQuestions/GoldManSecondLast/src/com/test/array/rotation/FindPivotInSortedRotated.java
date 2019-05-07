package com.test.array.rotation;

public class FindPivotInSortedRotated {
	public static void main(String[] args) {
		//int[] a= {1,2,3,4,5};
		//int[] a= {3,4,5,1,2};
		//int[] a= {4,5,1,2,3};
		int[] a= {2,3,4,5,1};
		System.out.println(findPivot(a,0,a.length-1));
	}
	public static int findPivot(int[] a,int l,int h)
	{
		if(l>=h)
			return a[l];
		int mid = (l+h)/2;
		if(mid<h && a[mid]>a[mid+1])
			return a[mid+1];
		if(mid>l && a[mid]<a[mid-1])
			return a[mid];
		if( a[mid]<a[h])
		{
			return findPivot(a, l, mid-1);
		}
		else
			return findPivot(a, mid+1, h);
			
		
	}
	

}
