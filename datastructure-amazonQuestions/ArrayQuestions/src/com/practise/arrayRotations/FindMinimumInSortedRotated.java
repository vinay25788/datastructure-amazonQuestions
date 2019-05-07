package com.practise.arrayRotations;

public class FindMinimumInSortedRotated {
public static void main(String[] args) {
	int b[] =  {2, 3, 4, 5, 6, 7, 8};

    int c[] =  {3, 4, 5, 1, 2}; 
    int a[] =  {5, 6, 7, 1, 2, 3, 4};
	System.out.println(findMinimum(a,0,a.length-1));
}
public static int findMinimum(int[] a,int l,int h)
{
	if(l>h)
		return -1;
	if(h==l)
		return a[l];
	int mid = l+(h-l)/2;
	if(a[mid]>a[mid+1])
		return a[mid+1];
	if(a[mid-1]>a[mid])
		return a[mid];
	if(a[mid]<a[h])
		return findMinimum(a, l, mid-1);
	return findMinimum(a, mid+1, h);
			
}
}
