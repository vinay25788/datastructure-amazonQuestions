package com.practise.arrayRotations;

import java.util.Arrays;

//Java program to move all 
//negative numbers to beginning 
//and positive numbers to end 
//keeping order. 
public class SegregatePositiveNegative 
{ 
	
	
	
	public static void seg(int[] a)
	{
		int l=0,h=a.length-1;
		while(l<h)
		{
			while(l<h && a[l]<0)
				l++;
			while(l<h && a[h]>0)
				h--;
			if(l<h)
			{
				int temp =a[l];
				a[l] = a[h];
				a[h] = temp;
			}
		}
	}
static void segregate(int arr[], 
					int n) 
{ 
	
//Count negative numbers 
int count_negative = 0; 
for (int i = 0; i < n; i++) 
	if (arr[i] < 0) 
		count_negative++; 

//Run a loop until all 
//negative numbers are 
//moved to the beginning 
int i = 0, j = i + 1; 
while (i != count_negative) 
{ 

	// If number is negative, 
	// update position of next 
	// positive number. 
	if (arr[i] < 0) 
	{ 
		i++; 
		j = i + 1; 
	} 

	// If number is positive, move 
	// it to index j and increment j. 
	else if (arr[i] > 0 && j < n) 
	{ 
		int t = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = t; 
		j++; 
	} 
} 
} 

//Driver code 
public static void main(String[] args) 
{ 
	int count_negative = 0; 
	int arr[] = { -12, 11, -13, -5, 
				6, -7, 5, -3, -6 }; 
	int n = arr.length; 
	//segregate(arr, n); 
	for (int i = 0; i < n; i++) 
		System.out.print(arr[i] + " ");
	
	System.out.println("new Method");
	seg(arr);
	System.out.println(Arrays.toString(arr));
} 
} 

//This code is contributed 
//by ChitraNayal 

