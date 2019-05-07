package com.practise.stack;

import java.util.Stack;

public class NextGreateElementInStack {
	
	Stack<Integer> st = new Stack<>();
	
	public void findNextGE(int[] a)
	{
		int n= a.length;
		int element=0,next =0;
		st.push(a[0]);
		
		for(int i=1;i<n;i++)
		{
			next = a[i];
			
			if(st.isEmpty() == false)
			{
				element = st.pop();
				while( element < next)
				{
					System.out.println(element +"<--->"+next);
					if(st.isEmpty() == true)
						break;
					element = st.pop();
				}
				
				if(element > next)
				st.push(element);
			}
			st.push(next);
			
		}
		
		while(st.isEmpty() == false)
		{
			System.out.println(st.pop() +"<----->"+-1);
		}
	}
	
	public static void main(String[] args) {
		int a[]= {11, 13, 21, 3}; 
		NextGreateElementInStack obj = new NextGreateElementInStack();
		obj.findNextGE(a);
		
	}

}
