package com.practise.hashing.easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RepeatingElementInArray {
	public static void main(String[] args) {
		 int arr[] = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 }; 
		 findRepeating(arr);
	}
	
	public static void findRepeating(int[] a)
	{
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(set.contains(a[i]))
			{
				System.out.println(" repeating element "+a[i]);
				return;
			}
			else
				set.add(a[i]);
		}
		
		
	}

}
