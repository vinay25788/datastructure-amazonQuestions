package src.stringquestion.copystring;

public class FindAllPathInBinaryTreeFromRootToleaf {
	
	
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
	
	public void findPath(Node root)
	{
		int[] values = new int[100];
		findPathUtil(root,values,0);
	}
	public void findPathUtil(Node root,int[] values,int k)
	{
		if(root == null)
			return;
		if(root.left == null && root.right == null)
		{
			for(int i=0;i<k;i++)
			{
				System.out.print(values[i]+" ");
			}
			//return;
			
			System.out.print(root.data);
			System.out.println();
		}
		values[k] = root.data;
		findPathUtil(root.left, values, k+1);
		findPathUtil(root.right, values, k+1);
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left=new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(6);
		root.right.left = new Node(7);
		root.right.right  = new Node(8);
		FindAllPathInBinaryTreeFromRootToleaf obj = new  FindAllPathInBinaryTreeFromRootToleaf();
		obj.findPath(root);
	}
}





