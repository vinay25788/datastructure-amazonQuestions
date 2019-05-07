package com.test.array.rotation;

import java.util.Arrays;

public class RevereseTheArray {

	public static void main(String[] args) {
		 int a[] = {1, 2, 3, 4, 5, 6}; 
		 reverse(a);
		 System.out.println(Arrays.toString(a));
		 String st="vinay";
		 reveseString(st);
		 
	}
	public static void reveseString(String a)
	{
		char[] ch = a.toCharArray();
		int l=0;
		int r=a.length()-1;
		while(l<r)
		{
			ch[l]^=ch[r];
			ch[r]^=ch[l];
			ch[l]^=ch[r];
			l++;
			r--;
		}
		System.out.println(String.valueOf(ch));
	}
	public static void reverse(int[] a)
	{
		int l=0;
		int r = a.length-1;
		int temp=0;
		while(l<r)
		{
			temp =a[l];
			a[l] =a[r];
			a[r] =temp;
			l++;
			r--;
		}
	}
}
