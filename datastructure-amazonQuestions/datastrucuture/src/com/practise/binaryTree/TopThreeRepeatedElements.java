package com.practise.binaryTree;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopThreeRepeatedElements {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 2, 3, 16, 3, 15,  
                16, 15, 15, 16, 2, 3 }; 
		
		findTop(arr);
		
	}
	
	static class Ele
	{
		int first;
		int second;
	}
	public static void findTop(int[] a)
	{
		int first=0,second=0,third=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		Map<Integer,Ele> map2 = new HashMap<>();
		int max=0;
		
		
		
		for(int e:a)
		{
			if(map.containsKey(e))
			{
				int val = map.get(e)+1;
				if(max<val)
					max = val;
				map.put(e, val);
			}
			else
				map.put(e, 1);
			
		}
		
		
		
	}
}
