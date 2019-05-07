package com.src.dynamicprogramming;

//A Dynamic Programming based Java 
//implementation to count decodings 
import java.io.*; 

public class DecodingDigit 
{ 
	
//A Dynamic Programming based 
//function to count decodings 
static int countDecodingDP(char digits[], 
						int n) 
{ 
	// A table to store results of subproblems 
	int count[] = new int[n + 1]; 
	count[0] = 1; 
	count[1] = 1; 

	for (int i = 2; i <= n; i++) 
	{ 
		count[i] = 0; 

		// If the last digit is not 0, 
		// then last digit must add to 
		// the number of words 
		if (digits[i - 1] > '0') 
			count[i] = count[i - 1]; 

		// If second last digit is smaller 
		// than 2 and last digit is smaller 
		// than 7, then last two digits 
		// form a valid character 
		if (digits[i - 2] == '1' || (digits[i - 2] == '2' && digits[i - 1] < '7')) 
			count[i] += count[i - 2]; 
	} 
	return count[n]; 
} 

//Driver Code 
public static void main (String[] args) 
{ 
	char digits[] = {'1','2','3','4'}; 
	int n = digits.length; 
	System.out.println("Count is " + 
			countDecodingDP(digits, n)); 
} 
} 

//This code is contributed by anuj_67 
