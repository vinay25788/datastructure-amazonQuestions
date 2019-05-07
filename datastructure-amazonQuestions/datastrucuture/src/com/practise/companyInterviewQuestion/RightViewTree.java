package com.practise.companyInterviewQuestion;

import com.practise.companyInterviewQuestion.RightViewTree.Node;

public class RightViewTree {

	
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
	public static void rightView(Node root)
	{
		rigthViewUtil(root,1);
	}
	
	public static void rigthViewUtil(Node root,int level)
	{
		if(root == null)
			return;
		if(maxLevel<level)
		{
			System.out.println(root.data);
			maxLevel = level;
		}
		rigthViewUtil(root.right, level+1);
		rigthViewUtil(root.left, level+1);
			
	}
	public static void main(String[] args) {
		
		 Node root = new Node(1); 
	  root.left = new Node(2); 
	    root.right = new Node(3); 
	       root.left.left = new Node(4); 
	        root.left.right = new Node(5); 
	    root.right.left = new Node(6); 
	      root.right.right = new Node(7); 
	        root.right.left.right = new Node(8); 
	       rightView(root);
	}
}

