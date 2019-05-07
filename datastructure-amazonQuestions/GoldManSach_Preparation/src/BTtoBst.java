import java.util.Arrays;

public class BTtoBst {
	
	static class Index
	{
		int index;
	}
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
	
	public static void printInorder(Node root,int[] a,Index index)
	{
		if(root == null)
			return;
		
			printInorder(root.left,a,index);
			System.out.print(root.data+" ");
			a[index.index]=root.data;
			index.index++;
			printInorder(root.right,a,index);
	}
	
	public static Node createBst(Node root,Index ind,int[] a)
	{
		if(root == null)
			return null;
		
		createBst(root.left, ind, a);
		root.data = a[ind.index];
		ind.index++;
		createBst(root.right, ind, a);
		
		return root;
	}
		public static void main(String[] args) {
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left= new Node(4);
			root.left.right = new Node(5);
			int [] a= new int[5];
			printInorder(root,a,new Index());
			System.out.println("array");
			System.out.println(Arrays.toString(a));
			
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
			root = createBst(root, new Index(), a);
			System.out.println(" hello");
			printInorder(root, a, new Index());
		}
	
}
