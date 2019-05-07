package com.practise.binaryTree.lowestCommonAncestor;


public class LowestCommonAncestor {
Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right =null;
		}
	}

	
	Node findLCA(Node root,int d1,int d2)
	{
		if(root == null)
			return null;
		if(root.data == d1 || root.data == d2)
			return root;
		Node lca=findLCA(root.left, d1, d2);
		Node rca = findLCA(root.right, d1, d2);
		
		if(lca !=null && rca !=null)
			return root;
		return lca==null ?rca:lca;
		
	}
	  Node lca(Node node, int n1, int n2)  
	    { 
	        if (node == null) 
	            return null; 
	   
	        // If both n1 and n2 are smaller than root, then LCA lies in left 
	        if (node.data > n1 && node.data > n2) 
	            return lca(node.left, n1, n2); 
	   
	        // If both n1 and n2 are greater than root, then LCA lies in right 
	        if (node.data < n1 && node.data < n2)  
	            return lca(node.right, n1, n2); 
	   
	        return node; 
	    } 
	
	public static void main(String[] args) {
		LowestCommonAncestor obj = new LowestCommonAncestor();
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        System.out.println("LCA(4, 5) = " + 
                            obj.findLCA(root,4, 5).data); 
        System.out.println("LCA(4, 6) = " + 
                            obj.findLCA(root,4, 6).data); 
        System.out.println("LCA(3, 4) = " + 
                            obj.findLCA(root,3, 4).data); 
        System.out.println("LCA(2, 4) = " + 
                            obj.findLCA(root,2, 4).data); 
        
       /* System.out.println("***************");
        System.out.println("LCA(4, 5) = " + 
                obj.lca(root,4, 5).data); 
System.out.println("LCA(4, 6) = " + 
                obj.lca(root,4, 6).data); 
System.out.println("LCA(3, 4) = " + 
                obj.lca(root,3, 4).data); 
System.out.println("LCA(2, 4) = " + 
                obj.lca(root,2, 4).data); */
	}

}
