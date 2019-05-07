package com.practise.linkedlist;

import com.practise.linkedlist.AddTwoNumberRepresentdByLinkedList.Node;

public class AddTwoNumberOfLinkedList {
	
	Node head1;
	Node head2;
	
	public void print(Node node)
	{
		
		Node temp = node;
		while(temp != null)
		{
			System.out.print(" "+temp.data	);
			temp = temp.next;
		}
	}
	
	public Node addTwoNumber(Node first, Node second)
	{
		Node prev=null;
		int carry=0,sum=0;
		Node res =null;
		Node temp =null;
		while(first != null || second != null)
		{
			sum =carry+ (first!=null ?first.data:0) + (second != null ?second.data :0);
			
			carry = sum>=10?1:0;
			
			sum = sum %10;
			
			 temp = new Node(sum);
			if(res == null)
			{
				res = temp;
			}
			else
			{
				prev.next = temp;
			}
			prev = temp;
			if(first != null)
				first = first.next;
			if(second != null)
				second = second.next;
			
		}
		
		if(carry>0)
			prev.next = new Node(carry);
		
		return res;
	}

	public static void main(String[] args) {
		
		AddTwoNumberOfLinkedList obj = new AddTwoNumberOfLinkedList();
		obj.head1 = new Node(7); 
		obj.head1.next = new Node(5); 
		obj.head1.next.next = new Node(9); 
		obj.head1.next.next.next = new Node(4); 
		obj.head1.next.next.next.next = new Node(6); 
		System.out.print("First List is "); 
		obj.print(obj.head1); 
System.out.println();
		AddTwoNumberOfLinkedList obj2 = new AddTwoNumberOfLinkedList();
		// creating seconnd list 
		obj2.head2 = new Node(8); 
		obj2.head2.next = new Node(4); 
		System.out.print("Second List is "); 
		obj2.print(obj2.head2); 
System.out.println();
		// add the two lists and see the result 
		Node rs = obj.addTwoNumber(obj.head1, obj2.head2); 
		System.out.print("Resultant List is "); 
		obj.print(rs); 
	}
}
