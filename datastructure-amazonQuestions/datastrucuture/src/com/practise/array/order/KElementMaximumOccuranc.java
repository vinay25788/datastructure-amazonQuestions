package com.practise.array.order;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KElementMaximumOccuranc {
	
	public static void main(String[] args) {
		int[] a = {2,2,4,5,6,6};
		find(a);
	}

	public static void find(int[] a)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int maxOcc=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(map.containsKey(a[i]))
			{
				int val = map.get(a[i]);
				map.put(a[i], val+1);
				val = val+1;
				if(val>maxOcc)
					maxOcc = val;
				
			}
			else
				map.put(a[i], 1);
		}
		
		
		for(Entry<Integer,Integer> entry : map.entrySet())
		{
			if(entry.getValue() == maxOcc)
				System.out.println(entry.getKey());
		}
		
		
	}
}
