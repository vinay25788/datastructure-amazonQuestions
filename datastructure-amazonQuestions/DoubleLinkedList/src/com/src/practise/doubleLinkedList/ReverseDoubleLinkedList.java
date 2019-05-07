package com.src.practise.doubleLinkedList;

public class ReverseDoubleLinkedList {
	
	Node head,tail;
	
	public static class Node
	{
		int data;
		Node next,prev;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void add(int data)
	{
		Node node= new Node(data);
		
		if(head == null)
			head = node;
		else
		{
			node.next = head;
			head.prev = node;
			head = node;
		}
	}

	public void reverse()
	{
		Node temp = null;
		Node cur = head;
		while(cur!=null)
		{
			temp = cur.prev;
			cur.prev = cur.next;
			cur.next = temp;
			cur = cur.prev;
			
		}
		if(temp!= null)
		cur = temp.prev ;
		while(cur!=null)
		{
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	
	public static void main(String[] args) {
		ReverseDoubleLinkedList obj = new ReverseDoubleLinkedList();
		obj.add(3);
		obj.add(2);
		obj.add(1);
		
obj.reverse();		
	}
}
