package com.practise.datastructure.Array.rotation;

public class SearchInSortedAndRotated {
	
  public static void main(String[] args) {
	  int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
	  int size = a.length-1;
	  int key = 3;
	  int index = searchFromSortedRotated(a,size,key);
	  System.out.println(" found at -->"+index+" index");
}

  public static int searchFromSortedRotated(int[] a,int size,int key)
  {
	  int pivot = findPivot(a,0,size);
	  
	  if(pivot == -1)
		  return binarySearch(a, 0, size, key);
	  if(a[pivot] == key)
		  return pivot;
	  if(a[0] <= key)
	  {
		  return binarySearch(a, 0, pivot-1, key);
	  }
	  
		  return binarySearch(a,pivot+1,size, key);
	  
  }
  
  public static int binarySearch(int[] a,int low,int high,int  key)
  {
	  if(high <low)
		  return -1;
	  int mid = (low+high)/2;
	  
	  if(a[mid] == key)
		  return mid;
	  if(a[mid] <key)
		  return binarySearch(a, mid+1, high, key);
	  
		  return binarySearch(a, low, mid-1, key);
	  
  }
  
  
  public static int findPivot(int[] a,int low,int high)
  {
	  if(high <low )
		  return -1;
	  if(high == low )
		  return low;
	  int mid = high+low/2;
	  
	  if(mid <high && a[mid] > a[mid+1])
		  return mid;
	  if(mid >low && a[mid] < a[mid-1])
		  return mid-1;
	  
	  if(a[low] >=a[mid])
		  return findPivot(a, low, mid-1);
	  
		  return findPivot(a, mid+1, high);
	  
  }
  
}
