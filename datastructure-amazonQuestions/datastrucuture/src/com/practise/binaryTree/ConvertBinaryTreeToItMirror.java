package com.practise.binaryTree;

public class ConvertBinaryTreeToItMirror {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		
		root.left = new Node(3);
		root.right = new Node(2);
		root.right.left = new Node(5);
		root.right.right = new Node(4);
		inorder(root);
		System.out.println();
		Node temp =convertMirror(root);
		inorder(temp);
		root = new Node(10); 
        root.left = new Node(8); 
      root.right = new Node(2); 
       root.left.left = new Node(3); 
        root.left.right = new Node(5); 
        root.right.right = new Node(2); 
        System.out.println(checkSum(root));
	}
	
	
	public static boolean checkSum(Node root)
	{
		int ldata=0,rdata=0;
		if(root == null)
			return true;
		if(root.left == null && root.right == null)
			return true;
		else {
			if(root.left !=null)
				ldata = root.left.data;
			if(root.right !=null)
				rdata = root.right.data	;
			if((root.data == ldata+rdata)&& checkSum(root.left ) && checkSum(root.right))
			return   true;
		return false;
		}
			
	}
	public static Node convertMirror(Node root)
	{
		if(root == null)
			return null;
		Node left = convertMirror(root.left);
		Node right = convertMirror(root.right);
		root.left = right;
		root.right = left;
		return root;
	}
	
	public static void inorder(Node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(" "+root.data	);
			inorder(root.right);
		}
	}

}
