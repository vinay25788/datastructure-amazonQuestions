package com.practise.datastructure.Array.rotation;

public class SearchInSortedAndRotatedEasyVersion {

	public static void main(String[] args) {
		 int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
		  int size = a.length-1;
		  int key = 3;
		  int index = searchInSort(a,0,size,key);
		  System.out.println(" present at "+index);
	}
	
	public  static int searchInSort(int[] a,int low,int high,int key)
	{
	     if(high < low )
	    	 return -1;
	     
	     int mid = (high+low)/2;
	     
	     if(a[mid] == key)
	    	 return mid;
	     
	     if(a[low] <= a[mid])
	     {
	    	 if(key>= a[low] && 	key <= a[mid] )
	    		 return searchInSort(a, low, mid-1, key);
	    	 return searchInSort(a, mid+1, high, key);
	     }
		
	     if(key<=a[high] && key >=a[mid])
	    	 return searchInSort(a, mid+1, high, key);
		
		return searchInSort(a, low, mid-1, key);
	}
}
