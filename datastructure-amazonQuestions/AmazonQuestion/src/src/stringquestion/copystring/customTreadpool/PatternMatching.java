package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class PatternMatching {
	public static void main(String[] args) {
		String str = "baaabab"; 
        String pattern = "*****ba*****ab"; 
        System.out.println(patternMatch(str,pattern,str.length(),pattern.length()));
	}

	public static boolean patternMatch(String str,String pat,int n,int m)
	{
		if(m==0)
			return n==0;
		boolean[][] t = new boolean[n+1][m+1];
		for(int i=0;i<n+1;i++)
		{
			Arrays.fill(t[i],false);
		}
		t[0][0] = true;
		for(int j=1;j<=m;j++)
		{
			if(pat.charAt(j-1) =='*')
				t[0][j] = t[0][j-1]; 
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(pat.charAt(j-1) =='*')
					t[i][j] = t[i][j-1] || t[i-1][j];
				else if ((pat.charAt(j-1) == '?') || str.charAt(i-1)== pat.charAt(j-1))
					t[i][j] = t[i-1][j-1];
				else
					t[i][j] = false;
			}
		}
		
		return t[n][m];
	}
}
