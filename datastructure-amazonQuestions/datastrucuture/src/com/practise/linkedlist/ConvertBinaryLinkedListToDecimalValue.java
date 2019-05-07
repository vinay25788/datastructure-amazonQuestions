package com.practise.linkedlist;

public class ConvertBinaryLinkedListToDecimalValue {
	
	Node head;
	
	public void add(int data)
	{
		Node newN = new Node(data);
		newN.next = head;
		head = newN;
	}
	
	
	public void conver(Node head)
	{
		Node cur = head;
		int res =0;
		while(cur != null)
		{
			res= res<<1 + cur.data;
			cur = cur.next;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		ConvertBinaryLinkedListToDecimalValue obj = new ConvertBinaryLinkedListToDecimalValue();
		obj.add(1);
		obj.add(0);
		obj.add(1);
		obj.conver(obj.head);
	}

}
