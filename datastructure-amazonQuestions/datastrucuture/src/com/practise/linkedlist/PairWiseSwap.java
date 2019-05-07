package com.practise.linkedlist;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class PairWiseSwap {
	
	Node head;
	
	public void add(int data)
	{
		Node node = new Node(data);
		
		node.next = head;
		head = node;
	}
	
	
	public void pairWiseSwap()
	{
		Node temp = head;
		
		while(temp !=null && temp.next !=null)
		{
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
					
		}
	}
	
	public void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(" "+temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		PairWiseSwap obj = new PairWiseSwap();
		obj.add(5);
		obj.add(4);
		obj.add(3);
		obj.add(2);
		obj.add(1);
		obj.print();
		obj.pairWiseSwap();
		System.out.println(" after pairwise swap ");
		obj.print();
	}
}
