package com.practise.arrayRotations;

public class LargestSumContinuousArray {
	public static void main(String[] args) {
		 int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 }; 
		 findLargestSubArray(a);
	}
	
	public static void findLargestSubArray(int[] a)
	{
		int maxEndingHere=0;
		int maxSofar=0;
		int start =0;
		int s=0;
		int end=0;
		for(int i=0;i<a.length;i++)
		{
			maxEndingHere+=a[i];
			if(maxSofar<maxEndingHere)
			{
				maxSofar = maxEndingHere;
				start = s;
				end = i;
			}
			else if (maxEndingHere<0)
			{
				maxEndingHere=0;
				s=i+1;
			}
		}
		
		System.out.println("sum "+maxSofar+" from "+start+ " to  "+end);
	}

}
