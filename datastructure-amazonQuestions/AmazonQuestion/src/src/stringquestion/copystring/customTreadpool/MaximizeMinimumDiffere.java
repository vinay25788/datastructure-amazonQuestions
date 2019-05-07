package src.stringquestion.copystring.customTreadpool;

import java.util.ArrayList;
//Java program to find the minimum possible 
//difference between maximum and minimum 
//elements when we have to add/subtract 
//every number by k 
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

public class MaximizeMinimumDiffere { 

	// Modifies the array by subtracting/adding 
	// k to every element such that the difference 
	// between maximum and minimum is minimized 
	static int getMinDiff(int arr[], int n, int k) 
	{ 
		if (n == 1) 
		return 0; 

		// Sort all elements 
		Arrays.sort(arr); 

		// Initialize result 
		int ans = arr[n-1] - arr[0]; 

		// Handle corner elements 
		int small = arr[0] + k; 
		int big = arr[n-1] - k; 
		int temp = 0; 
		
		if (small > big) 
		{ 
			temp = small; 
			small = big; 
			big = temp; 
		} 

		// Traverse middle elements 
		for (int i = 1; i < n-1; i ++) 
		{ 
			int subtract = arr[i] - k; 
			int add = arr[i] + k; 

			// If both subtraction and addition 
			// do not change diff 
			if (subtract >= small || add <= big) 
				continue; 

			// Either subtraction causes a smaller 
			// number or addition causes a greater 
			// number. Update small or big using 
			// greedy approach (If big - subtract 
			// causes smaller diff, update small 
			// Else update big) 
			if (big - subtract <= add - small) 
				small = subtract; 
			else
				big = add; 
		} 

		return Math.min(ans, big - small); 
	} 

	// Driver function to test the above function 
	public static void main(String[] args) 
	{ 
		int arr[] = {2,5, 6,8}; 
		Arrays.sort(arr);
		int n = arr.length; 
		int k = 10; 
		System.out.println("Maximum difference is "+ 
							getMinDiff(arr, n, k)); 
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 10);
		map.put(3, 14);
		map.put(5, 20);
		/*List<Integer> list = new ArrayList<>(map.values());
		System.out.println(
				list.stream().max(new Comparator<Integer>()
						{

							@Override
							public int compare(Integer o1, Integer o2) {
								// TODO Auto-generated method stub
								return o1.compareTo(o2);
							}
					
						}));*/
		
		System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue()); 
 
		
				
		System.out.println();
	} 
} 
//This code is contributed by Prerna Saini 
