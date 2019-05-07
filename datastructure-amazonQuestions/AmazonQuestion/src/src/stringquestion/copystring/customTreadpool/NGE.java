package src.stringquestion.copystring.customTreadpool;

import java.util.Stack;

public class NGE {
	public static void main(String[] args) {
		int[] arr= {11,13,21,1,2,3,4,24,22};
		nextGE(arr);
	}
	
	public static void nextGE(int[] a)
	{
		Stack<Integer> st =new Stack<>();
		st.push(a[0]);
		int i=1;
		for( i=1;i<a.length;i++)
		{
			int next = a[i];
			if(st.isEmpty()== false)
			{
				int pop = st.pop();
				while( pop< next)
				{
					System.out.println(pop+"-"+next);
					if(st.isEmpty()== true)
						break;
					pop = st.pop();
				}
				if(pop>next)
					st.push(pop);
			}
			st.push(next);
		}
		while(st.isEmpty()== false)
			System.out.println(st.pop()+"-"+"-1");
	}

}
