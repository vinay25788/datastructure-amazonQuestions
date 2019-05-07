package com.practise.binaryTree;

public class PermutationOfPerenthesis {
	
	public static void main(String[] args) {
		int n=3;
		PermutationOfPerenthesis obj = new PermutationOfPerenthesis();
		char[] ch = new char[2*n];
		obj.printPermutation(n,ch);
	}
	public void printPermutation(int n,char[] ch)
	{
		if(n>0)
		printUtil(n,ch,0,0,0);
		return;
	}
	public void printUtil(int n,char[] ch,int open,int close,int pos )
	{
		if(close == n)
		{
			for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]);
			}
			System.out.println();
			return;
		}
		else
		{
			if(open>close)
			{
				ch[pos]= '}';
				printUtil(n, ch, open, close+1, pos+1);
			}
			 if(open<n)
			{
				ch[pos] ='{';
				printUtil(n, ch, open+1, close, pos+1);
			}
		}
	}

}
