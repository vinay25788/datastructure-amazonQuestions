
class MaxNumber
{
	int max;
}
public class FindMaxNumberFromTreefromRootToleaf {
	
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
	
	public static void findPath(Node root)
	{
		MaxNumber max= new MaxNumber();
		findPathUtil(root,max,0);
		System.out.println(max.max);
	}
	
	public static void findPathUtil(Node root,MaxNumber max,int number)
	{
		if(root == null) {
			return;
		}
		number=number*10+root.data;
		if(root.left == null && root.right == null)
		{
			if(max.max<number)
			{
				max.max =number;
			}
			//return;
		}
		
		findPathUtil(root.left, max, number);
		
		findPathUtil(root.right, max, number);
		
		
	}
	
	public static void main(String[] args) {
		/*Node root = new Node(1);
		root.left = new Node(2);
		root.left.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.right = new Node(5);
		root.left.right.left= new Node(9);
		root.left.right.right = new Node(8);*/
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(3);
		root.left.left = new Node(8);
		root.left.right = new Node(7);
		root.left.right.left = new Node(6);
		root.right.right= new Node(7);
		findPath(root);
	}

}
