package com.src.practise.doubleLinkedList;

import java.util.Map;
import java.util.TreeMap;

public class TestDigitAnagram {
 public static void main(String[] args) {
	int a=37;
	int b= 73;
	int temp=a;
	Map<Integer,Integer> map = new TreeMap<>();
	while(temp!=0)
	{
		int rem = temp%10;
		temp = temp/10;
		if(map.get(rem)!=null)
		{
			map.put(rem, map.get(rem)+1);
		}
		map.put(rem, 1);
	}
	System.out.println(map);
}
}
