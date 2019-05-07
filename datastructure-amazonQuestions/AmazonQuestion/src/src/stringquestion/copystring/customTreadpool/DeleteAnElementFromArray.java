package src.stringquestion.copystring.customTreadpool;

//Java program to remove a given element from an array 
import java.io.*; 

public class DeleteAnElementFromArray 
{ 
	// This function removes an element x from arr[] and 
	// returns new size after removal. 
	// Returned size is n-1 when element is present. 
	// Otherwise 0 is returned to indicate failure. 
	static int deleteElement(int arr[], int n, int x) 
	{ 
		// If x is last element, nothing to do 
		if (arr[n-1] == x) 
			return (n-1); 

		// Start from rightmost element and keep moving 
		// elements one position ahead. 
		int prev = arr[n-1], i; 
		for (i=n-2; i>=0 && arr[i]!=x; i--) 
		{ 
			int curr = arr[i]; 
			arr[i] = prev; 
			prev = curr; 
		} 

		// If element was not found 
		if (i < 0) 
			return 0; 

		// Else move the next element in place of x 
		arr[i] = prev; 

		return (n-1); 
	} 

	// Driver program to test above function 
	public static void main(String[] args) 
	{ 
		int arr[] = {11, 15, 6, 8, 9, 10}; 
		int n = arr.length; 
		int x = 19; 

		// Delete x from arr[] 
		n = deleteElement(arr, n, x); 

		if(n==0)
			n=arr.length-1;
		System.out.println("Modified array is"); 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i]+" "); 

	} 
} 
/*This code is contributed by Devesh Agrawal*/

