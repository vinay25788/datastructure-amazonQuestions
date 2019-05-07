package src.stringquestion.copystring.customTreadpool;

import java.util.Stack;

public class NextGreaterElement {
	public static void main(String[] args) {
		int[] a= {11,13,21,1,2,3,4,24,22};
		nextGreater(a);
	}
	
	public static void nextGreater(int[] a)
	{
		Stack<Integer> st = new Stack<>();
		int next=0,element=0;
		st.push(a[0]);
		for(int i=1;i<a.length;i++)
		{
			next = a[i];
			
			if(st.isEmpty() == false)
			{
				element = st.pop();
				while(element<next)
				{
					System.out.println(element +"--" +next);
					if(st.isEmpty() == true)
						break;
					element = st.pop();
				}
				if(element>next)
					st.push(element);
			}
			st.push(next);
		}
		
		while(st.isEmpty() == false)
		{
			 element = st.pop();
			System.out.println(element +" --"+ "-1");
		}
	}
}
