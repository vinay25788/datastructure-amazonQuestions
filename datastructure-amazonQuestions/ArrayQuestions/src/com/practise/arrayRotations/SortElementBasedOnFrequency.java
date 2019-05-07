package com.practise.arrayRotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortElementBasedOnFrequency {
	public static void main(String[] args) {
		int[] a = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 }; 
		sort(a);
	}
	public static void sort(int[] a)
	{
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int e:a)
		{
			int val = map.getOrDefault(e, 0);
			map.put(e, val+1);
			list.add(e);
		}
		
		Collections.sort(list, new SortComparator(map));
		for(int al:list)
			System.out.print(" "+al);
	}
	
	
}
 class SortComparator implements Comparator<Integer>
{
	
	private Map<Integer,Integer> map;
	
	public SortComparator(Map<Integer,Integer> map) {
		this.map = map;
	}

	@Override
	public int compare(Integer o1, Integer o2) {

		int freqC = map.get(o1).compareTo(map.get(o2));
		
		if(freqC == 0)
			return o1.compareTo(o2);
			
		if(freqC == -1)
			return 1;
		else if (freqC == 1)
			return -1;
		else
			return 0;
		
		/*if(freqC ==0)
			return valc;
		else 
			return freqC;*/
		
	}
	
	
	
}