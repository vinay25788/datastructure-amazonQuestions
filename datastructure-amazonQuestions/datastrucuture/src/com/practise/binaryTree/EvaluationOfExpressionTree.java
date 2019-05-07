package com.practise.binaryTree;

public class EvaluationOfExpressionTree {
	
	Node root;
	static class Node
	{
		String info;
		Node left;
		Node right;
		
		Node(String info)
		{
			this.info = info;
			this.left = null;
			this.right=null;
			
		}
		
	
	}
	int eval(Node root)
	{
		 	if(root == null)
		 		return 0;
		 	
		 	if(root.left == null && root.right==null)
		 		return Integer.parseInt(root.info);
		 	
		 	int lValue = eval(root.left);
		 	int rValue = eval(root.right);
		 	
		 	if(root.info=="*")
		 		return lValue*rValue;
		 	if(root.info=="+")
		 		return lValue+rValue;
		 	if(root.info=="-")
		 		return lValue-rValue;
		 	
		 	return lValue/rValue;
		 	
	}
	public static void main(String...args)
	{
		Node root = new Node("+");
		root.left = new Node("*");
		root.left.left = new Node("5");
		root.left.right = new Node("4");
		root.right = new Node("-");
		root.right.left= new Node("100");
		root.right.right = new Node("20");
		EvaluationOfExpressionTree obj = new EvaluationOfExpressionTree();
		obj.root = root;
		System.out.println(obj.eval(obj.root));
	}
}
