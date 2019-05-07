package main.java.ecs.impl;

class Node
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
public class PrintNodeKdistanceFromRoot {
	
	Node root;
	
	public void printKDistanceNode(Node root,int k)
	{
		if(root == null)
			return;
		if(k == 0)
		{
			System.out.print(" "+root.data);
			k--;
		}
		else
		{
			printKDistanceNode(root.left, k-1);
			printKDistanceNode(root.right, k-1);
		}
	}

		public static void main(String[] args) {
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			root.left.left.left = new Node(6);
			root.left.left.right = new Node(7);
			PrintNodeKdistanceFromRoot obj = new PrintNodeKdistanceFromRoot();
			obj.root = root;
			obj.printKDistanceNode(root, 2);
		}
}
