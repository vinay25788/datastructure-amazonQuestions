package com.practise.arrayRotations;

public class ZigZag {
	public static void main(String[] args) {

	     int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1}; 
	    zigzag(arr);
	}

	public static void zigzag(int[] a)
	{
		boolean flag = true;
		for(int i=0;i<a.length-2;i++)
		{
			if(flag)
			{
				if(a[i]>a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
				
			}
			else 
			{
				if(a[i] <a[i+1])
				{
					int temp =a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
			flag = !flag;
		}
	}
}
