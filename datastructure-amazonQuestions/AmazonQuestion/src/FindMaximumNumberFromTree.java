
class Node
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
class Max
{
	int max;
}
public class FindMaximumNumberFromTree {

	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(3);
		root.left.left = new Node(8);
		root.left.right = new Node(7);
		root.left.right.left = new Node(6);
		root.right.right= new Node(7);
		
		findMaxi(root);
	}
	
	public static void findMaxi(Node root)
	{
		Max max = new Max();
		findMaxiUtil(root,0,max);
		System.out.println(max.max);
	}
	
	public static void findMaxiUtil(Node root,int num,Max max)
	{
		if(root == null)
			return ;
		num = num*10+root.data;
		if(root.left == null && root.right == null)
		{
			if(max.max<num)
				max.max = num;
		}
		findMaxiUtil(root.left, num, max);
		findMaxiUtil(root.right, num, max);
	}
	


}















