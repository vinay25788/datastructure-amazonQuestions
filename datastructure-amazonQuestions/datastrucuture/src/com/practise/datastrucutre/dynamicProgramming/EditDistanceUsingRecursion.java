package com.practise.datastrucutre.dynamicProgramming;

public class EditDistanceUsingRecursion {

	public static void main(String[] args) {
		String st1 = "sunday";
		String st2 ="saturday";
		System.out.println(editDistance(st1,st2,st1.length(),st2.length()));
	}
	
	public static int min(int x,int y,int z)
	{
		if(x<=y && y<=z) return x;
		if(y<=x && y<=z) return y;
		else return z;
	}
	public static int editDistance(String st1,String st2,int m,int n)
	{
		if(m == 0)
			return n;
		if(n ==0 )
			return m;
		if(st1.charAt(m-1) == st2.charAt(n-1))
			return editDistance(st1, st2, m-1, n-1);
		
		return 1+min(editDistance(st1, st2, m, n-1),
					 editDistance(st1, st2, m-1	, n),
					 editDistance(st1, st2, m-1, n-1)
				);
	}
}
