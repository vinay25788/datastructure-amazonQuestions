package com.src.datastructure.matrix;

public class MinimupJumpToreachEndUsingDynamicProgramming {

	public static void main(String[] args) {
		int arr[] = {1, 3, 6, 1, 0, 9}; 
		minJum(arr);
	}
	public static void minJum(int[] a)
	{
		int jumps[]= new int[a.length];
		jumps[0] = 0;
		if(a.length == 0|| a[0] == 0)
		{
			System.out.println(" not possible ");
			return;
		}
		for(int i=1;i<a.length;i++)
		{
			jumps[i] = Integer.MAX_VALUE;
			for(int j=0;j<i;j++)
			{
				if(i<=j+a[j] && jumps[j] != Integer.MAX_VALUE)
				{
					jumps[i] = Math.min(jumps[i], jumps[j]+1);
					break;
				}
			}
		}
		System.out.println(jumps[a.length-1]);
	}
}
