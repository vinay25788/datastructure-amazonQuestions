package com.src.practise.doubleLinkedList;

public class JoshpProblem {
	public static void main(String[] args) {
		int n=5;
		int k=2;
		int a[]= {8,4,12,1,9};
		int index=findWinner(n,k);
		System.out.println(index);
		
	}
	
	/*public static int findWinner(int n,int s)
	{
		if(n==1)
			return 1;
		else
		return (findWinner(n-1, s)+s-1)%n+1;
	}*/
	
	public static int findWinner(int n,int k)
	{
		if(n==0)
			return 0;
		else
			return (findWinner(n-1, k)+k)%n;
		
	}

}
