package com.test.array.rotation;

import java.util.Arrays;

public class LeftRotate {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int d=2;
		leftRotate(a,d);
		System.out.println(Arrays.toString(a));
	}
	
	public static void leftRotate(int[] a,int d)
	{
		reverse(a,0,d-1);
		reverse(a,d,a.length-1);
		reverse(a,0,a.length-1);
	}
	
	public static void reverse(int[] a,int l,int h)
	{
		while(l<h)
		{
			int temp = a[l];
			a[l]=a[h];
			a[h] =temp;
			l++;
			h--;
		}
	}

}
