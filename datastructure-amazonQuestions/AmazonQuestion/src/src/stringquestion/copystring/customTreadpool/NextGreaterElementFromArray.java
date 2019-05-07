package src.stringquestion.copystring.customTreadpool;

import java.util.Stack;

public class NextGreaterElementFromArray {
	public static void main(String[] args) {
		int[] a= {11,13,21,1,3,5,22};
		//next(a);
		//secondApproach(a);
		char[] ch = {'v','i','n','a','y'};
		String v= String.valueOf(ch);
		System.out.println(v);
	}
	public static void secondApproach(int[] a)
	{
		Stack<Integer> st= new Stack<>();
		st.push(a[0]);
		int next=0,element =0;
		for(int i=1;i<a.length;i++)
		{
			next = a[i];
			if(st.isEmpty() == false)
			{
				element = st.pop();
				while(element <next )
				{
					System.out.println(element+"------------ "+next );
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
			System.out.println(st.pop()+" -------- -1");
		}
	}
	public static void next(int[] a)
	{
		Stack<Integer> st = new Stack<>();
		st.push(a[0]);
		for(int i=1;i<a.length;i++)
		{
			while(st.isEmpty() == false && st.peek()<a[i])
			{
				System.out.println(st.peek()+"----"+a[i]);
				st.pop();
			}
			st.push(a[i]);
		}
		while(st.isEmpty() == false)
		{
			System.out.println(st.pop()+"---"+" -1");
		}
	}

}
