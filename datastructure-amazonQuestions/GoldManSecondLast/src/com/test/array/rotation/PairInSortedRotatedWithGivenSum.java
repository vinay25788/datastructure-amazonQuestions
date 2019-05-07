package com.test.array.rotation;

public class PairInSortedRotatedWithGivenSum {
	public static void main(String[] args) {
		int[] a= {4,5,1,2,3,};
		int sum = 7;
		findSum(a,sum);
	}
	public static void findSum(int[] a,int sum)
	{
		int i=0;
		for(;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
				break;
		}
		int l=(i+1)%a.length;
		int r =i;
		int count=0;
		while(l!=r)
		{
			if(a[l]+a[r]==sum)
			{
				System.out.println(a[l]+" "+a[r]);
				break;
			}
			if(a[l]+a[r]<sum)
			{
				l=(l+1)%a.length;
			}
			else
			{
				r = (a.length+r-1)%a.length;
			}
		}
		
	}
}
