package com.practise.binaryTree;

import java.util.Stack;

public class ContructBSTFromPreOrder {

	public static void main(String[] args) {
		int pre[] = new int[]{10, 5, 1, 7, 40, 50}; 
        int size = pre.length; 
        Node root = construct(pre, size); 
        inorder(root);
	}
	
	public static void inorder(Node root)
	{
		if(root !=null)
		{
			inorder(root.left);
			System.out.print(" "+root.data);
			inorder(root.right);
		}
	}
	public static  Node construct(int[] pre,int size)
	{
		Node root = new Node(pre[0]);
		Stack<Node> s= new Stack<>();
		s.push(root);
		
		for(int i=1;i<size;++i)
		{
			Node temp = null;
			while(s.isEmpty() == false && pre[i] >s.peek().data	)
			{
				temp = s.pop();
			}
			if(temp !=null)
			{
				temp.right = new Node(pre[i]);
				s.push(temp.right);
			}
			else
			{
				temp = s.peek();
				temp.left = new Node(pre[i]);
				s.push(temp.left);
			}
		}
		
		return root;
	}
	
}

