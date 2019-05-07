package src.stringquestion.copystring.customTreadpool;

import java.util.Stack;

public class CheckBstFromGivenPreOrder {
	public static void main(String[] args) {
		int[] pre1 = new int[]{5,3,12,4,8}; 
		System.out.println(check(pre1));
	}
	public static boolean check(int[] pre)
	{
		int root = Integer.MIN_VALUE;
		int n = pre.length;
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<n;i++)
		{
			if(root>pre[i])
			{
				return false;
			}
			while(st.isEmpty() == false && st.peek()<pre[i])
			{
					root = st.pop();
			}
			st.push(pre[i]);
		}
		return true;
	}

}
