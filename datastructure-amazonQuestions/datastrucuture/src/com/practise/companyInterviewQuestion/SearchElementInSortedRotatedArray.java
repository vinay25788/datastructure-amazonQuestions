package com.practise.companyInterviewQuestion;

public class SearchElementInSortedRotatedArray {
	public static void main(String[] args) {
		int[] a = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key = 1;
		//searchInsortedRotated(a,0,a.length-1,key);
		//findStartingPoint(a,0,a.length-1);
		System.out.println(" ****** ");
		countRotation(a,0,a.length-1);
	}
	
	public static void countRotation(int[] a,int low,int high)
	{
		if(low>high)
			return;
		if(high== low)
		{
			System.out.println(low);
			return;
		}
		int mid=(low+high)/2;
		if(mid<high && a[mid] >a[mid+1])
		{
			System.out.println(mid+1);
			return;
		}
		 if(mid>low && a[mid] < a[mid-1])
		{
			System.out.println(mid);
			return;
			
		}
		if(a[high]>a[mid])
			countRotation(a, low, mid-1);
		
		countRotation(a, mid+1, high);
	}
	/*
	 
	 if(a[low] <= a[mid])
		{
			if(a[low] <= key && key <= a[mid])
			{
				return searchElement(a, low, mid-1, key);
			}
			else
				return searchElement(a, mid-1, high, key);
			
		}
		else if(key>= a[mid] && key <= a[high])
		{
			return searchElement(a, mid+1, high, key);
		}
		
		return searchElement(a, low, mid-1, key);
	 */
	
	/*
	 if(low>high)
			return -1;
		int mid = (low+high)/2;
		if(mid<high && a[mid] > a[mid+1])
			return mid+1;
		if(mid>low && a[mid] < a[mid-1])
			return mid;
		if(a[low] >= a[mid])
			return findPivot(a,low,mid-1);
		return findPivot(a, mid+1, high);
	 */
	
	public static void findStartingPoint(int[] a,int low,int high)
	{
		if(low>high)
			return;
		int mid =(low+high)/2;
		
		 if (mid>low && a[mid]<a[mid-1])
		{
			System.out.println(a[mid]);
		}
		 if(mid<high && a[mid] >a[mid+1])
			{
				System.out.println(a[mid+1]);
			}
		 if(a[low]>= a[mid])
			 findStartingPoint(a, low, mid-1);
		 
		 findStartingPoint(a, mid+1, high);
		
		
	}
	public static  void searchInsortedRotated(int[] a,int low,int high,int key)
	{
		if(low>high)
			return;
		int mid = (low+high)/2;
		if(key == a[mid])
		{
			System.out.println("index "+mid);
			return;
		}
		if(a[low] <= a[mid])
		{
			if(a[low] <= key && key<= a[mid])
				searchInsortedRotated(a, low, mid-1, key);
			else
				searchInsortedRotated(a, mid+1, high, key);
		}
		
		 if (key>= a[mid] && key<=a[high])
		{
			searchInsortedRotated(a, mid+1, high, key);
		}
		
		searchInsortedRotated(a, low, mid-1, key);
		
	}

}
