package com.src.datastructure.matrix;

public class PrintKthElementInSpiralMatrix {
	public static void main(String[] args) {
		int[][] mat = {{1, 2, 3, 4, 5, 6}, 
                {7, 8, 9, 10, 11, 12}, 
                {13, 14, 15, 16, 17, 18}}; 
		int k=17;
		find(mat,3,6,k);
	}
	
	public static void find(int[][] mat,int n,int m,int k)
	{
		if(n<0 || m<0)
			{
			System.out.println(" not found ");
			}
		if(k<m)
		{
			System.out.println(mat[0][k-1]);
		}
		if(k<(n+m)-1)
		{
			System.out.println(mat[k-m][m-1]);
		}
		if(k<(m+n -1+m-1))
		{
			System.out.println(mat[n-1][m-1-(k-(m+n-1))]);
		}
		
		if(k<(m+n-1+m-1+n-2))
		{
			System.out.println(mat[n-1-(k-(m+n-1+m-1	))][0]);
		}
		find(mat, n-2, m-2, k);
	}

}
