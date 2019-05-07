package com.practise.java8.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
	Function<String,Integer> fun1 = (a)->a.length();
	System.out.println(fun1.apply("vinaykumar"));
	Function<String,Integer> fun2 = (a)->{
		int length = a.length();
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(a.charAt(i)==' ')
				count++;
		}
		return count;
	};
	System.out.println(fun2.apply("vinay    kumar"));
}
}
