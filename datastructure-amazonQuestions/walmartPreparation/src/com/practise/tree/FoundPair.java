package com.practise.tree;

import java.util.HashMap;
import java.util.Map;

public class FoundPair {

	public static void main(String[] args) {
		int[] a= {2,6,8,9,3,8,5};
		
		foundPair(a,8);
	}
	
	public static void foundPair(int[] a,int sum)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int el:a)
		{
			if(map.containsKey(el))
			{
				System.out.println(el+" "+map.get(el));
			}
			else
				map.put(sum-el, el);
		}
	}
}
