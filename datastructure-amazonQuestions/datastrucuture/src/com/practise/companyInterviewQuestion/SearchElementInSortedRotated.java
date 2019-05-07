package com.practise.companyInterviewQuestion;

public class SearchElementInSortedRotated {

	public static void main(String[] args) {
		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3}; 
		System.out.println(searchElement(arr,0,arr.length-1,1));
		int ind = findPivot(arr, 0, arr.length-1);
		System.out.println(arr[ind]);
	}
	
	public static int findPivot(int[]a,int low,int high)
	{
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
	}
	
	public  static int searchElement(int[]a,int low,int high,int key)
	{
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		if(a[mid] == key)
			return mid;
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
	}
}
