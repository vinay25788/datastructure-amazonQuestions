package src.com.amazon.frequentyAsked.questions;

import java.util.Stack;

public class MinimumElementFromStack {
	
	static Stack<Integer> st = new Stack<>();
	static int minElement;

	public static void main(String[] args) {
		int a[]	= {3,2,1,5,7};
		//for(int i=0;i<a.length;i++)
			push(a);
			System.out.println("stack");
			System.out.println(st);
			System.out.println(" stack end");
			for(int i=0;i<a.length;i++)
				System.out.println(findMin());
		
	}
	
	public static void push(int[] a)
	{
		minElement = a[0];
		st.push(minElement);
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<minElement)
			{
				int x= 2*a[i]-minElement;
				minElement = a[i];
				st.push(x);
				
			}
			else
			{
				st.push(minElement);
			}
		}
	}
	public static int findMin()
	{
		int min = 0;
		if(st.isEmpty() == false)
		{
			int x = st.pop();
		
			if(x<minElement)
			{
				min = minElement;
				minElement = 2*minElement -x;
				 
			}
			else
				min= x;
		}
		return min;
	}
	
}
