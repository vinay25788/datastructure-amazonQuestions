package com.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("vinay");
		list1.add("kumar");
		list1.add("sharma");
		List<String> list2 = new ArrayList<>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		List<String> list4 = null;
		List<List<String>> listOflist = new ArrayList<>();
		listOflist.add(list1);
		listOflist.add(list2);
		
		listOflist.add(list4);
		
		List<String > list3 = convert(listOflist);
		System.out.println(list3);
	}
	
	public static List<String> convert(List<List<String>>  list)
	{
	
		List<String> li = list.stream().filter(i->i!=null).flatMap(x->x.stream()).collect(Collectors.toList());
		//List<String> li = list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		return li;
	}

}
