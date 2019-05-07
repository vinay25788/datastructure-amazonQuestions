package com.practise.binaryTree;

//Java program for Minimum number of 
//distinct elements after removing m items 
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 

public class DistinctIds 
{ 
	// Function to find distintc id's 
	static int distinctIds(int arr[], int n, int mi) 
	{ 

		Map<Integer, Integer> m = new HashMap<Integer, Integer>(); 
		int count = 0; 
		int size = 0; 

		// Store the occurrence of ids 
		for (int i = 0; i < n; i++) 
		{ 

			// If the key is not add it to map 
			if (m.containsKey(arr[i]) == false) 
			{ 
				m.put(arr[i], 1); 
				size++; 
			} 

			// If it is present then increase the value by 1 
			else m.put(arr[i], m.get(arr[i]) + 1); 
		} 

		// Start removing elements from the beginning 
		for (Entry<Integer, Integer> mp:m.entrySet()) 
		{ 
			// Remove if current value is less than 
			// or equal to mi 
			if (mp.getKey() <= mi) 
			{ 
				mi -= mp.getKey(); 
				count++; 
			} 
			// Return the remaining size 
			else return size - count; 
		} 

		return size - count; 
	} 

	//Driver method to test above function 
	public static void main(String[] args) 
	{ 
		// TODO Auto-generated method stub 
		int arr[] = {2, 3, 1, 2, 3, 3}; 
		int m = 3; 

		System.out.println(distinctIds(arr, arr.length, m)); 
	} 
} 
//This code is contributed by Sumit Ghosh 

