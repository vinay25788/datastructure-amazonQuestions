package com.practise.binaryTree.misc;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOrMaxDepth {
	Node root;
	
	public int findHeight(Node root)
	{
		if(root == null)
			return 0;
		
		int l = findHeight(root.left);
		int r = findHeight(root.right);
		if(l>r)
			return l+1;
		else
			return r+1;
	}
	
	public int findHeightIterative(Node root)
	{
		if(root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		int count=0;
		int height=0;
		while(true)
		{
			count = q.size();
			if(count == 0)
				return height;
			height++;
			
			while(count>0)
			{
				Node temp = q.peek();
				q.poll();
				if(temp != null && temp.left !=null)
					q.add(temp.left);
				if(temp !=null && temp.right !=null)
					q.add(temp.right);
				
			}
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
        
        HeightOrMaxDepth obj = new HeightOrMaxDepth();
        System.out.println(obj.findHeight(root));
        System.out.println(" height--> "+obj.findHeightIterative(root));
	}

}
