package com.practise.binaryTree.misc;

class Height
{
	int h;
}
public class DiameterOfBinaryTree {
	
	Node root;
	
	public int findDiameter(Node root,Height hie)
	{
		Height lh = new Height();
		Height rh = new Height();
		
		if(root == null)
		{
			 hie.h = 0;
			return  0;
			
		}
		
		int ldia = findDiameter(root.left, lh);
		int rdia = findDiameter(root.right, rh);
		
		hie.h = Math.max(lh.h, rh.h)+1;
		
		return Math.max(lh.h+rh.h+1,Math.max(ldia, rdia));
	}
	
	public int diameter(Node root)
	{
		Height h = new Height();
		return findDiameter(root, h);
		 //return h.h;
	}
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
      /*  root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(7); */
        DiameterOfBinaryTree obj = new DiameterOfBinaryTree();
        System.out.println(" diameter -->"+obj.diameter(root));
	}

}
