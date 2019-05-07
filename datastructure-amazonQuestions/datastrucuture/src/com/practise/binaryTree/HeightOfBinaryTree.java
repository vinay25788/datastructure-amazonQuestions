package com.practise.binaryTree;

import com.practise.binaryTree.InorderWithoutRecursionAndStack.Node;

public class HeightOfBinaryTree {
	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public int heightOfBinaryTree(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int lheight = heightOfBinaryTree(root.left);
		int rheight = heightOfBinaryTree(root.right);
		
		if(lheight>rheight)
		{
			System.out.println(" lheight "+lheight);
			return lheight+1;
		}
		else
			{
			System.out.println(" rheight "+rheight);
			return rheight+1;
			}
	}
	
	public static void main(String[] args) {
		Node root= new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left= new Node(4);
		root.left.right = new Node(5);
		
		HeightOfBinaryTree obj = new HeightOfBinaryTree();
		obj.root = root;
		System.out.println(" height of binary Tree "+obj.heightOfBinaryTree(obj.root ));
	}

}
