package src.stringquestion.copystring.customTreadpool;

import java.util.HashSet;
import java.util.Set;

public class WordBreakProblemUsingDP {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("i");
		set.add("like");
		set.add("vinay");
		String st="ilikevinay";
		boolean result = breakWordProblem(st,set);
		System.out.println(result);
	}
	public static boolean breakWordProblem(String st,Set<String> set)
	{
		boolean[][] t = new boolean[st.length()][st.length()];
		for(int i=0;i<st.length();i++)
			for(int j=0;j<st.length();j++)
				t[i][j] = false;
		
		int n= st.length();
		for(int l=1;l<=st.length();l++)
		{
			for(int i=0;i<n-l+1	;i++)
			{
				int j=l+i-1;
				String sub = st.substring(i, j+1);
				if(set.contains(sub)) {
					t[i][j] = true;
					continue;
				}
				
				// if sub is not present then we can have another k variable i to k-1 and k to j shoulb be present
					for(int k=i+1;k<=j;k++)
					{
						if(t[i][k-1] == true && t[k][j] == true)
							t[i][j] = true;
					}
			}
		}
		
		
		return t[0][n-1];
	}

}
