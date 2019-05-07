package com.src.datastructure.matrix;

public class MaximumSumInMatrix {
	public static void main(String[] args) {
		int mat[][] = { { 10, 10, 2, 0, 20, 4 }, 
                { 1, 0, 0, 30, 2, 5 }, 
                { 0, 10, 4, 0, 2, 0 }, 
                { 1, 0, 2, 20, 0, 4 }  
            }; 
		
		 maxSumInMat(mat,4,6);
		
		}
	public static int max(int x,int y,int z)
	{
		if(x>y && x>z)
			return x;
		if(y>z && y>x)
			return y;
		return z;
	}
	public static void maxSumInMat(int[][] mat,int row,int col)
	{
		int res=0;
		for(int i=0;i<col;i++)
		{
			res = Math.max(res, mat[0][i]);
		}
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j>0 && j<col-1)
					mat[i][j] += max(mat[i-1][j], mat[i-1][j-1],mat[i-1][j+1]);
				else if(j>0)
					mat[i][j] += Math.max(mat[i-1][j], mat[i-1][j-1]);
				else if(j<col-1)
					mat[i][j] += Math.max(mat[i-1][j], mat[i-1][j+1]);
				if(res<mat[i][j])
					res = mat[i][j];
			}
			
		}
		System.out.println(res);
	}
}
