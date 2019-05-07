package com.practise.binaryTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AddAllNodeData {
	
	
	public static int add(Node root)
	{
		if (root == null)	
			return 0;
		
			return root.data + add(root.left)+ add(root.right);
	}
	
	/*public static void diogonalSum(Node root)
	{
		Map<Integer,Integer> map = new HashMap<>();
		diagonalSumUtil(root,0,map);
	
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		int val=0;
		
	}
	
	public static void diagonalSumUtil(Node root,int d,Map<Integer,Integer> map)
	{
		if(root)
	}*/
	
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		
		System.out.println(add(root));
	}
}
