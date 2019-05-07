package com.practise.linkedlist;

public class PrintReveseWithoutReverse {
	
	Node head;
	
	public void add(int data)
	{
		Node node= new Node(data);
		node.next = head;
		head = node;
		
	}

	public void reverse(Node head)
	{
		if(head == null)
			return;
		
		 reverse(head.next);
		System.out.println(head.data);
	}
	
	public static void main(String[] args) {
		PrintReveseWithoutReverse obj = new PrintReveseWithoutReverse();
		obj.add(5);
		obj.add(4);
		obj.add(3);
		obj.add(2);
		obj.add(1);
		obj.reverse(obj.head);
	}
}
