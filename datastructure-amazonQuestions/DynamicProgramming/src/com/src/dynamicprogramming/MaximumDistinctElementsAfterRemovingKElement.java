package com.src.dynamicprogramming;

//Java implementation to find maximum distinct 
//elements after removing k elements 
import java.util.*; 

public class MaximumDistinctElementsAfterRemovingKElement { 
	// function to find maximum distinct elements 
	// after removing k elements 
	static int maxDistinctNum(int[] arr, int n, int k) 
	{ 
			// hash map to store 
			// frequency of each element 
			HashMap<Integer, Integer> map = new HashMap<>(); 

			// priority_queue 'pq' implemented as 
			// max heap 
			PriorityQueue<Integer> pq = 
						new PriorityQueue<>(Collections.reverseOrder()); 
			
			// storing frequency of each element in map 
			for (int i = 0; i < n; i++) { 
				if(map.containsKey(arr[i])) { 
					int val = map.get(arr[i]); 
					val++; 
					map.remove(arr[i]); 
					map.put(arr[i], val); 
					} 

				else
					map.put(arr[i], 1); 
			} 

			// inserting frequency of each element in 'pq' 
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
				pq.add(entry.getValue()); 
			} 
			System.out.println(pq);

			while (k > 0) { 
				// get the top element of 'pq' 
				int temp = pq.poll(); 

				// decrement the popped element by 1 
				temp--; 

				// if true, then push the element in 'pq' 
				if (temp > 0) 
					pq.add(temp); 
				k--; 
			} 

			// Count all those elements that appear 
			// once after above operations. 
			int res = 0; 
			while (pq.size() != 0) { 
				pq.poll(); 
				res++; 
			} 

			return res; 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
			int[] arr = { 5, 7, 5, 5, 1, 2, 2 }; 
			int n = arr.length; 
			int k = 3; 
			System.out.println("Maximum distinct elements = " + 
								maxDistinctNum(arr, n, k)); 
	} 
} 

//This code is contributed by rachana soma 
