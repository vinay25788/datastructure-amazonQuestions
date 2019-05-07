package com.src.datastructure.matrix;

public class MinCostUsingDP {
	public static void main(String[] args) {
		 int cost[][]= {{1, 2, 3}, 
                 {4, 8, 2}, 
                 {1, 5, 3}}; 
  System.out.println(minCost(cost,2,2)); 
	}
	public static int min(int x,int y,int z)
	{
		if(x<y&& x<z)
			return x;
		if(y<z && y<x)
			return y;
		return z;
	}
	public static int minCost(int[][] cost,int R,int C)
	{
		int[][] tc= new int[R+1][C+1];
		tc[0][0]= cost[0][0];
		for(int i=1;i<=R;i++)
			tc[i][0] = tc[i-1][0]+cost[i][0];
		for(int j=1;j<=C;j++)
			tc[0][j] = tc[0][j-1]+cost[0][j];
		
		for(int i=1;i<=R;i++)
		{
			for(int j=1;j<=C;j++)
			{
				tc[i][j] = min(tc[i-1][j],tc[i][j-1],tc[i-1][j-1])+cost[i][j]; 
			}
		}
		
		return tc[R][C];
	}

}
