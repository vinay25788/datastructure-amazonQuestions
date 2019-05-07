package com.practise.binaryTree;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateValueInTree {
	public static void main(String[] args) {
		Node root = new Node(10); 
        root.left = new Node(8); 
      root.right = new Node(2); 
       root.left.left = new Node(3); 
        root.left.right = new Node(5); 
        root.right.right = new Node(2); 
        checkDuplicate(root);
	}

	public static void checkDuplicate(Node root)
	{
		Set<Integer> set = new HashSet<>();
		
	   checkDuplicateUtil(root,set);
	}
	
	public static void checkDuplicateUtil(Node root,Set<Integer> set)
	{
		if(root != null)
		{
			if(set.contains(root.data))
			{
				System.out.println(" duplicate contains ");
				return;
			}
			set.add(root.data);
			checkDuplicateUtil(root.left ,set);
			checkDuplicateUtil(root.right,set);
		}
		
	}
}
