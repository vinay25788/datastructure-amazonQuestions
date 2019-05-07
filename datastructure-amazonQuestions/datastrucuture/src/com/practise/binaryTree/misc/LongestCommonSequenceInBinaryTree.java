package com.practise.binaryTree.misc;


class Length
{
	int length;
}
public class LongestCommonSequenceInBinaryTree {

	Node root;
	
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
	
	public int longestSequence(Node root)
	{
		if(root == null)
			return 0;
		int res;
		
		Length len = new Length();
		longestSequenceUtil(root,0,root.data,len);
		return len.length;
	}
	
	public void longestSequenceUtil(Node root, int curLength,int expected, Length len)
	{
		if(root == null)
			return ;
		
		if(root.data == expected)
			curLength++;
		else
			curLength =1;
		
		int max = Math.max(curLength, len.length);
		len.length = max;
		longestSequenceUtil(root.left, curLength, expected+1, len);
		longestSequenceUtil(root.right, curLength, expected+1, len);
		//return len.length;
	}
	
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(22); 
        root.left.left = new Node(3); 
        root.left.left.left = new Node(4);
        root.left.left.left.left = new Node(5); 
        root.left.right = new Node(5); 
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.left = new Node(4); 
        root.right.right = new Node(25);
        
        LongestCommonSequenceInBinaryTree obj = new LongestCommonSequenceInBinaryTree();
       System.out.println("length of longest common sequence in tree----->"+ obj.longestSequence(root));
	}
}