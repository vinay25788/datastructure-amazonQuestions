package com.practise.binaryTree.summation;

import com.practise.binaryTree.summation.SumOfAllNodeInBinaryTree.Node;

public class RootToLeafPathSum {

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
	
	Node root;
	
	boolean hasPathSum(Node root,int sum)
	{
		if(root == null)
			return sum==0;
		else
		{
			boolean ans = false;
			int subSum = sum-root.data;
			
			if(subSum ==0 && root.left == null && root.right == null)
				return true;
			if(root.left != null)
				ans = ans || hasPathSum(root.left, subSum);
			if(root.right !=null)
				ans = ans || hasPathSum(root.right, subSum);
			
			return ans;
		}
		
		
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(5);
		RootToLeafPathSum obj = new RootToLeafPathSum();
		System.out.println(" root to path sum -->"+obj.hasPathSum(root, 8));
		
		
	}

}
