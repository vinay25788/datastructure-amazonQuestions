

public class DiameterOfTheTree {
	Node root;
	
	static class Node 
	{ 
		int data; 
		Node left, right; 
		
		Node(int item) 
		{ 
			data = item; 
			left = right = null; 
		} 
	} 
	
	public int height(Node root)
	{
		if(root== null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		
		return lh>rh?lh+1:rh+1;				
	}
	
	public int diameter(Node root)
	{
		if(root == null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		int ld = diameter(root.left);
		int rd = diameter(root.right);
		
		
		return Math.max(lh+rh+1, Math.max(ld,rd));
	}
	
	public static void main(String[] args) {
		
		DiameterOfTheTree tree = new DiameterOfTheTree();
		tree.root = new Node(6); 
		tree.root.left = new Node(3); 
		tree.root.right = new Node(5); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(2); 
		System.out.println(tree.diameter(tree.root));
	}

}
