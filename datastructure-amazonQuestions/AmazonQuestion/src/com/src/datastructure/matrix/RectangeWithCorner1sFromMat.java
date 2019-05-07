package com.src.datastructure.matrix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RectangeWithCorner1sFromMat {
	public static void main(String[] args) {
		int mat[][]={ { 1, 0, 0, 1, 0 },  
                { 0, 0, 1, 0, 1 },  
                { 0, 0, 0, 1, 0 },  
                { 1, 0, 1, 0, 1 } };  
		boolean res = findRectable(mat);
		System.out.println("Result-->"+res);
	}
	public static boolean findRectable(int[][] mat)
	{
		int rows = mat.length;
		if(rows == 0)
			return false;
		int cols = mat[0].length;
		HashMap<Integer,Set<Integer>> map = new HashMap<>();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols-1;j++)
			{
				for(int k=j+1;k<cols;k++)
				{
					if(map.containsKey(j) && map.get(j).contains(k))
					{
						return true;
					}
					if(map.containsKey(k) && map.get(k).contains(j))
						return true;
					
					if(!map.containsKey(j))
					{
						Set<Integer> x= new HashSet<>();
						x.add(k);
						map.put(j, x);
					}
					else
						map.get(j).add(k);
					if(!map.containsKey(k))
					{
						Set<Integer> x= new HashSet<>();
						x.add(j);
						map.put(k, x);
					}
					else
						map.get(k).add(j);
					
					System.out.println(map);
				}
			}
		}
		return false;
	}
}












