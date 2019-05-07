package com.practise.datastrucutre.dynamicProgramming;

public class UnionAndIntersectionOfTwoSortedArray {
	public static void main(String[] args) {
		  int a[] = {1, 2, 4, 5, 6}; 
	        int b[] = {2, 3, 5, 7};
	        System.out.println("union");
	        findUnion(a,b);
	        System.out.println();
	        System.out.println("intersection of two array");
	        findIntersection(a,b);
	}
	
	public static void findUnion(int[] a,int [] b)
	{
		int i=0,j=0;
		int n=a.length;
		int m=b.length;
		while(i<n ||  j<m)
		{
			if(i<n &&  j<m &&a[i]<b[j])
			{
				System.out.print(a[i++]+" ");
			}
			else if(i<n &&  j<m && a[i]>b[j])
			{
				System.out.print(b[j++]+" ");
			}
			else
			{
				System.out.print(b[j++]+" ");
				i++;
			}
		}
		
	}
	
	public static void findIntersection(int[] a,int[] b)
	{
		int i=0,j=0;
		int n=a.length;
		int m=b.length;
		while(i<n && j<m)
		{
			if(i<n &&  j<m &&a[i]<b[j])
			{
				i++;
			}
			else if(i<n &&  j<m && a[i]>b[j])
			{
				j++;
			}
			else 
			{
				System.out.print(a[i]+" ");
				j++;
				i++;
			}
			
		}
	}

}
