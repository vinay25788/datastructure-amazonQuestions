
public class MergeTwoSortedLinkedList {
	
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
	public static void print(Node h)
	{
		Node temp = h;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static Node merge(Node a,Node b)
	{
		Node result=null;
		if(a== null)
			return b;
		if(b== null)
			return a;
		if(a.data<=b.data)
		{
			result = a;
			result.next = merge(a.next,b);
		}
		else
		{
			result = b;
			result.next = merge(a,b.next);
		}
			return result ;
	}
	public static Node mergeIterative(Node head1,Node head2)
	{
		Node dummy = new Node(0);
		Node tail = dummy;
		while(head1 != null && head2 != null)
		{
			if(head1.data <= head2.data)
			{
				tail.next = head1;
				head1 = head1.next;
			}
			else 
			{
				tail.next = head2;
				head2 = head2.next;
			}
				tail = tail.next;
		}
		while(head1 != null)
		{
			tail.next = head1;
			head1 = head1.next;
			tail = tail.next;
		}
		while(head2 != null)
		{
			tail.next = head2;
			head2 = head2.next;
			tail = tail.next;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		Node head1 = new Node(1);
		 head1.next = new Node(3);
		 head1.next.next = new Node(5);
		
		 head1.next.next.next = new Node(6);
		 head1.next.next.next.next = new Node(8);
		 
		 Node head2 = new Node(2);
		 head2.next = new Node(4);
		 head2.next.next = new Node(7);
		
		 head2.next.next.next = new Node(9);
		 head2.next.next.next.next = new Node(18);
//		 Node result = merge(head1,head2);
	//	 print(result);
		 
		 Node result = mergeIterative(head1, head2);
		 print(result);
	}

}
