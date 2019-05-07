package com.practise.binarySearchTree.constructionAndConversion;

public class ConvertSortedArrayToBST {
	
	Node root;
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data = data;
			this.left = this.right = null;
		}
		
		
	
	}
	
	public void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(" "+root.data);
			inOrder(root.right);
		}
	}
	

	public Node convertArrayToBST(int[] a,int start,int end)
	{
		if(start> end)
			return null;
	
		int mid = (start+end)/2;
		
		Node node = new Node(a[mid]);
		node.left = convertArrayToBST(a, start, mid-1);
		node.right = convertArrayToBST(a, mid+1, end);
		return node;
	}
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		ConvertSortedArrayToBST obj = new ConvertSortedArrayToBST();
		obj.root = obj.convertArrayToBST(a, 0, a.length-1);
		obj.inOrder(obj.root);
	}
}
