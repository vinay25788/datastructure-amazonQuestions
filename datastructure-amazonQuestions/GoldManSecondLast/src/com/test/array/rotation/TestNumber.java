package com.test.array.rotation;

import java.util.ArrayList;
import java.util.List;

public class TestNumber {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		List<Integer> listb = new ArrayList<>();
		lista.add(123);
		listb.add(321);
		System.out.println(result(lista,listb));
	}

	public static int result(List<Integer> lista,List<Integer> listb)
	{
		if(lista.size() != listb.size())
			return -1;
		int count=0;
		while(lista.size()>0 && listb.size()>0)
		{
			int fist = lista.get(0);
			int second = listb.get(0);
			int rem1=0;
			int rem2=0;
			lista.remove(0);
			listb.remove(0);
			while(fist>0 && second>0)
			{
				rem1 = fist%10;
				rem2 = second%10;
				fist =fist/10;
				second =second/10;
				count+=Math.abs(rem1-rem2);
				
				
			}
		}
		return count;
	}
}
