
public class PairwiseSwap {
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

	public static void print()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
	}
	
	public static void pairWiseSwap()
	{
		Node temp = head;
		while(temp !=null && temp.next != null)
		{
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
	}
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next=new Node(4);
		node.next.next.next.next=new Node(5);
		node.next.next.next.next.next=new Node(6);
		
		PairwiseSwap obj = new PairwiseSwap();
		obj.head = node;
		print();
		pairWiseSwap();
		System.out.println();
		print();
		
	}
}
