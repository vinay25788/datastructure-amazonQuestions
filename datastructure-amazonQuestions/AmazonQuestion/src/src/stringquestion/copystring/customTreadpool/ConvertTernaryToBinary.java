package src.stringquestion.copystring.customTreadpool;

public class ConvertTernaryToBinary {
	
	static class BinaryTree
	{
		String data;
		BinaryTree left;
		BinaryTree right;
		BinaryTree(String data)
		{
			this.data = data;
			this.left = null;
					this.right = right;
		}
		BinaryTree()
		{
			
		}
		
	}
	public static BinaryTree convert(String exp,int i)
	{
		if(i>=exp.length())
			return null;
		BinaryTree root = new BinaryTree(""+exp.charAt(i));
		i++;
		if(i<exp.length() && exp.charAt(i) == '?')
			root.left = convert(exp, i+1);
		else if(i<exp.length())
			root.right = convert(exp,i+1);
		return root;
		
	}
	public static void inorder(BinaryTree bt)
	{
		if(bt!=null)
		{
			inorder(bt.left);
			System.out.print( bt.data);
			inorder(bt.right);
		}
	}
	public static void main(String[] args) {
		String st="a?b?c:d:e";
		BinaryTree bt = new BinaryTree();
		BinaryTree root = convert(st, 0);
		inorder(root);
	}

}
