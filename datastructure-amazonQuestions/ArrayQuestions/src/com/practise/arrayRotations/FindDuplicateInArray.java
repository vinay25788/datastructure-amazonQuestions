package com.practise.arrayRotations;

public class FindDuplicateInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 1,2,2,3 }; 
		//int arr[] = { 1, 2,3,4,4 }; 
		//findDuplicate(arr);
		//duplicate(arr);
		searchDuplicate(arr);
	}
	
	
	public static void searchDuplicate(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[Math.abs(a[i])]>=0)
			{
				a[Math.abs(a[i])] = -a[Math.abs(a[i])];
			}
			else
				System.out.println(Math.abs(a[i]));
		}
	}
	
	
	
	
	
	
	
	public static void duplicate(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[Math.abs(a[i])]>=0)
			{
				a[Math.abs(a[i])] = -a[Math.abs(a[i])];
			}
			else
			  System.out.println(Math.abs(a[i]));
		}
	}
	public static void findDuplicate(int[] a)
	{
		boolean noDuplicate = false;
		int n= a.length;
		for(int i=0;i<n;i++)
		{
			if(a[a[i]%n]>n){
				if(a[a[i]%n]<2*n)
				{
					noDuplicate= true;
					System.out.println(a[i]%n);
				}
			}
			a[a[i]%n]+=n;
		}
	}
}
