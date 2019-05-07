package com.practise.arrayRotations;

import java.util.Arrays;

public class MoveZeroToEndOfArray {
	public static void main(String[] args) {
		int a[]= {1,0,0,2,0,3,4};
		moveZero(a);
		System.out.println(Arrays.toString(a));
	}
	public static void moveZero(int[] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp = a[count];
				a[count] = a[i];
				a[i] = temp;
				count++;
			}
			
		}
		
		/*while(count<a.length)
		{
			a[count] =0;
			count++;
		}*/
	}

}
