package com.practise.arrayRotations;

public class MaximumRepeatingElement {
	public static void main(String[] args) {
		int[] a= {1,4,4,4,4,4,4,4,5};
		findMaxRepeate(a);
	}
	public static void findMaxRepeate(int[] a)
	{
		int max=0;
		int n=a.length;
		int index =0;
		for(int i=0;i<n;i++)
		{
			a[a[i]%n]+=n;
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				index =i;
				max=a[i];
			}
		}
		System.out.println(a[index]%n);
	}

}
