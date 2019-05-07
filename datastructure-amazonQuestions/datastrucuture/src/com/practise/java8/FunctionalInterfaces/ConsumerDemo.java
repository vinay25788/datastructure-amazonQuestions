package com.practise.java8.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConsumerDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("vinay");
		list.add("kumar");
		Consumer<List<String>> con =(a)->
		{
			System.out.println(a);
		};
		
		Integer[] ar = {1,2,3,4,5,6,7};
		List<Integer> li = Arrays.asList(ar);
		List<Integer> re = li.stream().filter(i->i>2).map(i->i+2).collect(Collectors.toList());
		boolean re = li.stream().findAny().;
		System.out.println(re);
		con.accept(list);
	}
	

}
