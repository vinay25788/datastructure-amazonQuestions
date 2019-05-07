package com.test.array.rotation;

public class MedianOfTwoSortedArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {5,6,7,8,9};
		System.out.println(findMedian(a,b));
	}
	public static double findMedian(int[] a,int [] b)
	{
		double result=0d;
		if(a.length>b.length)
		{
			return findMedian(b, a);
		}
		int sizeA =a.length;
		int sizeB=b.length;
		int l=0;
		int h=sizeA;
		while(l<=h)
		{
			int partA = (l+h)/2;
			int partB = (sizeA+sizeB+1)/2-partA;
			int maxLeftA= partA==0?Integer.MIN_VALUE:a[partA-1];
			int minRightA = partA==sizeA?Integer.MAX_VALUE:a[partA];
			
			int maxLeftB= partB==0?Integer.MIN_VALUE:b[partB-1];
			int minRightB = partB==sizeB?Integer.MAX_VALUE:b[partB];
			if(maxLeftA<=minRightB && maxLeftB<=minRightA)
			{
				if((sizeA+sizeB)%2==0)
					return (double)(Math.max(maxLeftB, maxLeftA)+Math.min(minRightA,minRightB))/2;
				else
					return (double)(Math.max(maxLeftB, maxLeftA));
			}
			else if(maxLeftA>minRightB)
			{
				h=partA-1;
			}
			else
				{
				l=partA+1;
				}
		}
		
		return result;
	}

}
