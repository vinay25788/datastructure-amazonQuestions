package com.src.dynamicprogramming;

import java.util.Stack;

public class Histogram2 {
	public static void main(String args[])
	{
		int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
		System.out.println(findArea(hist));
	}
	
	public static int findArea(int[] a)
	{
		Stack<Integer> st = new Stack<>();
		int i=0;
		int area=0,maxArea=0;
		while(i<a.length)
		{
			if(st.isEmpty() == true || a[st.peek()]<=a[i])
				st.push(i++);
			else
			{
				int tp = st.pop();
				area = a[tp]*(st.isEmpty()?i:i-st.peek()-1);
				if(area>maxArea)
				{
					maxArea = area;
				}
			}
				
		}while (st.empty() == false) 
		{ 
			int tp = st.peek(); 
			st.pop(); 
			area = a[tp] * (st.empty() ? i : i - st.peek() - 1); 
	
			if (maxArea < area) 
				maxArea = area; 
		} 
		return maxArea;
	}

}
