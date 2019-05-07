package com.practise.arrayRotations;

import java.util.Arrays;

public class RearrangeMaxMinElementInArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		rearrange(a);
	}
	public static void rearrange(int[] a)
	{
		int max_ind = a.length-1;
		int min_ind = 0;
		int maxEle = a[max_ind]+1;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				a[i]+=(a[max_ind]%maxEle)*maxEle;
				max_ind--;
			}
			else
				{
				a[i]+=(a[min_ind]%maxEle)*maxEle;
				min_ind++;
				}
		}
		
		for(int e:a)
		{
			System.out.print(" "+e/maxEle);
		}
	}

}
