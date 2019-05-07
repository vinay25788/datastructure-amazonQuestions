
public class CountNumberOfNodeWithRecursion {
	
	static Node head;
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
	
	public static int count(Node head)
	{
		if(head == null)
			return 0;
		return 1+count(head.next);
					
		
		
	}
	
	public static void printReverse(Node head)
	{
		if(head == null)
			return;
		
		printReverse(head.next);
		
		System.out.print(head.data+" ");
		
	}
	public static void print(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	public static Node reverse(Node head)
	{
		Node cur=head;
		Node prev = null;
		Node next = null;
		while(cur!=null)
		{
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur =  next;
		}
		
		return prev;
	}
	
	public static Node reverseUsingRecursion(Node cur,Node prev)
	{
		if(cur.next == null)
		{
			head = cur;
			cur.next= prev;
			return cur;
		}
		
		Node next = cur.next;
		cur.next = prev;
		reverseUsingRecursion(next, cur);
		
		return head;
	}
	
	public static Node reverseEveryKNode(Node head,int k)
	{
		Node cur = head;
		Node prev= null;
		Node next = null;
		int count =0;
		while(count<k && cur !=null)
		{
			next = cur.next;
			cur.next = prev;
			prev =cur;
			cur = next;
			count++;
		}
		
		if(next!=null)
		{
			head.next= reverseEveryKNode(next, k);
		}
		
		return prev;
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		System.out.println(count(head));
		print(head);
		/*printReverse(head);
		System.out.println();
		head =reverse(head); 
		print(head);
		System.out.println();
		head =reverse(head); 
		print(head);
		System.out.println();
		head =reverseUsingRecursion(head,null); 
		print(head);
		System.out.println();*/
		head = reverseEveryKNode(head,3);
		System.out.println();
		print(head);
		//print(head);
	}
	
}
