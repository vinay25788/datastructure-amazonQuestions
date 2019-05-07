package com.practise.datastructure.Array.rotation;

public class SumPairInRotatedSortedArray {
	
	public static void main(String[] args) {
		int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; 
		int sum = 8;
		int count = findPair(a,sum);
		System.out.println(" number of pair "+count);
	}

	public static int findPair(int[] a,int sum)
	{
		int low=0;
		int high = a.length-1;
		int count=0;
		while(high >low)
		{
			if(a[low]+a[high] == sum)
				count++;
			low++;
			high--;
		}
		return count;
	}
}
