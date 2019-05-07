package main.java.ecs.impl;

class Max
{
	int max;
}

public class GreaterNumber {
	

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
	static int max;
	public static void findMax(Node root)
	{
		StringBuffer sb = new StringBuffer();
		Max max = new Max();
		findMaxUtil(root,sb,max);
		System.out.println(max.max);
	}
	
	public static void findMaxi(Node root)
	{
		
		System.out.println(findMaximum(root,0));
	}
	
	
	
	public static int findMaximum(Node root,int val)
	{
		if(root == null)
		{
			return 0;
		}
		val = (val*10)+root.data;
		if(root.left == null && root.right == null)
		{
			return val;
		}
		
		return Math.max(findMaximum(root.left, val), findMaximum(root.right, val));
	}
	public static void findMaxUtil(Node root,StringBuffer sb,Max max)
	{
		if(root == null)
		{
			return;
		}
		if(root.left == null && root.right == null)
		{
			sb.append(root.data);
			
			int num = Integer.parseInt(sb.toString());
			if(max.max < num)
				max.max = num;
			
			sb= new StringBuffer();
		}
		sb.append(root.data);
		findMaxUtil(root.left, sb, max);
		findMaxUtil(root.right, sb, max);
	}
	public static void main(String[] args) {
	
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(6);
		root.left.left = new Node(7);
		root.left.right = new Node(8);
		root.left.right.left = new Node(7);
//		/findMax(root);
		findMaxi(root);
//		/System.out.println(max);
	}
}
