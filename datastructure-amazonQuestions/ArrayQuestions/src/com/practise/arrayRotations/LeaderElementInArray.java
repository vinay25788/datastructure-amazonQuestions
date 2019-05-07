package com.practise.arrayRotations;

import java.util.Stack;

public class LeaderElementInArray {
	public static void main(String[] args) {
		int a[]={16, 17, 4, 3, 5, 2};
		findLeader(a);
	}
	public static void findLeader(int[] a)
	{
		int max=a[a.length-1];
		Stack<Integer> st = new Stack<>();
		st.push(max);
		for(int i=a.length-2;i>=0;i--)
		{
			if(max<a[i])
				{
					st.push(a[i]);
					max = a[i];
				}
			
		}
		while(st.isEmpty() == false)	
			System.out.print(" " +st.pop());
	}

}
