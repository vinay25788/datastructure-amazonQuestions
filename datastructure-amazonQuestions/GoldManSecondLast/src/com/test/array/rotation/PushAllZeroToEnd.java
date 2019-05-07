package com.test.array.rotation;

import java.util.Arrays;

public class PushAllZeroToEnd {
	
	public static void main(String[] args) {
		int[] a= {1,20,3,0,5,0,8,0};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp =a[i];
				a[i] = a[count];
				a[count] = temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
