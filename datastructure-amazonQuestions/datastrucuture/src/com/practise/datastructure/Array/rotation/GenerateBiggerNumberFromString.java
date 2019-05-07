package com.practise.datastructure.Array.rotation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class GenerateBiggerNumberFromString {
	public static void main(String[] args) {
		
		List<String> vec = new ArrayList<>();
		vec.add("54");
		vec.add("546");
		vec.add("548");
		vec.add("60");
		printLargest(vec);
		
	}
	
	public static void printLargest(List<String> list)
	{

		Collections.sort(list, new Comparator<String> () {

			@Override
			public int compare(String x, String y) {
				// TODO Auto-generated method stub
				
				String xy = x+y;
				String yx = y+x;
				
				return xy.compareTo(yx)>0? -1:1;
				
				
			}
			
		});
		
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
	}

}
