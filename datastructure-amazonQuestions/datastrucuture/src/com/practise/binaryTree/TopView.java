package com.practise.binaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class TopView {
	
	static  class Pair
	{
		Node node;
		int level;
		
		public Pair() {
			// TODO Auto-generated constructor stub
		}
		Pair(Node node,int data)
		{
			this.node = node;
			this.level = data;
		}
		
		
	}

	public static void printTop(Node root)
	{
		Map<Integer,Pair> map = new HashMap<Integer,Pair>();
		printTopViewUtil(root,0,map,0);
		
		
		
		for(Entry<Integer,Pair> entry:map.entrySet())
		{
				System.out.println(entry.getValue().node.data);
		}
	}
	
	public static void printTopViewUtil(Node root,int d,Map<Integer,Pair> map,int level)
	{
		if(root == null)
			return;
		
		if(map.get(d) == null) 
		{
			
			//System.out.println(root.data); 
			map.put(d, new Pair(root,level));
		}
		else if(map.get(d) != null && map.get(d).level> level)
		{
			map.put(d, new Pair(root,level));
		}
		printTopViewUtil(root.left, d-1, map,level+1);
		printTopViewUtil(root.right, d+1, map,level+1);
	}
	
	
	public static void printLeftAndRight(Node root)
	{
		if(root != null)
		{
			Level level = new Level();
			Level level2 = new Level();
			System.out.println(root.data);
			printLeft(root,0,level);
			printRight(root,0,level2);
		}
	}
	static class Level
	{
		int level;
	}
	public  static void printLeft(Node root,int l,Level level)
	{
	
		if(root == null)
		{
			return ;
		}
		if(level.level<l)
		{
			System.out.println(root.data);
			level.level = l;
		}
		
		printLeft(root.left, l+1, level);
		printLeft(root.right, l+1, level);
		
	}
	public static void printRight(Node root,int l,Level level)
	{
		
		if(root == null)
		{
			return ;
		}
		if(level.level<l)
		{
			System.out.println(root.data);
			level.level = l;
		}
		
		printRight(root.right, l+1, level);
		printRight(root.left, l+1, level);
		
	}
	public static void main(String[] args) {
		Node root = new Node(1); 
	    root.left = new Node(2); 
	    root.right = new Node(3); 
	    root.left.right = new Node(4); 
	    root.left.right.right = new Node(5); 
	    root.left.right.right.right = new Node(6); 
	    
	   // printTop(root);
	    
       root = new Node(15); 
        root.left = new Node(10); 
        root.right = new Node(20); 
        root.left.left = new Node(8); 
        root.left.right = new Node(12); 
        root.right.left = new Node(16); 
        root.right.right = new Node(25); 
        printLeftAndRight(root);
	}
	
}
