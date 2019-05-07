package src.stringquestion.copystring.customTreadpool;

public class SumTwoLinkedListNumber {
	
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

	public static Node add(Node first,Node second)
	{
		int sum =0;
		int carry = 0;
		Node temp = null;
		Node res = null;
		Node prev = null;
		while(first != null || second != null)
		{
			 sum = carry+ (first!=null ?first.data :0)+(second != null ?second.data:0);
			 
			 carry = sum>=10?1:0;
			 sum = sum%10;
			 temp = new Node(sum);
			 if(res == null	)
			 {
				 res = temp;
			 }
			 else
			 {
				 prev.next = temp;
			 }
			 prev = temp;
			 if(first !=null)
				 first = first.next;
			 if(second !=null)
				 second = second.next;
		}
		
		if(carry>0)
			{
			temp.next = new Node(carry);
			}
		
		
		return res;
	}
	
	public static void print(Node head)
	{
		Node temp = head;
		while(temp !=null)
		{
			System.out.print(temp.data+" ");
			temp =temp.next;
		}
	}
	public static void main(String[] args) {
		Node head1 = new Node(5);
		head1.next = new Node(6);
		head1.next.next = new Node(3);
		
		Node head2 = new Node(8);
		head2.next = new Node(4);
		head2.next.next = new Node(2);
		 
		Node head3 = add(head1,head2);
		print(head3);
	}
}
