package com.practise.companyInterviewQuestion;


public class LeftViewTree {

	
	Node root;
	static int maxLevel=0;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	public static void leftView(Node root)
	{
		leftViewUtil(root,1);
	}
	
	public static void leftViewUtil(Node root,int level)
	{
		if(root == null)
			return;
		if(maxLevel<level)
		{
			System.out.println(root.data);
			maxLevel = level;
		}
		leftViewUtil(root.left, level+1);
		leftViewUtil(root.right, level+1);
			
	}
	public static void main(String[] args) {
		
	       Node root = new Node(12); 
	        root.left = new Node(10); 
	       root.right = new Node(30); 
	     root.right.left = new Node(25); 
	       root.right.right = new Node(40); 
	       leftView(root);
	}
}
