package com.practise.array.matrix;

public class MatrixInSpiralForm {
	public static void main(String[] args) {
		 int R = 3; 
	        int C = 6; 
	        int a[][] = { {1,  2,  3,  4,  5,  6}, 
	                      {7,  8,  9,  10, 11, 12}, 
	                      {13, 14, 15, 16, 17, 18} 
	                    }; 
	        spiralPrint(R,C,a); 
	}
	
	public static void spiralPrint(int row,int col,int[][] a)
	{
		int i,r=0,c=0;
		while(r<row && c<col)
		{
			for(i=c;i<col;i++)
			{
				System.out.print(" "+a[r][i]);
			}
			r++;
			
			for(i=r;i<row;i++)
			{
				System.out.print(" "+a[i][col-1]);
			}
			col--;
			if(r<row)
			{
				for(i=col-1;i>=c;i--)
					System.out.print(" "+a[row-1][i] );
				
				row--;
				
				for(i=row-1;i>=r;i--)
					System.out.print(" "+a[i][c]);
				c++;
			}
			
		}
	}
}
