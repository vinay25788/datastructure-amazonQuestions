package com.practise.array.order.optimization.search;

//Java program to demonstrate working of 
//an algorithm that finds an element in an 
//array of infinite size 

public class FindPositionInInfiniteSortedElement 
{ 
	// Simple binary search algorithm 
	static int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r>=l) 
		{ 
			int mid = l + (r - l)/2; 
			if (arr[mid] == x) 
				return mid; 
			if (arr[mid] > x) 
				return binarySearch(arr, l, mid-1, x); 
			return binarySearch(arr, mid+1, r, x); 
		} 
		return -1; 
	} 
	
	// Method takes an infinite size array and a key to be 
	// searched and returns its position if found else -1. 
	// We don't know size of arr[] and we can assume size to be 
	// infinite in this function. 
	// NOTE THAT THIS FUNCTION ASSUMES arr[] TO BE OF INFINITE SIZE 
	// THEREFORE, THERE IS NO INDEX OUT OF BOUND CHECKING 
	static int findPos(int arr[],int key)	 
	{ 
		int l = 0, h = 1; 
		int val = arr[0]; 

		// Find h to do binary search 
		while (val < key) 
		{ 
			l = h;	 // store previous high 
			h = 2*h;	 // double high index 
			val = arr[h]; // update new val 
		} 

		// at this point we have updated low 
		// and high indices, thus use binary 
		// search between them 
		return binarySearch(arr, l, h, key); 
	} 

	// Driver method to test the above function 
	public static void main(String[] args) 
	{ 
		int arr[] = new int[]{3, 5, 7, 9, 10, 90, 
							100, 130, 140, 160, 170}; 
		int ans = findPos(arr,170); 
		
		if (ans==-1) 
			System.out.println("Element not found"); 
		else
			System.out.println("Element found at index " + ans); 
	} 
} 

/*public class FindPositionInInfiniteSortedElement {
	public static void main(String[] args) {
		 int arr[] = new int[]{3, 5, 7, 9, 10, 90,  
                 100, 130, 140, 160, 170}; 
		 int key=170;
		 findPos(arr,key);
	}

	public static void findPos(int[] a,int key)
	{
		int l=0,h=1;
		int val = a[0];
		
		while(val<key)
		{
			l=h;
			h= 2*h;
			val = a[h];
					
		}
		
		System.out.println(binarySearch(a,l,h,key));
	}
	
	public static int binarySearch(int[] a,int l,int h,int key)
	{
		if(h>=l)
		{
			int mid = l+(h-l)/2;
			
			if(a[mid] == key)
				return mid;
			
			if(a[mid] >key)
			return binarySearch(a, mid+1, h, key);

			return binarySearch(a, l, mid-1, key);
		}
		return -1;
	}
}
*/