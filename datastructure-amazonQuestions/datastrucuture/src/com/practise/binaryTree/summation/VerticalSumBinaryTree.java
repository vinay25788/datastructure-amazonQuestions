package com.practise.binaryTree.summation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.practise.binaryTree.summation.RootToLeafPathSum.Node;

public class VerticalSumBinaryTree {
	
	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right =null;
		}
	}

	public void verticalSum(Node root)
	{
		if(root == null)
			return;
		Map<Integer,Integer> map = new LinkedHashMap<>();
		verticalSumUtil(root,0,map);
		for(Entry<Integer,Integer> entry:map.entrySet())
			System.out.println(entry.getValue());
	}
	
	public void verticalSumUtil(Node root, int d,Map<Integer,Integer> map)
	{
		if(root == null)
			return ;
		verticalSumUtil(root.left, d-1, map);
		
		int value = map.get(d) ==null ?0:map.get(d);
		
		map.put(d, value+root.data);
		
		verticalSumUtil(root.right, d+1, map);
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(5);
		root.left.right = new Node(6);
		VerticalSumBinaryTree obj = new VerticalSumBinaryTree();
		obj.verticalSum(root);
	}
	
}
