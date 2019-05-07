package com.test.array.rotation;

public class FindSumInSortedRotatedArray {
	public static void main(String[] args) {
		int[] a= {4,5,6,1,2,3};
		int sum  =9;
		findSum(a,sum);
	}
	public static void findSum(int[] a,int sum)
	{
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>a[i+1])
				break;
		}
		int l=(i+1)%a.length;
		int r =i;
		while(l!=r)
		{
			if(a[l]+a[r] ==sum)
			{
				System.out.println(a[l]+" "+a[r]);
				return;
			}
			if(a[l]+a[r] <sum)
				l =(l+1)%a.length;
			else
				r = (a.length+r-1)%a.length;
		}
	}

}
