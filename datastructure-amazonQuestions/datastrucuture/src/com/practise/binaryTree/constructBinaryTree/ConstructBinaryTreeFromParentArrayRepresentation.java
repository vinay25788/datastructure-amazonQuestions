package com.practise.binaryTree.constructBinaryTree;

public class ConstructBinaryTreeFromParentArrayRepresentation {
	
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

	
	public static void main(String[] args) {
		int parent[] = new int[]{-1, 0, 0, 1, 1, 3, 5}; 
        int n = parent.length; 
        ConstructBinaryTreeFromParentArrayRepresentation obj = new ConstructBinaryTreeFromParentArrayRepresentation();
        Node root = obj.createBinaryTree(parent,parent.length);
        obj.inOrder(root);
	}

	private Node createBinaryTree(int[] parent, int n) {

		Node created[] = new Node[n	];
		for(int i=0;i<created.length;i++)
		{
			created[i] = null;
		}
		for(int i=0;i<created.length;i++)
		{
			createNode(parent,i,created);
		}
		
		return root;
	}

	private void createNode(int[] parent, int i, Node[] created) {

		if(created[i] !=null)
			return;
		
		created[i] = new Node(i);
		
		if(parent[i] == -1)
			{
			root = created[i];
			return;
			}
		
		if(created[parent[i]] == null)
			createNode(parent,parent[i],created);
		
		
		Node p = created[parent[i]];
		
		if(p.left == null)
			p.left = created[i];
		else
			p.right = created[i];
		
	}
	
	public void inOrder(Node root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
}










