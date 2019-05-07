package com.practise.hashing.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomNumberFromArray {

	public static void main(String[] args) {
		List a = Arrays.asList(1,2,3,4,5,6,7);
		Random ram = new Random();
		int index = ram.nextInt(a.size());
		System.out.println(a.get(index));
		 index = ram.nextInt(a.size());
		
		System.out.println(a.get(index));
		 index = ram.nextInt(a.size());
		System.out.println(a.get(index));
		 index = ram.nextInt(a.size());
		System.out.println(a.get(index));
	
	}
}
