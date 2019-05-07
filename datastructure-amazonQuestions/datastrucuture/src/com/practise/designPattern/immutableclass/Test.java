package com.practise.designPattern.immutableclass;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<Integer,Integer> ma = new HashMap<>();
		Map<Integer,Integer> ma2 = new HashMap<>();
		if(ma == ma2)
			System.out.println(" true");
		else
			System.out.println(" false");
	}
}
