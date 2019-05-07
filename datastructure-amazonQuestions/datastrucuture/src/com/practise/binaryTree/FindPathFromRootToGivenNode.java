package com.practise.binaryTree;

import com.practise.binaryTree.CheckTreeIsBinarySearchTree.Node;

public class FindPathFromRootToGivenNode {

	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public void findPath(Node root,Node n2)
	{
		int[] ch = new int[100];
		findPathUtil(root,n2,ch,0);
	}
	
	public void findPathUtil(Node root,Node n2,int[] ch,int k)
	{
		if(root == null)
			return;
		if(root == n2)
		{
			for(int i=0;i<k;i++)
			{
				System.out.print(ch[i]+" ");
				
				
			}
			System.out.print(root.data);
			ch=null;
			k=0;
			return;
		}
		ch[k] = root.data;
		findPathUtil(root.left, n2, ch, k+1);
		findPathUtil(root.right, n2, ch, k+1);
	}
	
	public static void main(String[] args) {
		Node root  = new Node(9);
		root.left = new Node(7);
		root.left.left = new Node(6);
		root.left.right = new Node(12);
		root.right= new Node(15);
		root.right.left = new Node(14);
		root.right.right = new Node(20);
		root.right.right.right = new Node(26);
		root.right.right.right.right = new Node(29);
		FindPathFromRootToGivenNode obj = new FindPathFromRootToGivenNode();
		obj.findPath(root,root.right.right.right.right);
	}
}
