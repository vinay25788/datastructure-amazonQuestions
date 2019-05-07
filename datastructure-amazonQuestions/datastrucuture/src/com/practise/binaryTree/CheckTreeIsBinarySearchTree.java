package com.practise.binaryTree;

public class CheckTreeIsBinarySearchTree {
	
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public boolean isBst(Node root)
	{
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
	//	return isBstUtil(root,min,max);
	return	isBstUtil(root, null, null);
				
	}
	
	public boolean isBstUtil(Node root,int min,int max)
	{
		if(root == null)
			return true;
		if(root.data<min || root.data>max)
			return false;
		return	 isBstUtil(root.left, min, root.data)&&
		   	isBstUtil(root.right, root.data, min);
	}
	public boolean isBstUtil(Node root,Node left,Node right)
	{
		if(root == null)
			return true;
		if(left!=null && root.data<left.data)
			return false;
		if(right!=null && root.data>right.data)
			return false;
		return	 isBstUtil(root.left, left, root)&&
		   	isBstUtil(root.right, root, right);
	}
	public static void main(String[] args) {
		Node root  = new Node(9);
		root.left = new Node(7);
		root.left.left = new Node(6);
		root.left.right = new Node(12);
		root.right= new Node(15);
		root.right.left = new Node(14);
		root.right.right = new Node(20);
	
		CheckTreeIsBinarySearchTree obj = new CheckTreeIsBinarySearchTree();
		System.out.println(obj.isBst(root));
	}
	

}
