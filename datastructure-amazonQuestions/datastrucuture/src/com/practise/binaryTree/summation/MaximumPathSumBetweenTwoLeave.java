package com.practise.binaryTree.summation;

//Java program to find maximum path sum between two leaves 
//of a binary tree 


//An object of Res is passed around so that the 
//same value can be used by multiple recursive calls. 
class Res { 
	int val; 
} 

public class MaximumPathSumBetweenTwoLeave { 

	static Node root; 

	static class Node { 

		int data; 
		Node left, right; 

		Node(int item) { 
			data = item; 
			left = right = null; 
		} 
	} 
	// A utility function to find the maximum sum between any 
	// two leaves.This function calculates two values: 
	// 1) Maximum path sum between two leaves which is stored 
	// in res. 
	// 2) The maximum root to leaf path sum which is returned. 
	// If one side of root is empty, then it returns INT_MIN 
	int maxPathSumUtil(Node node, Res res) { 

		// Base cases 
		if (node == null) 
			return 0; 
		if (node.left == null && node.right == null) 
			return node.data; 

		// Find maximum sum in left and right subtree. Also 
		// find maximum root to leaf sums in left and right 
		// subtrees and store them in ls and rs 
		int ls = maxPathSumUtil(node.left, res); 
		int rs = maxPathSumUtil(node.right, res); 

		// If both left and right children exist 
		if (node.left != null && node.right != null) { 

			// Update result if needed 
			res.val = Math.max(res.val, ls + rs + node.data); 

			// Return maxium possible value for root being 
			// on one side 
			return Math.max(ls, rs) + node.data; 
		} 

		// If any of the two children is empty, return 
		// root sum for root being on one side 
		return (node.left == null) ? rs + node.data 
				: ls + node.data; 
	} 

	// The main function which returns sum of the maximum 
	// sum path between two leaves. This function mainly 
	// uses maxPathSumUtil() 
	int maxPathSum(Node node) 
	{ 
		Res res = new Res(); 
		res.val = Integer.MIN_VALUE; 
		maxPathSumUtil(root, res); 
		return res.val; 
	} 

	//Driver program to test above functions 
	public static void main(String args[]) { 
		MaximumPathSumBetweenTwoLeave tree = new MaximumPathSumBetweenTwoLeave(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.left = new Node(6);
		
		System.out.println("Max pathSum of the given binary tree is "
				+ tree.maxPathSum(tree.root)); 
	} 
} 

//This code is contributed by Mayank Jaiswal 
