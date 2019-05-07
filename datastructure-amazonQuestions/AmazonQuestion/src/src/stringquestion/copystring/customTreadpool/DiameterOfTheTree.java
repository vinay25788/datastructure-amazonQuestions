package src.stringquestion.copystring.customTreadpool;

class Height
{
	int h;
}
public class DiameterOfTheTree {
	
	Node root;
	
	static class Node
	{
		int data ;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static int findDiameter(Node root)
	{
		Height h= new Height();
		return findDiameterOp(root,h);
	}
	
	public static int findDiameterOp(Node root,Height h)
	{
		if(root == null)
		{
			h.h=0;
			return 0;
		}
		
		Height lh = new Height();
		Height rh = new Height();
		
		int ldiameter = findDiameterOp(root.left, lh);
		int rdiameter = findDiameterOp(root.right, rh);
		
		h.h = Math.max(lh.h, rh.h)+1;
		
		return Math.max(lh.h+rh.h+1, Math.max(ldiameter, rdiameter));
		
		
	}
	
	
public static void main(String[] args) {
	Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(5);
	root.left.left = new Node(3);
	root.left.right = new Node(4);
	root.right.left = new Node(13);
	root.right.left.left= new Node(15);
	root.right.left.right = new Node(16);
	root.right.right= new Node(6);
	root.right.right.left = new Node(12);
	root.right.right.right = new Node(7);
	root.right.right.right.left= new Node(11);
	root.right.right.right.right= new Node(8);
	
	System.out.println(findDiameter(root));
}

}
