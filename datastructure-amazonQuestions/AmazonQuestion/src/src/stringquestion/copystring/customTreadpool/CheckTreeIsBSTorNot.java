package src.stringquestion.copystring.customTreadpool;

public class CheckTreeIsBSTorNot {
	
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
	
	public static boolean checkBst(Node root,Node left,Node right)
	{
		if(root == null)
			return true;
		if(left != null && root.data <left.data)
			return false;
		if(right != null && root.data >right.data)
			return false;
		
		return checkBst(root.left, left, root) && checkBst(root.right, root, right);
	}

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left  = new Node(3);
		root.right = new Node(8);
		root.left.left = new Node(9);
		System.out.println(checkBst(root,null,null));
	}
}
