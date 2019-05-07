package src.stringquestion.copystring;

public class ReverseKNodeInLinkedList {
	
	Node head;
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
	
	static Node reverseFull(Node node)
	{
		Node next = null,prev = null;
		Node cur = node;
		while(cur != null )
		{
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur= next;
		}
		
		return prev;
	}
	static Node reverseK(Node node,int k)
	{
		Node next=null,prev= null;
		Node cur = node;
		int count=0;
		while(cur != null && count<k)
		{
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			count++;
		}
		
		if(next != null)
		{
			node.next = reverseK(next, k);
		}
		return prev;
	}
	static void print(Node node)
	{
		Node temp = node;
		while(temp!= null)
		{
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
	}
 public static void main(String[] args) {
	Node head = new Node(1);
	head.next = new Node(2);
	head.next.next = new Node(3);
	head.next.next.next= new Node(4);
	head.next.next.next.next = new Node(5);
	head.next.next.next.next.next= new Node(6);
	head.next.next.next.next.next.next = new Node(7);
	print(head);
	Node rev = reverseFull(head);
	System.out.println();
	print(rev);
	Node newHead = reverseK(head, 3);
	System.out.println();
	print(newHead);
}
}
