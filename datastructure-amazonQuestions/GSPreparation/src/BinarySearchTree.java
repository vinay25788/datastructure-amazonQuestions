
public class BinarySearchTree {
	
	Node root;
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root = new Node();
	}
	static class Node
	{
		int data;
		Node left,right;
		Node()
		{
			
		}
		Node(int data)
		{
			this.data = data;
			this.left= null;
			this.right = null;
		}
		
	}
	
	public void insert(int data)
	{
		insert(root,data);
	}
	public void insert(Node node,int data)
	{
	
		if(node.data  == 0)
		{
				node.data =data;
				//root = newNode;
		}
		else
		{
			if(data<node.data)
			{
				if(node.left== null)
				{
					node.left= new Node();
				}
				insert(node.left, data);
			}
			else 
			{
				if(node.right == null)
				{
					node.right = new Node();
				}
				insert(node.right ,data);
			}
		}
		
	}
	
	public void inorder(Node node)
	{
		if(node !=null)
		{
			inorder(node.left);
			System.out.print(" "+node.data);
			inorder(node.right);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree obj = new BinarySearchTree();
		obj.insert(4);
		obj.insert(2);
		obj.insert(1);
		obj.insert(10);
		obj.inorder(obj.root);
		
	}

}
