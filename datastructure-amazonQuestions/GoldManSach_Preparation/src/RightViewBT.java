
public class RightViewBT {
	
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
	
	static class MaxLevel
	{
		int level;
	}
	
	public static void findRightView(Node root)
	{
		MaxLevel max = new MaxLevel();
		rightViewUtil(root,1,max);
	}
	
	public static void rightViewUtil(Node root,int level,MaxLevel max)
	{
		if(root == null)
			return ;
		if(level>max.level)
		{
			System.out.print(" "+root.data);
			max.level = level;
		}
		rightViewUtil(root.right, level+1, max);
		rightViewUtil(root.left, level+1, max);
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.right=new Node(5);
		findRightView(root);
	}
}
