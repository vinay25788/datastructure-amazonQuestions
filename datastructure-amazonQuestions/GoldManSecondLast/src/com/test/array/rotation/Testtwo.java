package com.test.array.rotation;

//Java program to find minimum 
//increment/decrement operations 
//to make array elements same. 
import java.util.Arrays; 
import java.io.*; 

public class Testtwo 
{ 
static int MinOperation(int a[], 
						int b[], 
						int n) 
{ 
	// sorting both arrays 
	// in ascending order 
	Arrays.sort(a); 
	Arrays.sort(b); 
	

	// variable to store 
	// the final result 
	int result = 0; 

	// After sorting both arrays 
	// Now each array is in non- 
	// decreasing order. Thus, 
	// we will now compare each 
	// element of the array and 
	// do the increment or decrement 
	// operation depending upon the 
	// value of array b[]. 
	for (int i = 0; i < n; ++i) 
	{ 
		if (a[i] > b[i]) 
			result = result + 
					Math.abs(a[i] - b[i]); 

		else if (a[i] < b[i]) 
			result = result + 
					Math.abs(a[i] - b[i]); 
	} 

	return result; 
} 

//Driver code 
public static void main (String[] args) 
{ 
	int a[] = {123}; 
	int b[] = {321}; 
	int n = a.length; 
	System.out.println(MinOperation(a, b, n)); 
} 
} 

//This code is contributed 
//by akt_mit 
