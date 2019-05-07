package com.practise.datastrucutre.dynamicProgramming;

public class EditDistanceUsingDynamicProgramming {

	public static void main(String[] args) {
		String st1 ="sunday";
		String st2 ="saturday";
		System.out.println(editDistance(st1,st2,st1.length(),st2.length()));
	}
	public static int min(int x,int y,int z)
	{
		if(x<=y && y<=z) return x;
		if(y<=x && y<=z) return y;
		else return z;
	}

	private static int editDistance(String st1, String st2, int m, int n) {
		
		int[][] dip = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0)
					dip[i][j]= j;
				else if(j==0)
					dip[i][j] =i;
				else if(st1.charAt(i-1) == st2.charAt(j-1))
				{
					dip[i][j] = dip[i-1][j-1];
				}
				else
				{
					dip[i][j] = 1+ min(dip[i][j-1], dip[i-1][j],dip[i-1][j-1]);
				}
			}
			
		}
		
		return dip[m][n];
	}
}
