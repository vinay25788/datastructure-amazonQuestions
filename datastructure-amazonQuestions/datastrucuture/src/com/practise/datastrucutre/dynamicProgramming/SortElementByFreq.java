package com.practise.datastrucutre.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class Sort implements Comparator<Integer>
{
	HashMap<Integer,Integer> map;
	Sort(HashMap<Integer,Integer> map)
	{
		this.map =map;
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		int freq = map.get(01).compareTo(map.get(o2))<0?1:-1;
		int val = o1-o2;
		if(freq ==0)
			return val;
		else
			return freq;
		
	}
	
}
public class SortElementByFreq {

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 1, 2, 2, 2,2,2,3, 5, 9, 9,0,0} ;
		sort(arr);
	}
	
	public static void sort(int [] a)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<Integer> list = new ArrayList<>();
		for(int el:a)
		{
			if(map.containsKey(el))
			{
				map.put(el, map.get(el)+1);
			}
			else
				map.put(el, 1);
			list.add(el);
		}
		Sort sor = new Sort(map);
		Collections.sort(list, sor);
		System.out.println(list.toString());
	}
	
}
