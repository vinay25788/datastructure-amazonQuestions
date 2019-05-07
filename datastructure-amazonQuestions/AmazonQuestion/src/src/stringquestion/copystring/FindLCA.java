package src.stringquestion.copystring;

public class FindLCA {
	
	static boolean v1,v2;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.right=new Node(3);
		root.right = new Node(4);
		root.left.left = new Node(5);
		root.right.right= new Node(6);
		findLCA(root,5,16);
	}

	public static void findLCA(Node root,int n1,int n2)
	{
		
		Node data = findLCAUtil(root,n1,n2);
		if(v1 && v2)
			System.out.println(data.data);
		else
			System.out.println(" number not present");
	}
	
	public static Node findLCAUtil(Node root, int n1,int n2)
	{
		if(root == null)
			return null;
		if(root.data == n1 )
		{
			v1= true;
			return root;
		}
		if(root.data == n2)
		{
			v2 = true;
			return root;
		}
		Node leftLCA = findLCAUtil(root.left, n1, n2);
		Node rightLCA = findLCAUtil(root.right, n1, n2);
		
		if(leftLCA != null && rightLCA !=null)
			return root;
		
		return leftLCA != null ? leftLCA:rightLCA;
	}
}










