package com.practise.companyInterviewQuestion;

public class FindMinimuInSortedRotated {
	public static void main(String[] args) {
		
		//int[] a = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int[] a = {1,2,3,4,5,6};
		System.out.println(findMinimum(a, 0, a.length-1));
	}
	
	public static int findMinimum(int[] a,int low,int high)
	{
		if(low>high)
			{
			return a[low];
			}
		if(high == low)
		{
			return a[low];
		}
		int mid = (low+high)/2;
		if(mid<high && a[mid]>a[mid+1])
		{
				return a[mid+1];
		}
		if(mid>low && a[mid]<a[mid-1])
		{
			return a[mid];
		}
		if(a[high]>a[mid])
			return findMinimum(a, low, mid-1);
		
		return findMinimum(a, mid+1, high);
	}

}
