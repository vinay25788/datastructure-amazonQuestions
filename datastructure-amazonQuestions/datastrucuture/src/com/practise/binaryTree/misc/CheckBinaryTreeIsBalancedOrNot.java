package com.practise.binaryTree.misc;

public class CheckBinaryTreeIsBalancedOrNot {
	
	Node root;
	
	public boolean balancedOrNot(Node root)
	{
		if(root == null)
			return true;
		
		int l = height(root.left);
		int r = height(root.right);
		
		if(Math.abs(l-r)>1)
			return false;
		else
			return true;
	}

	
	public int height(Node root)
	{
		if(root == null)
			return 0;
		int l = height(root.left);
		int r = height(root.right);
		
		return (l>r ? l:r)+1;
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
       /* root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(7); */
        CheckBinaryTreeIsBalancedOrNot obj = new CheckBinaryTreeIsBalancedOrNot();
        System.out.println(" balance or not--> "+obj.balancedOrNot(root));
	}
	
}
