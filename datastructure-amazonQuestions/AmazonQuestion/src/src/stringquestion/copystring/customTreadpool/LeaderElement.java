package src.stringquestion.copystring.customTreadpool;

import java.util.Stack;

public class LeaderElement {

	public static void main(String[] args) {
		int[] a={16, 17, 4, 3, 5, 2};
		find(a);
	}
	public static void find(int[] a)
	{
		int max =a[a.length-1];
		Stack<Integer> st = new Stack<>();
		st.push(max);
		for(int i=a.length-2;i>=0;i--)
		{
			int num = a[i];
			if(num>max)
			{
				max = num;
				st.push(num);
			}
			
		}
		while(st.isEmpty() ==false)
			System.out.println(st.pop());
	}
}
