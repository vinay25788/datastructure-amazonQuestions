package com.practise.binaryTree.misc;

import com.practise.binaryTree.misc.LongestCommonSequenceInBinaryTree.Node;

class MaxLevel
{
	int level;
}
public class LeftViewOfBinaryTree {
	
	public void leftView(Node root)
	{
		MaxLevel max = new MaxLevel();
		leftViewUtil(root,1,max);
		
	}
	
	public void leftViewUtil(Node root,int level,MaxLevel maxLevel )
	{
	    if(root == null)
	    	return ;
	    if(maxLevel.level <level)
	    {
	    	System.out.print(" "+root.data);
	    	maxLevel.level = level;
	    }
	    
	    leftViewUtil(root.left, level+1, maxLevel);
	    leftViewUtil(root.right, level+1, maxLevel);
	}
	
	public void rightView(Node root)
	{
		MaxLevel max = new MaxLevel();
		rightViewUtil(root,1,max);
		
	}
	
	public void rightViewUtil(Node root,int level,MaxLevel maxLevel )
	{
	    if(root == null)
	    	return ;
	    if(maxLevel.level <level)
	    {
	    	System.out.print(" "+root.data);
	    	maxLevel.level = level;
	    }
	    
	    leftViewUtil(root.right, level+1, maxLevel);
	    leftViewUtil(root.left, level+1, maxLevel);
	}
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.left.right = new Node(5); 
        root.left.left.left = new Node(6);
        root.left.left.left.left = new Node(7); 
        root.right.right = new Node(11); 
        root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(9);
        root.right.right.right.right.right = new Node(10); 
       
        LeftViewOfBinaryTree obj = new LeftViewOfBinaryTree();
        obj.leftView(root);
        System.out.println();
        obj.rightView(root);
	}
}
