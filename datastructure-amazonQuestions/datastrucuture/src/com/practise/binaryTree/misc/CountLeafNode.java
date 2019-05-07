package com.practise.binaryTree.misc;

import java.util.LinkedList;
import java.util.Queue;

import com.practise.binaryTree.misc.BottomViewOfBinaryTree.Node;

public class CountLeafNode {
	
	int count;
	public void countLeafNode(Node root)
	{
		if(root !=null)
		{
			if(root.left == null && root.right == null)
			{
				count++;
			}
		}
		if(root.left !=null)
		countLeafNode(root.left);
		if(root.right !=null)
		countLeafNode(root.right);
		
	}
	
	
	public int countLeaf(Node root)
	{
		if(root == null)
			return 0;
		if(root.left ==null && root.right == null)
			return 1;
		return countLeaf(root.left)+countLeaf(root.right);
		
	}
	
	public int countLeafIterative(Node root)
	{
		if(root == null)
			return 0;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int count=0;
		while(queue.isEmpty() == false)
		{
			Node temp = queue.remove();
			
			if(temp.left !=null)
				queue.add(temp.left);
			if(temp.right !=null)
				queue.add(temp.right);
			if(temp.left == null && temp.right == null)
				count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		Node root = new Node(20); 
        root.left = new Node(8); 
        root.right = new Node(22); 
        root.left.left = new Node(5); 
        root.left.right = new Node(3); 
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.left = new Node(4); 
        root.right.right = new Node(25);
        CountLeafNode obj = new CountLeafNode();
        
        obj.countLeafNode(root);
        System.out.println(obj.count);
        System.out.println(" Leaf node count -->"+obj.countLeaf(root));
        System.out.println(" count by iterative method -->"+obj.countLeafIterative(root));
	}
}
