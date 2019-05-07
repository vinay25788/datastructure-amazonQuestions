
// Java program to flatten a multilevel linked list 
public class FlattenMultiLevel { 

	static Node last; 

	// Flattens a multi-level linked list depth wise 
	/* 
	 * 1 2 7 9 14 15 23 24 8 16 17 18 19 20 21 10 11 12 3 4 
1 - 2 - 3 - 4
    |
    7 -  8 - 10 - 12
    |    |    |
    9    16   11
    |    |
    14   17 - 18 - 19 - 20
    |                    |
    15 - 23             21
         |
         24
	 */
	public static Node flattenList(Node node) 
	{ 
		if(node==null) 
			return null; 
	
		// To keep track of last visited node 
		// (NOTE: This is static) 
		last = node; 
	
		// Store next pointer 
		Node next = node.next; 
	
		// If down list exists, process it first 
		// Add down list as next of current node 
		if(node.down!=null) 
			node.next = flattenList(node.down); 
	
		// If next exists, add it after the next 
		// of last added node 
		if(next!=null) 
			last.next = flattenList(next); 
	
		return node; 
	} 

	// Utility method to print a linked list 
	public static void printFlattenNodes(Node head) 
	{ 
		Node curr=head; 
		while(curr!=null) 
		{ 
			System.out.print(curr.data+" "); 
			curr = curr.next; 
		} 
		
	} 
	
	// Utility function to create a new node 
	public static Node push(int newData) 
	{ 
		Node newNode = new Node(newData); 
		newNode.next =null; 
		newNode.down = null; 
		return newNode; 
	} 
	
	public static void main(String args[]) { 
		Node head=new Node(1); 
		head.next = new Node(2); 
		head.next.next = new Node(3); 
		head.next.next.next = new Node(4); 
		head.next.down = new Node(7); 
		head.next.down.down = new Node(9); 
		head.next.down.down.down = new Node(14); 
		head.next.down.down.down.down= new Node(15); 
		head.next.down.down.down.down.next= new Node(23); 
		head.next.down.down.down.down.next.down = new Node(24); 
		head.next.down.next = new Node(8); 
		head.next.down.next.down = new Node(16); 
		head.next.down.next.down.down= new Node(17); 
		head.next.down.next.down.down.next= new Node(18); 
		head.next.down.next.down.down.next.next= new Node(19); 
		head.next.down.next.down.down.next.next.next 
											= new Node(20); 
		head.next.down.next.down.down.next.next.next.down 
											= new Node(21); 
		head.next.down.next.next = new Node(10); 
		head.next.down.next.next.down = new Node(11); 
		head.next.down.next.next.next = new Node(12); 

		head = flattenList(head); 
		printFlattenNodes(head); 
	} 
} 

//Node of Multi-level Linked List 
class Node 
{ 
	int data; 
	Node next,down; 
	Node(int data) 
	{ 
		this.data=data; 
		next=null; 
		down=null; 
	} 
} 
//This code is contributed by Gaurav Tiwari 
