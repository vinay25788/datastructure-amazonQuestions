
public class CheckLinkedListIspallindromeOrNot {
	
	Node head;
	Node left;
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
	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head== null)
		{
			
			head = newNode;
		}
		else
		{
			Node temp = head;
			while(temp.next !=null)
			{
				temp= temp.next;
			}
			temp.next= newNode;
		}
	}
	
	public void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public boolean checkPallindrome()
	{
		Node middle = findMiddle(head);
		Node secondHead = reverse(middle.next);
		boolean isPallin = true;
		Node first = head;
		Node second = secondHead;
		while(first != null && second!=null)
		{
			if(first.data != second.data)
			{
				isPallin = false;
				break;
			}
			
			first = first.next;
			second = second.next;
		}
		
		middle.next = reverse(secondHead);
		
		return isPallin;
	}
	
	public Node reverse(Node node)
	{
		Node curr= node;
		Node prev = null;
		Node next = null;
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public Node findMiddle(Node head)
	{
		Node slow = head,fast = head;
		while(fast!= null)
		{
			fast = fast.next;
			if(fast != null && fast.next!=null)
			{
				slow = slow.next;
				fast=fast.next;
			}
		}
		return slow;
	}
	
	public boolean IsPallindrome(Node right)
	{
		left = head;
		 
		if(right == null)
		{
			return true;
		}
		boolean isPallin = IsPallindrome(right.next);
		if(isPallin == false)
		{
			return false;
		}
		boolean isIsp1 = (right.data == left.data);
		left = left.next;
		return isIsp1;
				
	}
		public static void main(String[] args) {
			
			CheckLinkedListIspallindromeOrNot obj = new CheckLinkedListIspallindromeOrNot();
			obj.add(1);
			obj.add(2);
			obj.add(3);
			obj.add(3);
			obj.add(2);
			obj.add(1);
			obj.print();
			
			boolean isPllin = obj.checkPallindrome();
			if(isPllin)
			{
				System.out.println("linkedList is pallindrome ");
			}
			else
				System.out.println(" Not Pallindrome ");
			
			obj.print();
			Node head = obj.head;
			System.out.println(obj.IsPallindrome(head));
		}
}
