package com.practise.binaryTree;


public class PrintBoundaryOfBinaryTree {
	
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
			this.right = null;
		}
	}
	
	public void printBoundary(Node root)
	{
		if(root !=null)
		{
			System.out.println(root.data+" ");
			printBoundaryLeft(root.left);
			printLeaves(root.left);
			printLeaves(root.right);
			printBoundaryRight(root.right);
		}
	}

	private void printBoundaryRight(Node root) {
		
		if(root !=null)
		{
			if(root.right != null)
			{
				printBoundaryRight(root.right);
				System.out.println(root.data+" ");
			}
			else if(root.left!=null)
				{
				printBoundaryRight(root.left);
				System.out.println(root.data +" ");
				}
		}
	}

	private void printLeaves(Node root) {

		if(root !=null)
		{
			printLeaves(root.left);
			if(root.left ==null && root.right == null)
			{
				System.out.println(root.data +" ");
			}
			printLeaves(root.right);
			
		}
	}

	private void printBoundaryLeft(Node root) {

		if(root != null)
		{
			
			if(root.left != null)
			{
				System.out.println(root.data +" ");
				printBoundaryLeft(root.left);
			}
			else if(root.right !=null)
			{
				System.out.println(root.data +" ");
				printBoundaryLeft(root.right);
			}
				
		}
	}
	
	public static void main(String[] args) {
		Node root= new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left= new Node(4);
		root.left.right = new Node(5);
		
		PrintBoundaryOfBinaryTree obj = new PrintBoundaryOfBinaryTree();
		obj.root = root;
		obj.printBoundary(obj.root);
	}

}
