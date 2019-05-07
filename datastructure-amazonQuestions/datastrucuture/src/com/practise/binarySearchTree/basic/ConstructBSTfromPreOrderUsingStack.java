package com.practise.binarySearchTree.basic;

import java.util.Stack;

public class ConstructBSTfromPreOrderUsingStack {
	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data =data;
			this.left = this.right = null;
		}
	}
	
	public void constructTree(int[] pre,int size)
	{
		Stack<Node> st = new Stack<>();
		 root = new Node(pre[0]);
		st.push(root);
		
		for(int i=1;i<size;i++)
		{
			Node temp = null;
			while(!st.isEmpty() && pre[i]>st.peek().data)
			{
				temp = st.pop();
			}
			
			if(temp!= null)
			{
				temp.right = new Node(pre[i]);
				st.push(temp.right);
			}
			else
			{
				temp = st.peek();
				temp.left = new Node(pre[i]);
				st.push(temp.left);
				
			}
			
			
		}
		
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
		int[] pre = {10,5,4,6,15,14,16};
		int size = pre.length;
		ConstructBSTfromPreOrderUsingStack obj = new ConstructBSTfromPreOrderUsingStack();
		obj.constructTree(pre, size);
		obj.inorder(obj.root);
	}

}























