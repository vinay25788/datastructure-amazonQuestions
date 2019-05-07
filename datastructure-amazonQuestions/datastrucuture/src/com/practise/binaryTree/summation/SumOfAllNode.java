package com.practise.binaryTree.summation;

class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data = data;
		this.left  = null;
	}
}
public class SumOfAllNode {

	Node root;
	int sum=0;
	
	public int sumOfAllNode(Node root)
	{
		
		if(root == null)
			return 0;
		if(root.left ==null && root.right ==null)
			sum+=root.data;
		  sumOfAllNode(root.left);
		  sumOfAllNode(root.right);
		return sum;
		
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		SumOfAllNode obj = new SumOfAllNode();
		System.out.println("sum of all nodes -->"+obj.sumOfAllNode(root));
	}
}
