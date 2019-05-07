package com.practise.designPattern.externalserialization.demo;

import java.util.HashSet;

class TestEnum
{
	
}
public class EnumDemo {
	public enum Currency {
		PICK(5),INR(10),EURO(16);
		
		private int value;
		private Currency(int value) {
			 this.value = value;
		}
		
		public int getValue()
		{
			return value;
		}
	}
	public static void main(String[] args) {
		Currency c = Currency.EURO;
		System.out.println(c.value);
		System.out.println(Currency.values());
		HashSet<Integer> set;
		Object obj;
		//ClassLoader;
		for(Currency cu:Currency.values())
			System.out.println(cu+" :"+cu.value +" "+cu.name()+" "+cu.ordinal() +" value "+cu.getValue());
	}
}
