package com.practise.binaryTree;

public class isBalanced {

	static class Height
	{
		int h;
	}
	public static void main(String[] args) {
		  Node root = new Node(1); 
	       root.left = new Node(2); 
	        root.right = new Node(3); 
	       root.left.left = new Node(4); 
	        root.left.right = new Node(5); 
	       root.right.right = new Node(6); 
	        root.left.left.left = new Node(7); 
	        Height h= new Height();
	       System.out.println( isBalance(root, h));
	}
	
	public static boolean isBalance(Node node, Height height)
	{
		if(node == null)
		{
			height.h =0;
			return true;
		}
		Height lh = new Height();
		Height rh = new Height();
		boolean l = isBalance(node.left,lh);
		boolean r = isBalance(node.right, rh);
		int ll=lh.h;
		int rr = rh.h;
		
		height.h = (ll>rr?ll:rr)+1;
		
		if(Math.abs(ll-rr)>=2)
			return false;
		
		return l&&r;
	}
}
