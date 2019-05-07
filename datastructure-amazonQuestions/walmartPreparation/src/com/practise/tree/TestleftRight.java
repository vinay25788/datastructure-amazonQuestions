package com.practise.tree;

//Java program to find an element 
//such that sum of right side element 
//is equal to sum of left side 
public class TestleftRight { 
	
	// Finds an element in an array such that 
	// left and right side sums are equal 
	static int findElement(int arr[], int n) 
	{ 
		// Forming prefix sum array from 0 
		int[] prefixSum = new int[n]; 
		prefixSum[0] = arr[0]; 
		for (int i = 1; i < n; i++) 
			prefixSum[i] = prefixSum[i - 1] + arr[i]; 
	
		// Forming suffix sum array from n-1 
		int[] suffixSum = new int[n]; 
		suffixSum[n - 1] = arr[n - 1]; 
		for (int i = n - 2; i >= 0; i--) 
			suffixSum[i] = suffixSum[i + 1] + arr[i]; 
	
		// Find the point where prefix and suffix 
		// sums are same. 
		for (int i = 1; i < n - 1; i++) 
			if (prefixSum[i] == suffixSum[i]) 
				return arr[i]; 
	
		return -1; 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		int arr[] ={ 1, 4, 2, 5 };  
		int n = arr.length; 
		System.out.println(findElement(arr, n)); 
	} 
} 
//This code is contributed by Sumit Ghosh 
