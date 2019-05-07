package com.practise.binaryTree;

import java.util.Stack;

public class SpiralTraversal {
	
	static class Node
	{
		char data;
		Node left,right;
		Node(char data)
		{
			this.data =data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void spiral(Node root)
	{
		Stack<Node> st1 = new Stack<>();
		Stack<Node> st2 = new Stack<>();
		st1.push(root);
		while(st1.isEmpty() ==false ||st2.isEmpty() ==false)
		{
			while(st1.isEmpty()==false)
			{
				Node temp = st1.pop();
				System.out.print(temp.data+" ");
				if(temp.right !=null)
					st2.push(temp.right);
				if(temp.left !=null)
					st2.push(temp.left);
			}
			
			System.out.println();
			while(st2.isEmpty() == false)
			{
				Node temp = st2.pop();
				System.out.print(temp.data+" ");
				if(temp.left !=null)
					st1.push(temp.left);
				if(temp.right !=null)
					st1.push(temp.right);
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Node root = new Node('a');
		root.left = new Node('b');
		root.right = new Node('c');
		root.left.left = new Node('d');
		root.left.right = new Node('e');
		root.right.left = new Node('g');
		root.right.right = new Node('h');
		spiral(root);
				
	}

}
