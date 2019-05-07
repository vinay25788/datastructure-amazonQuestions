
public class DecimalEqualValent {

	static class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) {data = d; next = null; } 
	} 
	
	public static void decimalEquil(Node head)
	{
		int res =0;
		Node temp = head;
		while(temp!=null)
		{
			res = (res<<1)+temp.data;
			temp =temp.next;
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.next = new Node(0);
		head1.next.next = new Node(0);
		decimalEquil(head1);
	}
}
