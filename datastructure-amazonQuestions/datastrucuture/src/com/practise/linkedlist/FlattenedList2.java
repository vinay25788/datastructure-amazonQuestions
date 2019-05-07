package com.practise.linkedlist;

public class FlattenedList2 {

	Node head;
	
	static class Node
	{
		int data;
		Node right,down;
		
		Node(int data)
		{
			this.data = data;
			this.right = null;
			this.down = null;
		}
	}
	
	public Node push(Node head,int data)
	{
		Node newNode = new Node(data);
		newNode.down= head;
		head = newNode;
		return head;
	}
	
	public Node flatten(Node node)
	{
		if(node == null || node.right == null	)
			return node;
		
		node.right = flatten(node.right);
		
		node = merge(node,node.right);
		return node;
	}
	
	public Node merge(Node a,Node b)
	{
		
		if(a == null)
			return b;
		if(b == null)
			return a;
		
		Node result =null;
		
		if(a.data<b.data)
		{
			result =a;
			result.down = merge(a.down,b);
			
		}
		else
		{
			result = b;
			result.down = merge(a,b.down);
		}
		
		return result;
	}
	
	
	public void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print( " "+temp.data);
			temp = temp.down;
					
		}
	}
	public static void main(String[] args) {
		FlattenedList2 L = new FlattenedList2();
		L.head = L.push(L.head, 30); 
		L.head = L.push(L.head, 8); 
		L.head = L.push(L.head, 7); 
		L.head = L.push(L.head, 5); 

		L.head.right = L.push(L.head.right, 20); 
		L.head.right = L.push(L.head.right, 10); 

		L.head.right.right = L.push(L.head.right.right, 50); 
		L.head.right.right = L.push(L.head.right.right, 22); 
		L.head.right.right = L.push(L.head.right.right, 19); 

		L.head.right.right.right = L.push(L.head.right.right.right, 45); 
		L.head.right.right.right = L.push(L.head.right.right.right, 40); 
		L.head.right.right.right = L.push(L.head.right.right.right, 35); 
		L.head.right.right.right = L.push(L.head.right.right.right, 20); 

		L.head = L.flatten(L.head);
		L.print();
	}
}























