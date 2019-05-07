package com.practise.binaryTree.checkingAndPrinting;

public class CountNode {
	Node root;
	
	public int count(Node root)
	{
		if(root == null )
			return 0;
		return count(root.left)+count(root.right)+1;
	}
	
	public static void main(String[] args) {
		CountNode tree = new CountNode();
		tree.root = new Node(26); 
		tree.root.left = new Node(10); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(6); 
		tree.root.right.right = new Node(3); 
		System.out.println("number of nodes-->+"+tree.count(tree.root));
		
	}

}
