package com.practise.binarySearchTree.basic;

public class InsertionAndSearchInBinaryTree {
	
	Node root;
	static  class Node 
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left = this.right = null;
			
		}
	}
	
	public void insert(int data)
	{
		
		insertion(root,data);
	}
	
	public Node insertion(Node root,int data)
	{
		if(root == null)
			{	
			root = new Node(data);
			return root;
			}
		if(root.data>data)
		{
			
			root.left = insertion(root.left,data);
		}
		else if(root.data<data)
		{
			root.right = insertion(root.right,data);
		}
		return root;
	}

	public void inorder(Node root)
	{
		if(root !=null)
		{
			inorder(root.left);
			System.out.print(" "+root.data);
			inorder(root.right);
		}
	}
	
	public static void main(String[] args) {
	
		InsertionAndSearchInBinaryTree obj = new InsertionAndSearchInBinaryTree();
		obj.root = new Node(10);
		obj.insert(4);
		obj.insert(2);
		obj.insert(3);
		obj.insert(15);
		obj.insert(14);
		obj.inorder(obj.root);
	}
}
