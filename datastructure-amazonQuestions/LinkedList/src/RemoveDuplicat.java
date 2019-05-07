import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicat {
	
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data =data;
			this.next = null;
		}
	}
	public void removeDuplicateFromSortedList()
	{
		Node temp = head;
		//Node prev= null;//2,2,2,3,3,3
		while(temp !=null)
		{
			if(temp.next!= null && temp.data == temp.next.data)
			{
				temp.next = temp.next.next;
			}
			else
				{
				temp = temp.next;
				}
		}
		
		temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public  void removeDuplicate()//1,2,3,2,1
	{
		Set<Integer> set = new HashSet<>();
		Node temp = head;
		Node prev=null;
		boolean flag=false;
		while(temp!=null)
		{
			if(set.contains(temp.data))
			{
				prev.next = temp.next;
			}
			else
			{
				set.add(temp.data);
				prev  = temp;
			}
			temp =temp.next;
		}
		
		temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Node node = new Node(2);
		node.next = new Node(2);
		node.next.next = new Node(2);
		node.next.next.next=new Node(3);
		node.next.next.next.next=new Node(3);
		node.next.next.next.next.next=new Node(3);
		RemoveDuplicat obj = new RemoveDuplicat();
		obj.head = node;
		//obj.removeDuplicate();
		obj.removeDuplicateFromSortedList();
	}

}
