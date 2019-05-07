package com.practise.binaryTree.summation;

import java.util.LinkedList;
import java.util.Queue;

import com.practise.binaryTree.summation.SumDifferenceBetweenOddAndEvenLevel.Node;

public class MaximumLevelSum {
	
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
	
	int getMaximumLevelSum(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int maximum=Integer.MIN_VALUE,sum=0;
		int count=0;
		while(q.isEmpty() == false)
		{
			
			count = q.size();
			sum=0;
			while(count-- >0)
			{
				Node temp = q.peek();
				q.poll();
				if(temp !=null)
				sum+=temp.data;
				if( temp !=null && temp.left !=null)
					q.add(temp.left);
				if(temp !=null && temp.right !=null)
					q.add(temp.right);
			}
			
			maximum = Math.max(maximum, sum);
			
		}
		
		return maximum;
	}
	 /*   Constructed Binary tree is: 
    1 
  /   \ 
2      3 
/  \      \ 
4    5      8 
       /   \ 
      6     7    */
	public static void main(String[] args) {
	
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(8);
		root.right.right.left = new Node(6);
		root.right.right.right = new Node(7);
		MaximumLevelSum obj = new MaximumLevelSum();
		System.out.println(" maximum Sum "+obj.getMaximumLevelSum(root));
		
	}

}
