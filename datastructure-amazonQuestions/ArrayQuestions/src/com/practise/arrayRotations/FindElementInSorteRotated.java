package com.practise.arrayRotations;

public class FindElementInSorteRotated {
	public static void main(String[] args) {
		//{1,2,3,4,5,6,7,8}
		int[] a2= {8,1,2,3,4,5,6,7};
		int[] a1 = {30, 40, 50, 10, 20};
		int[] b= {3,4,5,1,2};
		int[] aa = {5,1,2,3,4};
		int[] a = {4,5,1,2,3};
		//System.out.println("index "+findIndex(a,0,a.length-1,20));
		System.out.println("pivot element -->"+findPivot(a,0,a.length-1));
	}
	public static int findPivot(int[] a,int low,int high)
	{
		if(high<low)
			return -1;
		if(high==low)
			return low;
		int mid = low+(high-low)/2;
		if(a[mid]>a[mid+1])
			return mid+1;
		else if(a[mid-1]>a[mid])
			return mid;
		if(a[low]<a[mid])
			return findPivot(a, mid+1, high);
		else
			return findPivot(a, low, mid-1);
			
	}
	public static int findIndex(int[] a,int low,int high,int key)
	{
		if(high<low)
			return -1;
		if(high == low)
			return low;
	
			int mid = low+(high-low)/2;
			
			if(a[mid] == key)
				return mid;
			if(a[low]>key)
			{
				return findIndex(a, mid+1, high, key);
			}
			return findIndex(a, low, mid-1, key);
	}

}
