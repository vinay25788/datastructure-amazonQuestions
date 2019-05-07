package com.src.datastructure.matrix;

public class MinCostFromGivenSourceToDestination {
public static void main(String[] args) {
	int cost[][] = { {1, 2, 3}, 
            {4, 8, 2}, 
            {1, 5, 3} }; 
              
	System.out.println(minCost(cost,2,2,0));
}

public static int min(int x,int y,int z)
{
	if(x<y && x<z)
		return x;
	if(y<x && y<z)
		return y;
	return z;
}

public static int minCost(int[][] cost,int row,int col,int minCost)
{
	if(row<0 || col<0)
		return Integer.MAX_VALUE;
	if(row==0 && col== 0)
	{
		return cost[row][col];
	}
	
	return   cost[row][col]+min(minCost(cost, row, col-1, minCost) , minCost(cost, row-1, col-1, minCost), minCost(cost, row-1, col, minCost));
	
}

}
