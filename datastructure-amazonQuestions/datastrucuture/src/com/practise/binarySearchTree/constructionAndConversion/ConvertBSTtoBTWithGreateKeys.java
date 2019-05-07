package com.practise.binarySearchTree.constructionAndConversion;


class Sum
{
	int sum;
}

public class ConvertBSTtoBTWithGreateKeys {
	
	Node root;
	
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data = data;
			this.left = this.right = null;
		}
		
	}

	public Node addGreate(Node root)
	{
	
		Sum sum = new Sum();
		
		//int sum = 0;
	return	addGreateUtil(root,sum);
	}
	
	
	
	public Node addGreateUtil(Node root,Sum sum)
	{
		if(root == null)
			return null;
		
		addGreateUtil(root.right, sum);
		sum.sum = sum.sum+root.data;
		root.data = sum.sum;
		addGreateUtil(root.left, sum);
		
		return root;
		
	}
	
	public void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(" "+root.data);
			inOrder(root.right);
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left= new Node(2);
		root.right = new Node(13);
		ConvertBSTtoBTWithGreateKeys obj = new ConvertBSTtoBTWithGreateKeys();
		obj.addGreate(root);
		obj.inOrder(root);
	}
}
