package com.practise.linkedlist;

public class InterSectionOfTwoLinkedlist {
	
	Node head;
	
	public void add(int data)
	{
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public void intersections(Node head1,Node head2)
	{
		Node temp1 = head1, temp2 = head2;
		while(temp1 != null  && temp2 !=null)
		{
			if(temp1.data == temp2.data) {
			System.out.print( " "+temp1.data);
			temp1 = temp1.next ;
			temp2 = temp2.next;
			}
			else if(temp1.data <temp2.data)
			{
				temp1 = temp1.next;
			}
			else
				temp2 = temp2.next;
			
		}
	}
	
	public void print(Node head)
	{
		Node temp = head;
		while(temp !=null)
		{
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		InterSectionOfTwoLinkedlist obj = new InterSectionOfTwoLinkedlist();
		InterSectionOfTwoLinkedlist obj2 = new InterSectionOfTwoLinkedlist();
		obj.add(5);
		obj.add(4);
		obj.add(3);
		obj.add(2);
		obj.add(1);
		obj2.add(7);
		obj2.add(6);
		obj2.add(5);
		obj2.add(4);
		obj.print(obj.head);
		System.out.println(" second list");
		obj2.print(obj2.head);
		System.out.println(" intersection ");
		obj.intersections(obj.head, obj2.head);
	}

}
