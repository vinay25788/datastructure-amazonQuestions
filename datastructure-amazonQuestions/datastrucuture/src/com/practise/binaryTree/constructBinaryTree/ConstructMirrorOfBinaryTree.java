package com.practise.binaryTree.constructBinaryTree;

public class ConstructMirrorOfBinaryTree {

	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	
	public Node mirror(Node root)
	{
		if(root == null)
			return null;
		
		Node left = mirror(root.left);
		Node right = mirror(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
		
	}
	
	public void inorder(Node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(root.data+ " ");
			inorder(root.right);
			
		}
	}
	
	public static void main(String[] args) {
		 ConstructMirrorOfBinaryTree obj = new ConstructMirrorOfBinaryTree();
		 Node root = new Node(1);
		 root.left = new Node(2);
		 root.right = new Node(3);
		 root.left.left = new Node(4);
		 root.left.right = new Node(5);
		 obj.root = root;
		  root= obj.mirror(obj.root);
		  obj.inorder(root);
	}
}




























