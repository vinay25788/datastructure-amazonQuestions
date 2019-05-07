
public class MergeTwoSortedList {

	static class Node
	{
		int data;
		Node next;
		Node()
		{
			
		}
		Node(int data)
		{
			this.data =data;
		}
	}
	
	/*public static Node meregeRecursion(Node a,Node b)
	{
		Node result=null;
		if(a== null)
			return b;
		if(b== null)
			return a;
		if(a== null && b==null)
			return null;
		if(a.data<b.data)
		{
			result = a;
			result.next = meregeRecursion(a.next, b);
		}
		else if(b.data<a.data)
		{
			result  = b;
			result.next = meregeRecursion(a, b.next);
			
		}
		else
		{
			Node temp1 = a;
			temp1.next=null;
			Node temp2 = b;
			result = temp;
			result.next = b;
			result.next.next = meregeRecursion(a.next, b.next);
		}
		return result;
	}*/
	
	
	public static void merge(Node head,Node head2)
	{
		Node result = new Node();
		Node head3 = null;
		
		
		while(head!=null && head2!=null)
		{
			
			if(head.data<=head2.data)
			{
				result.next = head;
				head= head.next;
				//result.next = null;
				
				
			}
			else 
			{
				result.next=head2;
				head2= head2.next;
				//result.next = null;
			}
			
			if(head3 == null)
				head3 = result.next;
			
			result =result.next;
			result.next=null;
			
		}
		if(head !=null)
		result.next = head;
		if(head2 !=null)
			result.next = head2;
		Node temp = head3;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp =temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next= new Node(2);
		head.next.next = new Node(3);
		
		Node head2 = new Node(2);
		head2.next = new Node(3);
		merge(head,head2);
	/*//	Node result = meregeRecursion(head, head2);
		Node temp =result;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp = temp.next;
		}*/
	}
}
