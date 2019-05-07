package com.practise.array.order.optimization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortTheArrayByFrequency {

	public static void main(String[] args) {
		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 }; 
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		for(int ele:array)
		{
			int val = map.getOrDefault(ele, 0);
			map.put(ele, val+1);
			list.add(ele);
		}
		
		SortComparator obj = new SortComparator(map);
		
		Collections.sort(list, obj);
		for(int val:list)
		{
			System.out.print(" "+val);
		}
	}
}

class SortComparator implements Comparator<Integer>
{

	Map<Integer ,Integer> map;
	
	public SortComparator(Map<Integer,Integer> map) {
		// TODO Auto-generated constructor stub
		this.map = map;
	} 
	
	@Override
	public int compare(Integer a,Integer b) {
		// TODO Auto-generated method stub
		
		int freqCom = map.get(b).compareTo(map.get(a));
		int valCom = a.compareTo(b);
		
		if(freqCom == 0)
			return valCom;
		else
			return freqCom;
		
	}
	
}
