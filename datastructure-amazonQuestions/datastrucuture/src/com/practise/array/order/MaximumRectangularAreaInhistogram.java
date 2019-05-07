package com.practise.array.order;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;

public class MaximumRectangularAreaInhistogram {
	public static void main(String[] args) {
		
		HashMap<Integer,String	> map ;
		Hashtable<String,String> table;
		Collections.synchronizedMap(m)
		Collection<Integer> c;
		int a[]= {6, 2, 5, 4, 5, 1, 6};
		int b[]= {2,1,2,3,1};
		maxArea(b);
	}
	
	public static void maxArea(int[] a)
	{
		Stack<Integer> st = new Stack<>();
		//st.push(0);
		int max=0;
		int i=0;
		while(i<a.length)
		{
			if(st.isEmpty()== true || a[st.peek()]<= a[i])
				st.push(i++);
			else
			{
				int tp = st.pop();
				int area=a[tp]*(st.isEmpty() == true?i:i-st.peek()-1);
				if(max<area)
					max = area;
			}
		}
		while(st.isEmpty()== false)
		{
			int tp = st.pop();
			int area=a[tp]*(st.isEmpty() == true?i:i-st.peek()-1);
			if(max<area)
				max = area;
		}
		System.out.println(max);
	}

}
