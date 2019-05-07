package com.practise.binarySearchTree.heapdatastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronzidHashMap {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 12);
		Map<Integer,Integer>rest =Collections.synchronizedMap(map);
		Integer[] arr= new Integer[4];
		Thread th = new Thread();
	}

}
