package com.src.dynamicprogramming;

public class RegularExpression {
	public static void main(String[] args) {
		char[] txt="Tusha".toCharArray();
		char[] pat="Tushar*a*b*".toCharArray();
		System.out.println(findRegex(txt,pat));
	}
	public static boolean findRegex(char[] txt,char[] pat)
	{
		int m=txt.length;
		int n=pat.length;
		boolean[][] T= new boolean[m+1][n+1];
		T[0][0] = true;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(txt[i-1]==pat[j-1] || pat[j-1] =='.')
					T[i][j] = T[i-1][j-1];
				else if(pat[j-1] == '*')
				{
					T[i][j] = T[i][j-2];
					if(pat[j-2] ==txt[i-1] || pat[j-2]=='.')
					//if(pat[j-2] ==txt[i-1] )
						T[i][j] = T[i][j] || T[i-1][j];
				}
				else
					T[i][j] = false;
			}
		}
		return T[m][n];
	
	}

}
