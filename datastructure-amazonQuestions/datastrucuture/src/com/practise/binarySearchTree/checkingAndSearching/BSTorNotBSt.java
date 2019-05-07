package com.practise.binarySearchTree.checkingAndSearching;

//Java implementation to check if given Binary tree 
//is a BST or not 

/* Class containing left and right child of current 
node and key value*/
class Node 
{ 
	int data; 
	Node left, right; 

	public Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

public class BSTorNotBSt 
{ 
	//Root of the Binary Tree 
	Node root; 

	/* can give min and max value according to your code or 
	can write a function to find min and max value of tree. */

	/* returns true if given search tree is binary 
	search tree (efficient version) */
	boolean isBST() { 
		return isBSTUtil(root, Integer.MIN_VALUE, 
							Integer.MAX_VALUE); 
	} 

	/* Returns true if the given tree is a BST and its 
	values are >= min and <= max. */
	boolean isBSTUtil(Node node, int min, int max) 
	{ 
		/* an empty tree is BST */
		if (node == null) 
			return true; 

		/* false if this node violates the min/max constraints */
		if (node.data < min || node.data > max) 
			return false; 

		/* otherwise check the subtrees recursively 
		tightening the min/max constraints */
		// Allow only distinct values 
		return (isBSTUtil(node.left, min, node.data-1) && 
				isBSTUtil(node.right, node.data+1, max)); 
	} 

	boolean isBSTUtilWithLeftAndRight(Node root,Node left,Node right)
	{
		if(root == null)
			return true;
		
		/*if(left == null && right == null)
			return true;*/
		
		if(left!=null && left.data>root.data)
			return false;
		
		if(right != null && right.data<root.data)
			return false;
		
		return isBSTUtilWithLeftAndRight(root.left, left, root) && 
				isBSTUtilWithLeftAndRight(root.right, root, right);
		
	}
	
	/* Driver program to test above functions */
	public static void main(String args[]) 
	{ 
		BSTorNotBSt tree = new BSTorNotBSt(); 
		tree.root = new Node(4); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(10); 
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(15); 
		tree.root.left.left = new Node(10); 
		tree.root.left.right = new Node(3); 

		if (tree.isBST()) 
			System.out.println("IS BST"); 
		else
			System.out.println("Not a BST"); 
		
		System.out.println(" is BST  using left "+tree.isBSTUtilWithLeftAndRight(tree.root, null, null));
	} 
} 
