package com.practise.binaryTree;

import java.util.ArrayList;

public class FindPathInNAryTree {
	
	static Node root;
	static int count;
	static class Node
	{
		int data;
		ArrayList<Node> list;
		Node parent;
		Node(int data)
		{
			this.data = data;
			list = new ArrayList<>();
		}
	}
	
	public void add(Node root,Node data)
	{
		ArrayList<Node> list = root.list;
		if(list ==null)
			list = new ArrayList<>();
		list.add(data);
		data.parent = root;
	}
	
	public void printParent(Node root)
	{
		if(root == null)
			return;
		printParent(root.parent);
		System.out.print(root.data+" ");
	}
	public void print(Node root)
	{
		if(root == null)
			return;
		ArrayList<Node> list = root.list;
		for(Node node:list)
		{
			ArrayList<Node> arList;
			if(node !=null)
			{
				count++;
				arList = node.list;
				if(arList.size() == 0)
					 {
					printParent(node);
					System.out.println();
					 }
				else
				 print(node);
			}
		}
	}
	
	public static void main(String[] args) {
		FindPathInNAryTree obj = new FindPathInNAryTree();
		obj.root = new Node(1);
		Node root = obj.root;
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		Node n6 = new Node(7);
		Node n8 = new Node(8);	
		obj.add(root, n1);
		obj.add(root, n2);
		obj.add(root, n3);
		obj.add(root, n4);
		obj.add(root, n5);
		obj.add(n1, n6);
		obj.add(n6, n8);
		obj.print(root);
		System.out.println("count the number of node in NArryTree "+count);
	}

}
