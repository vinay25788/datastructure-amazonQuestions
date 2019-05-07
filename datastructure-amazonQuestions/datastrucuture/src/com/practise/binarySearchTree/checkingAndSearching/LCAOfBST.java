package com.practise.binarySearchTree.checkingAndSearching;

public class LCAOfBST {
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data =data;
			this.left = this.right =null;
			
		}
	}
	
	public Node findLCA(Node root, int d1,int d2)
	{
		if(root == null)
			return null;
		
		if(root.data<d1 && root.data <d2)
		{
			return findLCA(root.right, d1, d2);
		}
		if(root.data >d1 && root.data>d2)
		{
			return	findLCA(root.left, d1, d2);
		}
		
		return root;
	}
	
	public Node findLCAIterative(Node root, int d1,int d2)
	{
		if(root == null)
			return root;
		
		while(root!=null)
		{
			if(root.data>d1 && root.data>d2)
				root = root.left;
			
			else if(root.data<d1 && root.data <d2)
				root = root.right;
			else
				break;
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.left.left = new Node(1);
		root.left.right = new Node(2);
		
		root.right= new Node(7);
		root.right.left= new Node(6);
		root.right.right= new Node(10);
		root.right.right.right = new Node(15);
		root.right.right.left= new Node(9);
		LCAOfBST obj = new  LCAOfBST();
		System.out.println(obj.findLCA(root, 2, 6).data);
		System.out.println(" iterative soultion "+obj.findLCAIterative(root, 2, 6).data);
		
	}

}
