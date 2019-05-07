package com.practise.tree;

public class TestAbc {

	public static void main(String[] args) {
		int[]a = {1 ,2 ,3 ,4 ,5, 5, 2, 4, 4};
		System.out.println(find(a));
	}
	public static int find(int[] a)
	{
		int n=a.length;
		int leftSum=0,rightSum=0;
		for(int i=0;i<n;i++)
		{
			rightSum +=a[i];
		}
		
		for(int i=0;i<n;i++)
		{
			rightSum-=a[i];
			leftSum +=a[i];
			if(leftSum == rightSum)
			{
				return a[i];
			}
				
		}
		return -1;
	}
}
