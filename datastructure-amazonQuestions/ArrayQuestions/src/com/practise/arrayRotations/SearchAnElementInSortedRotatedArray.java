package com.practise.arrayRotations;

public class SearchAnElementInSortedRotatedArray {

	public static void main(String[] args) {
		int[] a= {4,5,1,2,3};
		System.out.println(findElement(a,0,a.length-1,2));
	
		System.out.println("find pivot "+findPivot(a,0,a.length-1));
	}
	
	public static int findPivot(int[] a,int l,int h)
	{
		if(h<l)
			return -1;
		if(h==l)
			return l;
		int mid = l+(h-l)/2;
		if(a[mid]>a[mid+1])
			return mid+1;
		else if(a[mid-1]>a[mid])
			return mid;
		else if(a[l]>a[mid])
			return findPivot(a, l, mid-1);
		return findPivot(a, mid+1, h);
	}
	public static int findElement(int[] a,int l,int h,int key)
	{
		if(l>h)
			return -1;
		int mid = l+(h-l)/2;
		if(a[mid] == key)
			return mid;
		if(a[l]<=a[mid])
		{
			if(key>=a[l] && key<=a[mid])
				return findElement(a, l, mid-1, key);
			return findElement(a, mid+1, h, key);
		}
		if(key >=a[mid] && key <=a[h])
			return findElement(a, mid+1, h, key);
		return findElement(a, l, mid-1, key);
		
	}
}
