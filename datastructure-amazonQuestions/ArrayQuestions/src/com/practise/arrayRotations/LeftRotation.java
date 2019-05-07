package com.practise.arrayRotations;

import java.util.Arrays;

public class LeftRotation {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		rotate(a,2);
		System.out.println(Arrays.toString(a));
	}
	
	public static void rotate(int[] a,int d)
	{
		reverse(a,0,d-1);
		reverse(a,d,a.length-1);
		reverse(a,0,a.length-1);
	}
	
	public static void reverse(int[] a,int l,int j)
	{
		int temp=0;
		while(l<j)
		{
			temp=a[l];
			a[l] = a[j];
			a[j] = temp;
			l++;
			j--;
		}
	}

}
