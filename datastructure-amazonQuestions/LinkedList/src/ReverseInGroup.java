
public class ReverseInGroup {

	
	
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
	
	public Node reverse(Node node,int k)
	{
		Node next=null;
		Node prev = null;
		int count=0;
		Node cur = node;
		
			while(cur!=null && count<k )
			{
				next = cur.next;
				cur.next =prev;
				prev = cur;
				cur = next;
				count++;
			}
			
			if(next!= null)
			{
				node.next= reverse(next, k);
			}
			
	//	}
		return prev;
	
	}
	
	public void print(Node node)
	{
		Node temp = node;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
				
	}
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next=new Node(4);
		node.next.next.next.next=new Node(5);
		node.next.next.next.next.next=new Node(6);
		node.next.next.next.next.next.next=new Node(7);
		node.next.next.next.next.next.next.next=new Node(8);
		
		ReverseInGroup obj = new ReverseInGroup();
		obj.print(node);
		System.out.println();
		Node head =obj.reverse(node, 3);
		obj.print(head);
	}
}
