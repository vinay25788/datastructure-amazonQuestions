package com.practise.binaryTree.misc;


class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right =null;
	}
}
public class SizeOfBinaryTree {

	public int findSize(Node root)
	{
		if(root == null)
			return 0;
		return findSize(root.left)+1+findSize(root.right);
	}
	
	public Node deleteLeafNodeWithValueX(Node root,int x)
	{
		if(root ==null)
			return null;
		Node n1 = null;
		Node n2 = null;
		if(root!=null)
		n1=deleteLeafNodeWithValueX(root.left,x);
		
		if(root !=null)
		 n2 = deleteLeafNodeWithValueX(root.right,x);
		
		if(n1!=null && n1.left !=null && n1.left.data==x)
			n1.left=null;
		if(n2!=null && n2.right!=null &&  n2.right.data==x)
			n2.right=null;
		
		return root;
	}
	
	public void inorder(Node root)
	{
		if(root !=null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        SizeOfBinaryTree obj = new SizeOfBinaryTree();
       // System.out.println(obj.findSize(root));
        obj.deleteLeafNodeWithValueX(root, 7);
        obj.inorder(root);
	}
}
