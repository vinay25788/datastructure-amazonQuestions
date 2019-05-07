
public class RearrangeSmallBigLinkedlist {
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
	
	public static void rearrange(Node head1)
	{
		Node slow = head1;
		Node fast = head1;
		while(fast!= null)
		{
			fast = fast.next;
			if(fast!=null && fast.next !=null)
			{
				slow = slow.next;
				fast =fast.next;
			}
		}
		
		Node middle = slow;
		Node secondHead = reverse(slow.next);
		Node node = new Node(0);
		Node cur = node;
		Node temp = head1;
		while(temp!=null && secondHead !=null)
		{
			if(temp!=null)
			{
				cur.next = temp;
				cur = cur.next;
				temp = temp.next;
			}
			if(secondHead !=null)
			{
				cur.next = secondHead;
				cur = cur.next;
				secondHead= secondHead.next;
			}
		}
		
		head1 = node.next;
		temp = head1;
		while(temp!=null)
		{
			System.out.print(temp.data +" ");
			temp =temp.next;
		}
	}
	
	public static Node reverse(Node head)
	{
		Node cur = head;
		Node prev = null;
		Node next = null;
		while(cur!=null)
		{
			next = cur.next;
			cur.next = prev;
			prev =cur;
			cur = next;
		}
		return prev;
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
		rearrange(head1);
	}
}
