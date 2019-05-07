package src.stringquestion.copystring.customTreadpool;

public class FindLCA {
	
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data =data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static Node lca(Node root,int a,int b)
	{
		if(root == null)
			return null;
		if(root.data == a || root.data == b)
		{
			return root;
		}
		Node left = lca(root.left,a,b);
		Node right = lca(root.right,a,b);
		if(left != null && right !=null)
			return root;
		return left==null?right:left;
		
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left= new Node(6);
		root.left.left.right = new Node(10);
		root.right.right = new Node(7);
		Node lca = lca(root,6,10);
		System.out.println(lca.data);
	}

}
