package com.practise.linkedlist;

public class MergeTwoLinkedList {
	
	Node head;
	
	public Node getMiddle(Node head)
	{
		if(head == null)
			return null;
		Node slow = head;
		Node fast = head.next;
		/*while(fast != null && fast.next != null)
		{
			fast =  fast.next.next;
			slow = slow.next;
		}*/
		while (fast != null) 
        { 
            fast = fast.next; 
            if(fast!=null) 
            { 
                slow = slow.next; 
                fast=fast.next; 
            } 
        } 
		
		return slow;
	}
	
	public Node sort(Node h)
	{
		if(h == null || h.next == null	)
			return h;
		Node middle = getMiddle(h);
		Node nextOfMiddle = middle.next;
		middle.next = null;
		Node left = sort(h);
		Node right = sort(nextOfMiddle);
		Node sortedList = mergeSort(left,right);
		
		return sortedList;
		
	}
	
	
	public Node mergeSort(Node a,Node b)
	{
		Node result=null;
		if (a == null) 
			return b; 
		if (b == null) 
			return a; 
		if(a.data<b.data)
		{
			result = a;
			result.next = mergeSort(a.next,b);
		}
		else
		{
			result = b;
			result.next = mergeSort(a,b.next);
		}
	return	result;
	}
	public void print(Node head)
	{
		Node cur = head;
		while(cur != null)
		{
			System.out.print(" "+cur.data);
			cur = cur.next;
		}
	}
	
	public static void main(String[] args) {
		MergeTwoLinkedList obj = new MergeTwoLinkedList();
		obj.head = new Node(1);
		obj.head.next = new Node(2);
		obj.head.next.next = new Node(3);

		obj.head.next.next.next = new Node(30);
		obj.head.next.next.next.next = new Node(13);
		obj.head.next.next.next.next.next= new Node(10);
		System.out.println();
		Node list = obj.sort(obj.head);
		obj.print(list);
		
		
	}

}
