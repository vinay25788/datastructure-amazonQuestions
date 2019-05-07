
public class RetainMThenDeleteN {
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
	
	public static void retainAndDelete(Node head,int m,int n)
	{
		int count=0;
		Node cur= head;
		Node prev = null;
		while(cur!=null)
		{
			for(count=0;count<m && cur!=null;count++)
			{
				prev = cur;
				cur = cur.next;
			}
			
			if(cur!=null)
			{
				for(count=0;count<n && cur!=null ;count++)
				{
					cur = cur.next;
				}
				prev.next = cur;
			}
		}
		
		cur = head;
		while(cur!=null)
		{
			System.out.print(" "+cur.data);
			cur = cur.next;
		}
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
		
		
		retainAndDelete(head1,2,2);
	}

}
