package com.practise.binarySearchTree.checkingAndSearching;

class Sum
{
	int sum;
}
public class AddAllGreaterValuesInNode {
	
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	
	public void addAllGreater(Node root)
	{
		Sum sum = new Sum();
		 addAllGreaterUtil(root, sum);
	}

	public void addAllGreaterUtil(Node root,Sum sum)
	{
		if(root == null)
		{
			sum.sum =0;
			return;
		}
		
		if(root.right !=null)
		 addAllGreaterUtil(root.right, sum);
		sum.sum = sum.sum +root.data;
		root.data =sum.sum;
		
		if(root.left !=null)
		 addAllGreaterUtil(root.left, sum);
	}
	
	public void inorder(Node root)
	{
		if(root !=null)
		{
			inorder(root.left);
			System.out.print(" "+root.data);
			inorder(root.right);
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(14);
		AddAllGreaterValuesInNode obj = new  AddAllGreaterValuesInNode();
		obj.inorder(root);
		System.out.println(" after function");
		obj.addAllGreater(root);
		obj.inorder(root);
	}
}
