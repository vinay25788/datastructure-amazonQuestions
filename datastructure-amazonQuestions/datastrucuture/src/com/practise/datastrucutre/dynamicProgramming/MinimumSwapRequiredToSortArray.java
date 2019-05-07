package com.practise.datastrucutre.dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumSwapRequiredToSortArray {
	public static void main(String[] args) {
		   int []a = {1, 5, 4, 3, 2}; 
		 find(a);
	}
	
	public static void find(int[] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
			map.put(arr[i], i);
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = map.get(arr[i]);
		}
		map=null;
		int val=0;
		int swap=0;
		for(int i=0;i<arr.length;i++)
		{
			val = arr[i];
			if(val == -1)
				continue;
			while(val !=i)
			{
				int newVal = arr[val];
				arr[val ] = -1;
				val = newVal;
				swap++;
			}
				arr[val] =-1;
		}
		System.out.println(swap);
	}

}




