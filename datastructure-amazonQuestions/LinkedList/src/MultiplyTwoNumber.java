
public class MultiplyTwoNumber {
	
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

	public static void multiply(Node a,Node b)
	{
		int num1=0,num2=0;
		while(a!=null || b!=null)
		{
			if(a !=null)
			{
				num1 = num1*10+a.data;
				a=a.next;
			}
			if(b!=null)
			{
				num2 = num2*10+b.data;
				b=b.next;
			}
			
		}
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		Node head1 = new Node(1);
		 head1.next = new Node(2);
		 head1.next.next = new Node(3);
		Node head2 = new Node(1);
		 head2.next = new Node(0);
		 multiply(head1, head2);
		
	}
}
