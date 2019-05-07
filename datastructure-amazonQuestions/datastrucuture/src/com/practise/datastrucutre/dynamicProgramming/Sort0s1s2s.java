package com.practise.datastrucutre.dynamicProgramming;

import java.util.Arrays;

public class Sort0s1s2s {
	public static void main(String[] args) {
		int[] a= {1,1,0,0,2,2,0,2,1,0,2,2,2,2};
		arange(a);
	}
	public static void arange(int[] a)
	{
		int i=0,j=a.length-1;
		int k=0;
		int temp =0;
		while(k<a.length && k<=j)
		{
			switch(a[k])
			{
			case 0:    
					 temp =a[i];
					a[i] = a[k];
					a[k] = temp;
					i++;
					k++;
					break;
			case 1:
					k++;
					break;
			case 2:
					 temp = a[k];
					a[k] = a[j];
					a[j] = temp;
					j--;
					
					break;
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

}
