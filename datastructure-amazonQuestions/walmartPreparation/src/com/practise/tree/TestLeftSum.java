package com.practise.tree;

//Java program to find an element 
//such that sum of right side element 
//is equal to sum of left side 
public class TestLeftSum { 
	
	// Function to compute partition 
	static int findElement(int arr[], int size) 
	{ 
		int right_sum = 0, left_sum = 0; 
	
		// Computing right_sum 
		for (int i = 0; i < size; i++) 
			right_sum += arr[i]; 
	
		// Checking the point of partition 
		// i.e. left_Sum == right_sum 
		for (int i = 0, j = 1; j < size; i++, j++) { 
			right_sum -= arr[j]; 
			left_sum += arr[i]; 
	
			if (left_sum == right_sum) 
				return arr[i + 1]; 
		} 
	
		return -1; 
	} 
	
	// Driver 
	public static void main(String args[]) 
	{ 
		int arr[] = { 1, 2 ,3 ,4 ,5, 5 ,2, 4, 4}; 
		int size = arr.length; 
		System.out.println(findElement(arr, size)); 
	} 
} 
//This code is contributed by Sumit Ghosh 
