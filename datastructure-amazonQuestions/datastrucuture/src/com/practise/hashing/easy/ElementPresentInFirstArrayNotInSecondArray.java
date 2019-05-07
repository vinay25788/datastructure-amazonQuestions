package com.practise.hashing.easy;

import java.util.HashSet;
import java.util.Set;

public class ElementPresentInFirstArrayNotInSecondArray {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int[] b = {4,5,6,7};
		
		findElement(a,b);
	}
	
	public static void findElement(int[] a,int[] b)
	{
		Set<Integer> first = new HashSet<>();
		
		for(int i=0;i<b.length;i++)
		{
			first.add(b[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(!first.contains(a[i]))
			{
				System.out.print(" "+a[i]);
			}
		}
	}

}
