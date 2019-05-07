package com.practise.arrayRotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		int a[]= {10, 20, 20, 10, 10, 30, 50, 10, 20};
		findUnMachedPair(a);
	}
	public static void findUnMachedPair(int[] a)
	{
		Map<Integer,Integer> map = new TreeMap<>();
		for(int el:a)
		{
			map.put(el, map.getOrDefault(el, 0)+1);
		}
		List<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			if(entry.getValue()%2 !=0)
			{
				list.add(entry.getKey());
				//System.out.print(" "+entry.getKey());
			}
		}
		System.out.println(list.size());
		for(int el:list)
			System.out.print(el+" ");
	}
}
