package com.practise.stack;

import java.util.Stack;

public class LargestRectangularArea {

	public void getMaxArea(int his[])
	{
		Stack<Integer> st = new Stack<>();
		int i=0;
		int max_area=Integer.MIN_VALUE,area_wth_top=0;
		
		while(i<his.length)
		{
			if(st.isEmpty() == true || his[st.peek()] <= his[i])
				st.push(i++);
			else
			{
				int top = st.peek();
				st.pop();
				area_wth_top = his[top]*(st.isEmpty()?i:i-st.peek()-1);
				
				if(max_area < area_wth_top)
					max_area = area_wth_top;
			}
		}
		
		while(st.isEmpty() == false)
		{
			int top = st.peek();
			st.pop();
			area_wth_top = his[top]*(st.isEmpty()?i:i-st.peek()-1);
			
			if(max_area < area_wth_top)
				max_area = area_wth_top;
		}
		
		System.out.println(" maximum area "+max_area);
	}
	public static void main(String[] args) {
		  int hist[] = { 6, 2, 5, 4, 5, 1, 6 }; 
		  LargestRectangularArea obj = new LargestRectangularArea();
		  obj.getMaxArea(hist);
	}
}
