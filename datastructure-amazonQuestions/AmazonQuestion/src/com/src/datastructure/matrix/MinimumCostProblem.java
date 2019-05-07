package com.src.datastructure.matrix;

public class MinimumCostProblem {

	public static void main(String[] args) {
		int cost[][] = { 	
							{1, 2, 3}, 
                			{4, 8, 2}, 
                			{1, 5, 3} 
                		}; 
		
		System.out.println(minCost(cost,2,2,0));
		System.out.println("using DP, -->"+minCost(cost));
	}
	public static int min(int x,int y,int z)
	{
		if(x<y && x<z)
			return x;
		if(y<z && y<x)
			return y;
		
			return z;
	}
	public static int minCost(int[][] cost,int row,int col,int min)
	{
		if(row<0 || col<0)
			return Integer.MAX_VALUE;
		if(row == 0 && col==0)
			return cost[row][col];
		return cost[row][col]+ min(minCost(cost, row, col-1, min),minCost(cost, row-1, col-1, min),minCost(cost, row-1, col, min));
		
	}
	
		public static int minCost(int[][] cost)
		{
			int row = cost.length;
			int col = cost[0].length;
			int[][] tc = new int[row][col];
			tc[0][0] = cost[0][0];
			for(int i=1;i<row;i++)
				tc[i][0] = tc[i-1][0]+cost[i][0];
			for(int i=1;i<col;i++)
				tc[0][i] = tc[0	][i-1]+cost[0][i];
			
			for(int i=1;i<row;i++)
			{
				for(int j=1;j<col;j++)
				{
					tc[i][j] = min(tc[i-1][j],tc[i][j-1],tc[i-1][j-1])+cost[i][j];
				}
			}
			
			return tc[row-1][col-1];
		}
}





















