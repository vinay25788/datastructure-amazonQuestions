package com.practise.arrayRotations;

import java.util.Arrays;
public class LexiGraphicall {

	public static void main(String[] args) {
		String[] st = {"vinay","kumar","1","2"};
		Integer[] in = {25,10,4,5,8};
		Arrays.stream(in).sorted((a,b)->a.compareTo(b)).forEach(System.out::println);;
	}
}
