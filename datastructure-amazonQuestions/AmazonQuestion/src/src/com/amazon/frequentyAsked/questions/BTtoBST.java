package src.com.amazon.frequentyAsked.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class BTtoBST {
	
	static int i;
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
	
	public static void inorder(Node root,List<Integer> list)
	{
		if(root!=null)
		{
			inorder(root.left, list);
			list.add(root.data);
			inorder(root.right,list);
		}
	}
	
	public static void BTtoBST(Node node,List<Integer> list)
	{
		if(node == null)
			return ;
		BTtoBST(node.left, list);
		node.data = list.get(i);
		i++;
		BTtoBST(node.right, list);
	}
	
	public static void inorder(Node root)
	{
		if(root !=null)
		{
			inorder(root.left);
			System.out.print(" "+root.data);
			inorder(root.right);
			
		}
	}
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(3);
		root.left.right = new Node(1);
		root.left.left = new Node(2);
		root.right.right = new Node(7);
		root.right.left = new Node(6);
		List<Integer> list = new ArrayList<>();
		inorder(root,list);
		System.out.println(list);
		//Collecti
		java.util.Collections.sort(list);
		System.out.println(list);
		BTtoBST(root, list);
		inorder(root);
		
	}

}
