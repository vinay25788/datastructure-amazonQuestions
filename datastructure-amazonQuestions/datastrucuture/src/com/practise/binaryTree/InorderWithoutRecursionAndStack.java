package com.practise.binaryTree;

public class InorderWithoutRecursionAndStack {
	
	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node()
		{
			
		}
		
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public void morrisInorder(Node root)
	{
		if(root == null)
			return;
		Node current  = root;
		while(current!=null)
		{
			if(current.left == null)
			{
				System.out.println(" "+current.data);
				current = current.right;
			}
			else
			{
				Node pre = current.left;
				while(pre.right != null && pre.right != current)
				{
					pre = pre.right;
				}
				if(pre.right == null)
				{
					pre.right = current;
					current = current.left;
				}
				else
				{
					pre.right = null;
					System.out.println(" "+current.data);
					current = current.right;
				}
			}
		}
	}
	
	public static void main(String...args)
	{
		Node root= new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left= new Node(4);
		root.left.right = new Node(5);
		InorderWithoutRecursionAndStack obj = new InorderWithoutRecursionAndStack();
		obj.root = root;
		obj.morrisInorder(obj.root);
	}

}
