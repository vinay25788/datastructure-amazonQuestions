package com.generic;

import java.util.HashMap;
import java.util.Map;

public class DivideByZero {

	public static void main(String[] args) {
		 try {
	           System.out.println(1/0.0); //Infinity
	           System.out.println(1/0.0); //-Infinity
	           System.out.println(0.0/0.0); //NaN
	           Map<Integer,Integer> map = new HashMap<>();
	           map.put(1, 1);
	           map.put(2, 2);
	           map.forEach((i,p)->System.out.println(i));
	           map.entrySet().stream().forEach(System.out::println);
	           //System.out.println(1&&0);
	      } catch (ArithmeticException e) {
	           e.printStackTrace();
	      }
	}
}
