package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class Sort implements Comparator<Integer>
{
	
	private HashMap<Integer,Integer> map;
	
	Sort(HashMap<Integer,Integer> map)
	{
		this.map =map;
	}
	
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		int freq=map.get(o1).compareTo(map.get(o2))<0?1:-1;
		int val = o1.compareTo(o2);
		
		if(freq==0)
			return val;
		return freq;
		
	}
	
}

public class SortElementBasedOnFrequency {
	
	public static void main(String[] args) {
		Integer[] a = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 }; 
		sort(a);
	}
	public static void sort(Integer[] a)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
				map.put(a[i], 1);
		}
		Sort sort = new Sort(map);
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list, sort);
		for(Integer i:list)
		{
			System.out.print(i+" ");
		}
		
	}
	

}
