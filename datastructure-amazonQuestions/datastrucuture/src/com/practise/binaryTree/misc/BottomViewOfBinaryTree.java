package com.practise.binaryTree.misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
	
	static class Node
	{
		int data;
		int hd;
		Node left,right;
		
		Node(int data)
		{
			this.data = data;
			this.left=this.right=null;
			this.hd =0;
			
		}
	}
	
	public void bottomView(Node root)
	{
		if(root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		Map<Integer,Integer> map = new TreeMap<>();
		int hd=0;
		root.hd = hd;
		queue.add(root);
		while(queue.isEmpty() == false)
		{
			Node temp = queue.remove();
			 hd = temp.hd;
			map.put(hd, temp.data);
			if(temp.left !=null)
			{
				temp.left.hd = hd-1;
				queue.add(temp.left);
			}
			if(temp.right !=null)
			{
				temp.right.hd = hd+1;
				queue.add(temp.right);
			}
		}
		
		for(Entry<Integer,Integer> entry:map.entrySet())
		{
			System.out.print(" "+entry.getValue());
		}
		
		/*Set<Entry<Integer,Integer>> set = map.entrySet();
		Iterator<Entry<Integer,Integer>>	it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, Integer> entry = it.next();
			System.out.println(entry.getValue());
		}*/
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
        BottomViewOfBinaryTree obj = new BottomViewOfBinaryTree();
        obj.bottomView(root);
	}

}
