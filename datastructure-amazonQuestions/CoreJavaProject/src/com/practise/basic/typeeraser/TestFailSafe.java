package com.practise.basic.typeeraser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailSafe {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Iterator<Integer> it = list.iterator();
		Iterator<Integer> it2 = list.iterator();
		
		int i=0;
		while(it.hasNext())
		{
			if(it.next() == 2) {
				it.remove();
			}
			//System.out.println(list.get(i++));
			//list.add(2);
		}
		while(it2.hasNext())
		{
			if(it2.next() == 2) {
				it2.remove();
			}
			//System.out.println(list.get(i++));
			//list.add(2);
		}
		System.out.println(list);
	}

}
