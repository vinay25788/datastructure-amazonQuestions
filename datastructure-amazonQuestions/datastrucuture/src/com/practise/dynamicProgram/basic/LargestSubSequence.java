package com.practise.dynamicProgram.basic;

public class LargestSubSequence {
	
	public static int ceilIndex(int[] a,int l,int r,int key)
	{
		while(r-l >1)
		{
			int mid = (r+l)/2;
			if(a[mid] >=key)
				r = mid;
			else
				l = mid;
		}
		return r;
	}
	
	public static int LogestSubSequence(int [] a,int size)
	{
		int[] tailTable = new int[size];
		
		int length =0;
		tailTable[0] = a[0];
		length =1;
		
		for(int i=1;i<size;i++)
		{
			if(tailTable[0] >a[i])
			{
				tailTable[0] = a[i];
			}
			else if( a[i] > tailTable[length -1])
			{
				tailTable[length++] = a[i];
			}
			else
			{
				tailTable[ceilIndex(tailTable, -1, length-1, a[i])] = a[i];
			}
		}
		
		return length;
	}
	public static void main(String[] args) {
		int A[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int n = A.length; 
        System.out.println("Length of Longest Increasing Subsequence is " + LogestSubSequence(A, n)); 
 
	}

}
