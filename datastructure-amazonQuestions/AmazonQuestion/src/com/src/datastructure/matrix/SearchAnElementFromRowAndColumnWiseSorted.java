package com.src.datastructure.matrix;

public class SearchAnElementFromRowAndColumnWiseSorted {
	public static void main(String[] args) {
		 int mat[][] = { {10, 20, 30, 40}, 
                 {15, 25, 35, 45}, 
                 {27, 29, 37, 48}, 
                 {32, 33, 39, 50} }; 
       
 search(mat, 4, 29); 
	}
	
	public static void search(int[][] mat,int size,int x)
	{
		int i=0,j=size-1;
		while(i<size && j>=0)
		{
			if(mat[i][j] == x)
			{
				System.out.println(" found at row "+i+" col "+j );
				break;
			}
			if(mat[i][j]>x)
				j--;
			else
				i++;
		}
	}
}
