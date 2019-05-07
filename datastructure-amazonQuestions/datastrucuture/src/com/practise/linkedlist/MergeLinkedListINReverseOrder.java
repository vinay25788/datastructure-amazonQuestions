package com.practise.linkedlist;


public class MergeLinkedListINReverseOrder {
	
	Node head;
	
	public void add(int data)
	{
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public void print(Node head)
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
	}
	
	
	public Node reverseK(Node head,int k)
	{
		Node next = null;
		Node prev = null;
		Node cur = head;
		int count =0;
		
		while(count<k && cur!=null)
		{
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur= next;
			
			count++;
		}
		
		if(next != null)
		head.next = 	reverseK(next, k);
		
		return prev;
	}
	
	
	
	
	
	
	public Node merge(Node node1,Node node2)
	{
		if(node1 == null && node2 == null)
		{
			return null;
		}
		
		Node res= null;
		
		
		while(node1 != null & node2 !=null)
		{
			if(node1.data < node2.data)
			{
				Node temp = node1.next;
				node1.next = res;
				res = node1;
				node1 = temp;
			}
			else
			{
				Node temp = node2.next;
				node2.next = res;
				res = node2;
				node2 = temp;
			}
		}
		
		
		while(node1 != null)
		{
			Node temp = node1.next;
			node1.next = res;
			res = node1;
			node1 = temp;
		}
		
		while(node2 != null)
		{
			Node temp = node2.next;
			node2.next = res;
			res = node2;
			node2 = temp;
		}
		return res;
	}
	
	public static void main(String[] args) {
		MergeLinkedListINReverseOrder obj = new MergeLinkedListINReverseOrder();
		obj.add(5);
		obj.add(4);
		obj.add(3);
		obj.add(2);
		obj.add(1);
		
		MergeLinkedListINReverseOrder obj2 = new MergeLinkedListINReverseOrder();
		obj2.add(8);
		obj2.add(7);
		obj2.add(6);
		obj2.add(5);
		
		obj.print(obj.head);
		System.out.println(" second list ");
		obj2.print(obj2.head);
		System.out.println(" after merge ");
		Node merged = obj.merge(obj.head, obj2.head);
		obj.print(merged);
		System.out.println();
				System.out.println(" reverse k node ");
				MergeLinkedListINReverseOrder obj3 = new MergeLinkedListINReverseOrder();
				obj3.add(5);
				obj3.add(4);
				obj3.add(3);
				obj3.add(2);
				obj3.add(1);
			obj3.print(obj3.reverseK(obj3.head, 2));
//			/obj.print(temp);
	}

}
