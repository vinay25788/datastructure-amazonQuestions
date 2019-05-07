package com.practise.arrayRotations;

public class NextGreateElement {
	public static void main(String[] args) {
		int arr[] = { 11, 13, 21, 3 };  
		nextGreater(arr);
	}
	public static void nextGreater(int[] a)
	{
		int max = a[a.length-1];
		System.out.println(max+" -1");
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[i]>max)
			{
				System.out.println(a[i]+ " "+max );
			}
			else
			{
				max = a[i];
				System.out.println(a[i]+ " -1");
			}
		}
	}

}
