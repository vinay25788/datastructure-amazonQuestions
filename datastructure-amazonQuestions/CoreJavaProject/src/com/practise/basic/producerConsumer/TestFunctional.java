package com.practise.basic.producerConsumer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

interface F1
{
	default void m1()
	{
		System.out.println("f1");
	}
}

interface F2
{
	default void m1()
	{
		System.out.println("f2");
	}
}

class FunctionalImpl implements F1,F2
{

	@Override
	public void m1() {
		//F1.super.m1();
		System.out.println(" main");
		F2.super.m1();
	}
	
}
public class TestFunctional {

	public static void main(String[] args) {
		
		LocalDate local = LocalDate.now();
		System.out.println(local);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		FunctionalImpl obj = new FunctionalImpl();
		obj.m1();
		Map<Integer, Integer> map = new HashMap<>();
		map.put(10, 1);
		map.put(2, 10);
		map.put(7, 43);
		map.put(3, 19);
		//List<Entry<Integer, Integer>> list =
				map.entrySet().stream().sorted(Map.Entry.<Integer, Integer> comparingByValue())
				.forEach(System.out::println);
		//System.out.println(list);
		
		
	}
}
