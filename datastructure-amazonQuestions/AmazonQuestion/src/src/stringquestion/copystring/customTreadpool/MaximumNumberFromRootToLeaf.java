package src.stringquestion.copystring.customTreadpool;


import src.stringquestion.copystring.customTreadpool.MaximumNumberFromRootToLeaf.Node;

class Max
{
	int max;
}
public class MaximumNumberFromRootToLeaf {

	static int max;
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
	
	public static void path(Node root)
	{
		int path =0;
		Max m = new Max();
		pathUtil(root,path,m);
		System.out.println(m.max);
	}
	public static void pathUtil(Node root,int path,Max max)
	{
		if(root == null)
	      return;
		path=path*10+root.data;
		if(root.left == null && root.right == null)
		{
			if(max.max<path)
				max.max = path;
		}
		pathUtil(root.left, path,max);
		pathUtil(root.right, path,max);
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right =new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.right = new Node(6);
		root.right.right= new Node(7);
		path(root);
	}
}











