package com.src.datastructure.matrix;

public class MaximumSquareSubMatrix {

	public static void main(String[] args) {
		int M[][] = {{0, 1, 1, 0, 1},  
                {1, 1, 0, 1, 0},  
                {0, 1, 1, 1, 0}, 
                {1, 1, 1, 1, 0}, 
                {1, 1, 1, 1, 1}, 
                {0, 0, 0, 0, 0}}; 
		maxSquareSubMat(M);
	}
	public static void maxSquareSubMat(int[][] m)
	{
		int i=0,j=0;
		int R= m.length;
		int C = m[0].length;
		int[][] sub = new int[R][C];
		for( i=0;i<R;i++)
			sub[i][0] = m[i][0];
		for(j=0;j<C;j++)
			sub[0][j]=m[0][j];
		for(i=1;i<R;i++)
		{
			for(j=1;j<C;j++)
			{
				if(m[i][j]==1)
					sub[i][j] = Math.min(sub[i][j-1], Math.min(sub[i-1][j], sub[i-1][j-1]))+1;
				else
					sub[i][j] = 0;
			}
		}
		
		int max_val=sub[0][0];
		int max_i=0;
		int max_j=0;
		for( i=0;i<R;i++)
		{
			for( j=0;j<C;j++)
			{
				if(sub[i][j]>max_val)
				{
					max_val = sub[i][j];
					max_i=i;
					max_j=j;
				}
			}
		}
		
		for(i=max_i;i>max_i-max_val;i--)
		{
			for(j=max_j;j>max_j-max_val;j--)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}













