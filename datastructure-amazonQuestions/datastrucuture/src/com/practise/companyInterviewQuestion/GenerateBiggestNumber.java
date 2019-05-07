package com.practise.companyInterviewQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class NumberComparator implements Comparator<String>
{

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		String ab = a+b;
		String ba = b+a;
		
		return ab.compareTo(ba) > 0 ?-1:1;
	}
	
}


public class GenerateBiggestNumber {

	public static void printLargest(List<String> list)
	{
		String num="";
		NumberComparator com = new NumberComparator();
		Collections.sort(list, com);
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String ob = it.next();
			System.out.print(ob);
		}
	}
	
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		 arr.add("54"); 
	        arr.add("546"); 
	        arr.add("548"); 
	        arr.add("60"); 
	        
	        printLargest(arr);
	}
}
