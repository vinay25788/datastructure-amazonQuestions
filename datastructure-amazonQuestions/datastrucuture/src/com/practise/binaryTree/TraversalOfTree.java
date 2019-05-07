package com.practise.binaryTree;

public class TraversalOfTree {

	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	
	public void inOrder(Node root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.print(" "+root.data);
			inOrder(root.right);
		}
	}
	
	public void preorder(Node root)
	{
		if(root != null)
		{
			System.out.print(" "+root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void postorder(Node root)
	{
		if(root !=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(" "+root.data);
		}
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		TraversalOfTree obj = new TraversalOfTree();
		 System.out.println(" inorder ");
		 System.out.println();
		obj.inOrder(root);
		System.out.println(" preorder ");
		obj.preorder(root);
		System.out.println();
		System.out.println(" post order ");
		System.out.println();
		
		obj.postorder(root);
		
		
	}
}
