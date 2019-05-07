package com.practise.companyInterviewQuestion;

public class LargestSumContinousSubArray {
	public static void main(String[] args) {
		
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		largestSumSubArray(a);
	}

	public static void largestSumSubArray(int[] a)
	{
		int max_ending=0,max_so_far =0;
		
		for(int i=0;i<a.length;i++)
		{
			max_ending = max_ending+a[i];
			if(max_so_far <max_ending)
				max_so_far = max_ending;
			if(max_ending <0)
				max_ending =0;
		}
		
		System.out.println("largest sum "+max_so_far);
	}
}
