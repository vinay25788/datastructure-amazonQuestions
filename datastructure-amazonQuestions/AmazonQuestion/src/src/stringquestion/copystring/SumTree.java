package src.stringquestion.copystring;

public class SumTree {
	
	Node root;

	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static int findNumber(Node root)
	{
		if(root == null)
			return 0;
		int old_val = root.data;
		 root.data= findNumber(root.left)+findNumber(root.right);
		return root.data+old_val;
	}
	
	public static void inorder(Node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(" "+root.data );
			inorder(root.right);
		}
	}
	public static void main(String[] args) {

		   
        /* Constructing tree given in the above figure */
        Node root = new Node(10); 
      root.left = new Node(-2); 
        root.right = new Node(6); 
        root.left.left = new Node(8); 
        root.left.right = new Node(-4); 
        root.right.left = new Node(7); 
        root.right.right = new Node(5); 
        SumTree obj = new SumTree();
        obj.root = root;
        System.out.println(findNumber(obj.root));
        inorder(obj.root);
	}
}
