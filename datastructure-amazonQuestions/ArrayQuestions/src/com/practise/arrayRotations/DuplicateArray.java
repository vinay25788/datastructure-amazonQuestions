package com.practise.arrayRotations;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,2,3,3,3,4};
		//duplicateEelement(a);
		findDup(a);
	}
	
	public static void findDup(int[] a)
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			if(a[Math.abs(a[i])]>=0)
			{
				a[Math.abs(a[i])]=-a[Math.abs(a[i])];
			}
			else
				System.out.println(Math.abs(a[i]));
			
		}
	}
	public static void duplicateEelement(int[] a)
	{
		int n= a.length;
		for(int i=0;i<n;i++)
		{
			a[a[i]%n]+=n;
		}
		for(int i=0;i<n;i++)
		{
			if(a[a[i]%n]>n)
			{
				System.out.println(a[i]%n);
			}
		}
	}

}
