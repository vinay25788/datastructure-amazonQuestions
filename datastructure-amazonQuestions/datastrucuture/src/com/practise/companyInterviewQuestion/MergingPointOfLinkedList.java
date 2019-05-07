package com.practise.companyInterviewQuestion;

import java.util.HashSet;
import java.util.Set;

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
public class MergingPointOfLinkedList {
	
	Node head;
	
	public void mergingPoint(Node head1,Node head2)
	{
	
		int count = getCount(head1);
		int count2 = getCount(head2);
		if(count2>count)
		{
			Node temp = head2;
			head2 = head1;
			head1 = temp;
		}
		
		int d = Math.abs(count - count2);
		Node temp = head1;
		while(temp !=null && d>0)
		{
			temp = temp.next ;
			d--;
		}
		
		while(temp != null && head2 != null)
		{
			if(temp.data == head2.data)
			{
				System.out.println(temp.data);
				return;
			}
			temp = temp.next;
			head2 = head2.next;
		}
	}
	
	public int getCount(Node head)
	{
		Node temp = head;
		int count =0;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public void mergeUsingMap(Node head,Node head2)
	{
		Set<Integer> set= new HashSet<>();
		while(head!= null)
		{
			set.add(head.data);
			head = head.next;
		}
		
		while(head2 != null)
		{
			if(set.contains(head2.data))
			{
				System.out.println(head2.data);
				return;
			}
		}
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(10);
		head.next.next = new Node(8);
		head.next.next.next = new Node(5);
		head.next.next.next.next= new Node(7);
		
		Node head2 = new Node(8);
		head2.next = new Node(7);
		head2.next.next= new Node(1);
		head2.next.next.next = new Node(11);
		
		MergingPointOfLinkedList obj = new MergingPointOfLinkedList();
		obj.mergingPoint(head, head2);
		obj.mergeUsingMap(head, head2);
	}

}
