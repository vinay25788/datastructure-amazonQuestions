package src.stringquestion.copystring.customTreadpool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Element
{
	int value;
	int count;
	int index;
}
public class SortElementBasedOnFrequencey {

	public static void main(String[] args) {
		int[] a= {1,2,2,2,2,2,3,4,4,3};
		sortUsingFrequence(a);
	}
	public static void sortUsingFrequence(int[] a)
	{
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.getOrDefault(a[i],1)+1);
			}
			else
				map.put(a[i], map.getOrDefault(a[i], 1));
		}
		List<Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
	System.out.println(list);
	for(Entry<Integer,Integer> entry:list)
	{
		int count = entry.getValue();
		for(int i=0;i<count;i++)
		{
			System.out.print(" "+entry.getKey());
		}
	}
	}
	/*public static void sortUsingFrequence(int[] a)
	{
		Element[] elArray = new Element[a.length];
		for(int i=0;i<a.length;i++)
		{
			elArray[i].value = a[i];
			elArray[i].count= 0;
			elArray[i].index = i;
		}
		
	}*/
	
}
