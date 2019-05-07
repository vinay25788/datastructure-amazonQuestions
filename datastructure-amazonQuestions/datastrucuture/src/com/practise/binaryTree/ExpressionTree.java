package com.practise.binaryTree;

public class ExpressionTree {

	static class Node
	{
		String data;
		Node left,right;
		
		Node(String data)
		{
			this.data = data;
			this.left = this.right = null;
		}
	}
	
	Node root;
	
	public static int eval(Node root)
	{
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
		{
			return Integer.parseInt(root.data);
		}
		
		int l = eval(root.left);
		int r = eval(root.right);
		
		if(root.data == "+")
			return l+r;
		if(root.data =="*")
			return l*r;
		if(root.data =="-")
			return l-r;
		

		return l/r;
	}
	
	public static void main(String[] args) {
		Node root = new Node("+");
		root.left= new Node("*");
		root.left.left = new Node("5");
		root.left.right = new Node("4");
		
		root.right = new Node("-");
		root.right.left= new Node("100");
		root.right.right = new Node("/");
		root.right.right.right = new Node("2");
		root.right.right.left = new Node("20");
		System.out.println(eval(root));
		
	}
}
