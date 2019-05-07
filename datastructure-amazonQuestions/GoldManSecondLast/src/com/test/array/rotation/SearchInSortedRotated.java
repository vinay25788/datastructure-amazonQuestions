package com.test.array.rotation;

public class SearchInSortedRotated {
	
	public static void main(String[] args) {
		//int[] a= {1,2,3,4,5};
		int[] a= {4,5,1,2,3};
		//int[] a= {2,3,4,5,1};
	
		System.out.println(findPos(a,0,a.length-1,2));
	}
	public static int findPos(int[] a,int l,int h,int el)
	{
		if(l>h)
			return -1;
		int mid = (l+h)/2;
		if(a[mid] == el)
			return mid;
		if(a[l]<=a[mid])
		{
			if(el>=a[l]&& el<=a[mid])
				return findPos(a, l, mid-1, el);
			return findPos(a, mid+1, h, el);
		}
		if(el>a[mid] && el<a[h])
			return findPos(a, mid+1, h, el);
		return findPos(a, l, mid-1, el);
	}

}
