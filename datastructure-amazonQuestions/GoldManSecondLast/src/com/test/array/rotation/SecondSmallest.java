package com.test.array.rotation;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] a= {3,5,1,3,8,2};
		find(a);
	}
	public static void find(int[] a)
	{
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				secondSmallest = smallest;
				smallest = a[i];
			}
			else if(a[i]< secondSmallest && a[i] !=smallest)
			{
				secondSmallest =a[i];
			}
		}
		System.out.println(secondSmallest);
	}

}
