import java.util.ArrayList;
import java.util.List;

public class SearchInBST {
	
static 	Node root;
	
	SearchInBST()
	{
		root = null;
	}
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
			this.left= null;
			this.right = null;
		}
	}
	public static void insert(int data)
	{
		root = insert(root,data);
	}
	public static Node insert(Node node,int data)
	{
		if(node == null)
		{
			node= new Node(data);
			
			return node;
		}
		if(node.data>data)
			node.left= insert(node.left, data);
		else if(node.data<data)
			node.right = insert(node.right,data);
		return node;
	}
	public static boolean searchInBST(int data)
	{
		return searchInBST(root,data);
				
	}
	
	public static boolean searchInBST(Node root,int data)
	{
		if(root == null)
			return false;
		if(root.data == data)
			return true;
		if(data<root.data)
			return searchInBST(root.left, data);
		return searchInBST(root.right, data);
	}
	public static List<Integer> inorder()
	{
		List<Integer> list = new ArrayList<>();
		 inorder(root,list);
		 return list;
	}
	public static void inorder(Node root,List<Integer> list)
	{
		if(root != null)
		{
			inorder(root.left,list);
			//System.out.print(root.data+" ");
			list.add(root.data);
			inorder(root.right,list);
		}
	}
	public static void main(String[] args) {
		//Node root = new Node(5);
		SearchInBST obj = new SearchInBST();
		insert(5);
		insert(3);
		insert(8);
		System.out.println(inorder());
		System.out.println(searchInBST(80));
	}

}
