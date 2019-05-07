package com.practise.linkedlist;


public class RearrangeTogether {
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public static void rearrang(Node head)
	{
		Node odd= head;
		Node even = head.next;
		Node evenFirst = even;
		
		while(true)
		{
			if(odd == null || even== null || even.next == null)
			{
				odd.next = evenFirst;
				break;
			}
			
			odd.next = even.next;
			odd = even.next;
			if(odd.next == null)
			{
				odd.next=evenFirst;
				even.next = null;
				break;
			}
			
			even.next =odd.next;
			even = odd.next;
		}
		
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp =temp.next;
		}
	}
	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		head1.next.next.next.next.next = new Node(6);
		head1.next.next.next.next.next.next = new Node(7);
		head1.next.next.next.next.next.next.next = new Node(8);
		head1.next.next.next.next.next.next.next.next = new Node(9);
		rearrang(head1);
	}

}
