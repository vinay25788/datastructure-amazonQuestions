package com.practise.binaryTree.summation;


class Int
{
	int value;
	Int(int val)
	{
		this.value = val;
	}
}
public class CountSubtreeWithGivenValues {
	
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
			this.right = null;
		}
	}
	
	public int countSubtreeWithSumXutil(Node root,int x)
	{
		if(root == null)
			return 0;
		
		Int count = new Int(0);
		
		int ls = countSubtreeWithSumX(root.left,count,x	);
		int rs = countSubtreeWithSumX(root.right,count,x);
		if(ls+rs+root.data == x)
			count.value++;
		
		return count.value;
	}
	
	public int countSubtreeWithSumX(Node root,Int count,int sum)
	{
		if(root == null)
			return 0;
		
		int ls = countSubtreeWithSumX(root.left,count,sum);
		int rs = countSubtreeWithSumX(root.right,count,sum);
		int allSum=ls+rs+root.data; 
		if( allSum== sum)
			count.value++;
		return allSum;
				
	}
	
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right =  new Node(3);
		root.left.left =  new Node(4);
		root.left.right=  new Node(5);
		root.left.left.left =  new Node(1);
		CountSubtreeWithGivenValues obj = new CountSubtreeWithGivenValues();
		System.out.println("count of Subtree with "+obj.countSubtreeWithSumXutil(root, 8));
	}

}
