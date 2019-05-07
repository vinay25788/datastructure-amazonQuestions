package com.practise.arrayRotations;

public class MinimumDistanceBetweenTwoNumber {
	public static void main(String[] args) {
		  int arr[] = {3, 5, 4, 2, 26, 6, 0, 0, 5, 4, 16, 6}; 
	        int n = arr.length; 
	        int x = 5; 
	        int y = 6; 
	        minDistance(arr,n,x,y);
	}
	
	public static void minDistance(int[] a,int n,int x,int y)
	{
		int i=0;
		int first=0;
		int minDistance = a.length;
		for(i=0;i<a.length;i++)
		{
			if(a[i] == x || a[i] == y)
			{
				first=i;
				break;
			}
		}
		
		for(i=first+1;i<a.length;i++)
		{
			if(a[i] == x || a[i] == y) {
			if(a[i] != a[first] && minDistance >=i-first)
			{
				minDistance = i-first;
				first = i;
			}
			else
				first = i;
			}
		}
		System.out.println(minDistance);
	}
}
