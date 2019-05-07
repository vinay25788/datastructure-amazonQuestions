package com.practise.binaryTree.summation;

public class SumDifferenceBetweenOddAndEvenLevel {
	
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

	public int getDifference(Node root)
	{
		if(root == null)
			return 0;
		
		return root.data - getDifference(root.left)-getDifference(root.right);
	}
	
	public static void main(String[] args) {
		Node root = new Node(5); 
       root.left = new Node(2); 
       root.right = new Node(6); 
      root.left.left = new Node(1); 
        root.left.right = new Node(4); 
        root.left.right.left = new Node(3); 
        root.right.right = new Node(8); 
        root.right.right.right = new Node(9); 
       root.right.right.left = new Node(7); 
       SumDifferenceBetweenOddAndEvenLevel obj = new SumDifferenceBetweenOddAndEvenLevel();
        System.out.println(obj.getDifference(root) +   
                                             " is the required difference"); 
   

	}
}
