package com.practise.binaryTree.summation;

public class SumOfAllNodeInBinaryTree {

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
	
	int sum(Node root)
	{
		if(root == null)
			return 0;
		{
			
		int ls=	sum(root.left);
		int rs = sum(root.right);
		return ls+rs+root.data;
			
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(5);
		SumOfAllNodeInBinaryTree obj = new SumOfAllNodeInBinaryTree();
	System.out.println(" sum of all node-->"+obj.sum(root));	
	}
}
