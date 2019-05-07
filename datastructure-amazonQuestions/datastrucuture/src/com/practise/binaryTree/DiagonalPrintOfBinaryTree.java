package com.practise.binaryTree;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.practise.binaryTree.PreOrderWithoutRecursionAndStack.Node;

public class DiagonalPrintOfBinaryTree {
	
	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node()
		{
			
		}
		
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public void printDiagonalUtil(Node root,int d,HashMap<Integer,Vector<Integer>> diagonalPrint)
	{
		if(root == null)
			return;
		Vector<Integer> k = diagonalPrint.get(d);
		if(k == null)
		{
			k = new Vector<>();
			k.add(root.data);
		}
		else
		{
			k.add(root.data);
		}
		
		diagonalPrint.put(d, k);
		printDiagonalUtil(root.left, d+1, diagonalPrint);
		printDiagonalUtil(root.right, d, diagonalPrint);
	}
	public void printDiagonal(Node root)
	{
		HashMap<Integer,Vector<Integer>> diagonalPrint = new HashMap<>(); 
		printDiagonalUtil(root,0,diagonalPrint);
		
		for(java.util.Map.Entry<Integer, Vector<Integer> > entry:diagonalPrint.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		Node root= new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left= new Node(4);
		root.left.right = new Node(5);
		
		DiagonalPrintOfBinaryTree obj = new DiagonalPrintOfBinaryTree();
		obj.root = root;
		obj.printDiagonal(obj.root);
	}

}
