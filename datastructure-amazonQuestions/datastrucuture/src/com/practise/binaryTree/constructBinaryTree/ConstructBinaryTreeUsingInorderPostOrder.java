package com.practise.binaryTree.constructBinaryTree;

public class ConstructBinaryTreeUsingInorderPostOrder {
	
	Node root;
	
	class Index
	{
		int index;
	}
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
	
	public Node construtBinaryTree(int[] in,int[] po,int n)
	{
	   Index ins = new Index();
	   ins.index = n-1;
	   return constructBinaryTreeUtil(in,po,0,n-1,ins);
	}
	
	public Node constructBinaryTreeUtil(int[] in,int[] po,int start,int end,Index index)
	{
		if(start>end)
			return null;
		
		int poIndex = index.index;
		Node node = new Node(po[poIndex]);
		index.index--;
		
		if(start == end)
			return node;
		
		int inIndex = search(in,start,end,node.data);
		node.left = constructBinaryTreeUtil(in, po, start, inIndex-1, index);
		node.right = constructBinaryTreeUtil(in, po, inIndex+1, end, index);
		
		return node;
		
	}
	
	public void inorder(Node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(root.data +" ");
			inorder(root.right);
		}
	}
	public int search(int[] in,int start,int end,int data)
	{
		int i;
		for(i=start;i<end;i++)
		{
			if(in[i] == data)
				return i;
		}
		return i;
	}
	
	public static void main(String[] args) {
		 ConstructBinaryTreeUsingInorderPostOrder tree = new ConstructBinaryTreeUsingInorderPostOrder(); 
	        int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 }; 
	        int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 }; 
	        int n = in.length; 
	        Node root = tree.construtBinaryTree(in, post, n); 
	        System.out.println("Preorder of the constructed tree : "); 
	        tree.inorder(root); 
	}

}
