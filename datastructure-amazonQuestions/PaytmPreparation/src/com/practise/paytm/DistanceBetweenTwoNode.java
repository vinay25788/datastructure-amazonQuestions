package com.practise.paytm;

public class DistanceBetweenTwoNode {
	
	static Node root;
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public static Node findLca(Node root,int n1,int n2)
	{
		if(root == null)
			return null;
		if(root.data == n1 || root.data == n2)
			return root;
		Node leftLCA = findLca(root.left, n1, n2);
		Node rightLCA = findLca(root.right, n1, n2);
		if(leftLCA !=null && rightLCA !=null)
			return root;
		return leftLCA!=null ?leftLCA :rightLCA;
			
		
	}
	public static int findDistancefromLCA(Node root,int d,int level)
	{
		if(root == null)
			return -1;
		if(root.data == d)
			return level;
		 int dis = findDistancefromLCA(root.left, d, level+1);
		 if(dis ==-1)
		return findDistancefromLCA(root.right, d, level+1);
		 return dis;
	}
	public static int distanceBetweenTwoNode(Node n1,Node n2)
	{
		if(n1 ==null || n2==null)
			return -1;
		Node lca = findLca(root,n1.data,n2.data);
		int d1 = findDistancefromLCA(lca,n1.data,0);
		int d2 = findDistancefromLCA(lca,n2.data,0);
	   return d1+d2;
	   
	}
	
	public static void main(String[] args) {
		DistanceBetweenTwoNode obj = new DistanceBetweenTwoNode();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		
		obj.root.left.left.left = new Node(8);
		obj.root.right.left = new Node(6);
		obj.root.right.right = new Node(7);
		Node n1 = obj.root.left.left;
		Node n2 = obj.root.right.right;
		System.out.println(distanceBetweenTwoNode(n1, n2));
	}

}
