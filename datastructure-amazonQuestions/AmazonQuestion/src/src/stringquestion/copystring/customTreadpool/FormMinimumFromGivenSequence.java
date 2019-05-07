package src.stringquestion.copystring.customTreadpool;

import java.util.Stack;

public class FormMinimumFromGivenSequence {
	public static void main(String[] args) {
		String st="IDID";
		formSeq(st);
	}
	public static void formSeq(String seq)
	{
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<=seq.length();i++)
		{
			st.push(i+1);
			if(i==seq.length() || seq.charAt(i) == 'I')
			{
				while(!st.isEmpty())
				System.out.print(" "+st.pop());
			}
		}
	}

}
