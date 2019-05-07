package com.practise.binaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DiagonalPrint {
	
	Node root;
	
	public static  void diagornalPrint(Node root)
	{
		Map<Integer,List<Integer>> map = new HashMap<>();
		
		diagonalPrintUtil(root,0,map);
		
		for(Entry<Integer,List<Integer>> entry:map.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}

	public static void diagonalPrintUtil(Node root,int d,Map<Integer,List<Integer>> map)
	{
		if(root == null)
			return;
		List<Integer> list= map.get(d);
		if(list == null)
		{
			list = new LinkedList<>();
			list.add(root.data);
		}
		else
		{
			list.add(root.data);
		}
		
		map.put(d, list);
		diagonalPrintUtil(root.left, d+1, map);
		diagonalPrintUtil(root.right, d, map);
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		diagornalPrint(root);
	}
}
