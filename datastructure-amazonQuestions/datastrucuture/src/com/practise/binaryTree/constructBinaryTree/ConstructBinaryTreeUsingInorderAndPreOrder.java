package com.practise.binaryTree.constructBinaryTree;

public class ConstructBinaryTreeUsingInorderAndPreOrder {
	
	Node root;
	int preIndex;
	
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
	
	public Node buildTree(int[] in,int[] pre,int start,int end)
	{
		if(start>end)
		{
			return null;
		}
		Node tnode = new Node(pre[preIndex++]);
		int inIndex = search(in,start,end,tnode.data);
		if(start == end)
			return tnode;
		
			tnode.left = buildTree(in,pre,start,inIndex-1);
			tnode.right = buildTree(in,pre,inIndex+1,end);
		
		
		return tnode;
	}
	
	public int search(int[] in,int start,int end,int data)
	{
		int i=0;
		for( i=start;i<end;i++)
		{
			if(in[start] == data)
				return start;
			start++;
		}
		
		return i;
			
	}
	
	public void inorder(Node root)
	{
		if(root !=null )
		{
			inorder(root.left);
			System.out.print(" "+root.data);
			inorder(root.right);
			
		}
	}
	

	public static void main(String[] args) {
		int [] in = {4,2,5,1,3};
		int[] pre = {1,2,4,5,3};
		ConstructBinaryTreeUsingInorderAndPreOrder obj = new ConstructBinaryTreeUsingInorderAndPreOrder();
		obj.root = obj.buildTree(in, pre, 0, in.length-1);
		obj.inorder(obj.root);
	}
}
