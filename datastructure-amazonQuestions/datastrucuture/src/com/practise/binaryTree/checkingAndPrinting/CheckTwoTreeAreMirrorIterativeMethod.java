package com.practise.binaryTree.checkingAndPrinting;

import java.util.Stack;

public class CheckTwoTreeAreMirrorIterativeMethod {

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
	
	public boolean isMirror(Node root1,Node root2)
	{
		Stack<Node> st1 = new Stack<>();
		Stack<Node> st2 = new Stack<>();
		
		while(true)
		{
			while(root1 != null && root2 !=null )
			{
				if(root1.data !=root2.data)
					return false;
				st1.push(root1);
				st2.push(root2);
				root1 = root1.left;
				root2 = root2.right;
			}
			
			 if(!(root1 == null || root2 == null))
			return false;
			
			 if(!st1.isEmpty() && !st2.isEmpty())
			{
				Node node1 = st1.pop();
				root1 = node1.right;
				Node node2 = st2.pop();
				root2 = node2.left;
			}
			else
				break;
		}
		
		return true;
	}
	 public static void main(String[] args) {
		Node root = new Node(1);
		root.left=new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		Node root2 = new Node(1);
		root2.left=new Node(3);
		root2.right = new Node(2);
		root2.right.left = new Node(5);
		root2.right.right = new Node(4);
		//root2.right.right = new Node(7);
		 
		CheckTwoTreeAreMirrorIterativeMethod obj = new CheckTwoTreeAreMirrorIterativeMethod();
		System.out.println(" Given Tree are equals -->"+obj.isMirror(root, root2));
	}
}
