package com.practise.datastructure.Array.rotation;

import java.util.Arrays;

public class EvenIndexSmallerOddIndexGreater {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,8};
		arrange(a);
	}
	
	public static void arrange(int[] a)
	{
		Arrays.sort(a);
		int[] temp = new int[a.length];
		int p=0,	q=a.length-1;
		int count=0;
		for(int i=0;i<a.length && count<a.length;i++)
		{
			if(i%2 ==0)
			{
				temp[count] = a[p++];
				count++;
			}
			
			if(i%2 !=0)
			{
				temp[count] = a[q];
				q--;
				count++;
			}
		
		}
		
		
		for(int i=0;i<a.length;i++)
			System.out.print(" "+temp[i]);
	}

}
