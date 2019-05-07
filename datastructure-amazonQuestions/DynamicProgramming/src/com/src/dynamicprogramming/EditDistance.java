package com.src.dynamicprogramming;

public class EditDistance {

	public static void main(String[] args) {
		String a="abcdef";
		String b="azced";
		System.out.println(editDistance(a,b));
	}
	
	public static int min(int x,int y,int z)
	{
		if(x<y && x<z)
			return x;
		if(y<x && y<z)
			return y;
		return z;
	}
	
	public static int editDistance(String a,String b)
	{
		int[][] edit = new int[b.length()+1][a.length()+1];
		for(int i=0;i<=b.length();i++)
			edit[i][0]=i;
		for(int i=0;i<=a.length();i++)
			edit[0][i] =i;
		for(int i=1;i<=b.length();i++)
		{
			for(int j=1;j<=a.length();j++)
			{
				if(b.charAt(i-1) == a.charAt(j-1))
				{
					edit[i][j] = edit[i-1][j-1];
				}
				else
				{
					edit[i][j] = min(edit[i-1][j-1],edit[i][j-1],edit[i-1][j])+1; 
				}
			}
		}
		
		return edit[b.length()][a.length()];
	}
}

