package com.practise.tree;

public class TreePreorder {
	
	Node head;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void preOrder(Node root)
	{
		if(root!=null)
		{
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	
	public static void preOrderIter(Node root)
	{
		Node temp = root;
		
	}

}
