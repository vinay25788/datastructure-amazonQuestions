package com.practise.companyInterviewQuestion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FindPairWithGivenDifference {
	public static void main(String[] args) {
	
		int a[] = {1, 8, 30, 40, 100,160}; 
        int n = 60; 
        differ(a,60);
        findDiff(a,60);
        Map<Integer ,Integer> ma = new ConcurrentHashMap<>();
        
	}
	
	public static void findDiff(int[] a,int n)
	{
		int i=0,j=1;
		int count=0;
		while(i<a.length && j<a.length)
		{
			if(i!= j && a[j]-a[i]== n)
			{
				count++;
				System.out.println("first "+a[i] +" second "+a[j]);
				i++;
				j++;
			}
			else if (a[j] - a[i]> n)
				i++;
			else 
				j++;
		}
		
		System.out.println(" total number of pair "+count);
	}

	public static void differ(int[] a,int n)
	{
		int start =0,end =a.length-1;
		int count=0;
		
		while(start<end)
		{
			if(a[end]-a[start] == n ) 
			{
				count++;
				start++;
				end--;
			}
			else if (a[end]-a[start] >n)
			{
				start++;
			}
			else
				end--;
		}
		System.out.println(" count "+count);
	}
}
