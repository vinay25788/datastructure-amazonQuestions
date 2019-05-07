package com.practise.arrayRotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrangeGivenNumberToformBiggerNumber {
	public static void main(String[] args) {
		/*
		 * arr.add("54"); 
        arr.add("546"); 
        arr.add("548"); 
        arr.add("60"); 
		 */
		List<String> list = new ArrayList<>();
		list.add("54");
		list.add("546");
		list.add("548");
		list.add("60");
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String x, String y) {
				
				String xy = x+y;
				String yx = y+x;
				
				return xy.compareTo(yx)<0?1:-1;
			}
		});
		for(String s:list)
		{
			System.out.print(s);
		}
	}

}
