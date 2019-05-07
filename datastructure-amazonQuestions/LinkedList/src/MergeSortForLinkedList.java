
public class MergeSortForLinkedList {
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
	
	public static Node getMiddle(Node node)
	{
		Node slow =node;
		Node fast = node;
		while(fast!=null)
		{
			fast = fast.next;
			if(fast != null && fast.next!= null)
			{
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}
	public static Node mergeSort(Node node)
	{
		if(node == null || node.next == null)
			return node;
		Node middle=getMiddle(node);
		Node nextOfMiddle = middle.next;
		middle.next = null;
		Node left = mergeSort(node);
		Node right = mergeSort(nextOfMiddle);
		Node sortedList = sortedList(left,right);
		return sortedList;
		
	}
	
	
	
	
	public static Node sortedList(Node a,Node b)
	{
		if(a== null)
			return b;
		if(b== null)
			return a;
		Node result=null;
		if(a.data<=b.data)
		{
			result =a;
			result.next = sortedList(a.next, b);
			
		}
		else 
		{
			result = b;
			result.next = sortedList(a, b.next);
		}
		return result;
	}
	
	
	public static void print(Node node)
	{
		Node temp = node;
		while(temp!=null)
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(12);
		node.next.next = new Node(3);
		node.next.next.next=new Node(14);
		node.next.next.next.next=new Node(5);
		node.next.next.next.next.next=new Node(16);
		node.next.next.next.next.next.next=new Node(7);
		node.next.next.next.next.next.next.next=new Node(18);
		Node nod =mergeSort(node);
		print(nod);
	}

}
