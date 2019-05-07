package src.stringquestion.copystring.customTreadpool;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

public class TopViw {

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
	static class Pair
	{
		Node node;
		int dist;
		Pair(Node node,int data)
		{
			this.node = node;
			this.dist = data;
		}
	}
	public static void printTop(Node root)
	{
		Map<Integer,Integer> map = new HashMap<>();
		Queue<Pair> que= new LinkedList<>();
		Pair p1 = new Pair(root, 0);
		que.add(p1);
		while(!que.isEmpty())
		{
			Pair temp = que.poll();
			Node nd = temp.node;
			int dist = temp.dist;
			if(map.get(dist) == null)
			{
				//System.out.println(root.data);
				map.put(temp.dist, nd.data);
			}
			if(nd.left != null)
			{
				que.add(new Pair(nd.left,dist-1));
			}
			
			if(nd.right !=null)
			{
				que.add(new Pair(nd.right ,dist+1));
			}
		
		}
		
		for(java.util.Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}
	public static void main(String[] args) {
		Node root = new Node(1); 
	    root.left = new Node(2); 
	    root.right = new Node(3); 
	    root.left.right = new Node(4); 
	    root.left.right.right = new Node(5); 
	    root.left.right.right.right = new Node(6); 
		printTop(root);
	}
}
