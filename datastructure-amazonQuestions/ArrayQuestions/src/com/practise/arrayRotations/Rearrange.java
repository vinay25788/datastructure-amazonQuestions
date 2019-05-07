package com.practise.arrayRotations;

import java.util.Arrays;
import java.util.HashSet;

public class Rearrange {
	public static void main(String[] args) {
		  int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}; 
		  arrange(arr);
		  System.out.println(Arrays.toString(arr));
		  System.out.println("using Hashset");
		  usingHashSet(arr);
	}
	public static void usingHashSet(int[] arr)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
			set.add(arr[i]);
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(i))
			{
				arr[i] = i;
			}
			else arr[i] = -1;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void arrange(int[] arr)
	{
		for(int i=0;i<arr.length;)
		{
			if(arr[i] !=-1 && arr[i] !=i)
			{
				int el = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = el;
			}
			else
				i++;
			
		}
	}

}
