package com.practise.arrayRotations;

public class FindSmallestNumber {

	public static void main(String[] args) {
		int a[]= {5,1,2,3,4};
		System.out.println(findSmallest(a,0,a.length-1));
	}
	public static int findSmallest(int[] a,int low,int high)
	{
		if(high<low)
			return -1;
		int mid = low+(high-low)/2;
		if(a[mid]>a[mid+1])
			return mid+1;
		if(a[mid]<a[mid-1])
			return mid;
		if(a[low]<a[mid])
		return	findSmallest(a, mid+1, high);
		
		return findSmallest(a, low, mid-1);
	}
}
