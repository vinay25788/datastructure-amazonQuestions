
public class Sort1s2s0s {
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
	
	public static void sort(Node head)
	{
		int count[] = new int[3];
		Node temp = head;
		while(temp!= null)
		{
			count[temp.data]++;
			temp = temp.next;
		}
		int i=0;
		temp = head;
		while(temp != null)
		{
			if(count[i]==0)
			{
				i++;
			}
			else
			{
				temp.data = i;
				count[i]--;
				temp =temp.next;
			}
		}
		
		temp = head;
		while(temp!=null)
		{
			System.out.print(" "+ temp.data);
			temp =temp.next;
		}
	}
	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.next = new Node(0);
		head1.next.next = new Node(2);
		head1.next.next.next = new Node(2);
		head1.next.next.next.next = new Node(0);
		head1.next.next.next.next.next = new Node(1);
		sort(head1);
		
		
		
	}
}
