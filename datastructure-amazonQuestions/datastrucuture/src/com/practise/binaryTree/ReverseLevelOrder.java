package com.practise.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

	Node root;
	public void reverseLevel(Node root	)
	{
		Stack<Node> st = new Stack<>();
		Queue<Node> q = new LinkedList<>();
		if(root != null)
			{
			q.add(root);
			}
		
		while(q.isEmpty() == false)
		{
			Node p = q.peek();
			q.remove();
			
			st.push(p);
			if(p.right != null)
				q.add(p.right);
			if(p.left != null)
				q.add(p.left);
			
		}
		
		while(st.isEmpty() == false)
		{
			System.out.print( " "+st.peek().data);
			st.pop();
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		ReverseLevelOrder obj = new ReverseLevelOrder();
		obj.reverseLevel(root);
				
	}
}
