package src.stringquestion.copystring.customTreadpool;

public class MinimumDepth {
	
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
	
	public static int findMinimum(Node root,int levl)
	{
		if(root == null)
			return levl;
		levl++;
		return Math.min(findMinimum(root.left,levl), findMinimum(root.right,levl));
	}
	public static int findMindept(Node root)
	{
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		
		if(root.left == null)
			return findMindept(root.right)+1;
		if(root.right == null)
			return findMindept(root.left)+1;
		
		return 1+Math.min(findMindept(root.left), findMindept(root.right));
		
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.right = new Node(3);
		root.left = new Node(2);
		root.left.right = new Node(5);
		root.left.left = new Node(4);
		
		System.out.println(findMindept(root));
		System.out.println(findMinimum(root,0));
	}

}
