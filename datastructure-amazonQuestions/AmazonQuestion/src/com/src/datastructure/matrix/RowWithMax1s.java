package com.src.datastructure.matrix;

public class RowWithMax1s {
	public static void main(String[] args) {
		int mat[][] = { { 0, 0, 0, 1 }, 
                { 0, 1, 1, 1 }, 
                { 1, 1, 1, 1 }, 
                { 0, 0, 0, 0 } }; 
System.out.println("Index of row with maximum 1s is "
                                    + rowWithMax1s(mat)); 
	}
	
	public static int rowWithMax1s(int[][] mat)
	{
		int row_index=0,index=-1;
		int max=Integer.MIN_VALUE;
		int row = mat.length;
		int col = mat[0].length;
		for(int i=0;i<row;i++)
		{
			index = first(mat[i],0,col-1);
			if(index !=-1 && col-index>max)
			{
				max = col-index;
				row_index = i;
			}
		}
		return row_index;
	}
	
	public static int first(int[] a,int low,int high)
	{
		if(low>high)
		{
			return -1;
		}
		int mid = low+(high-low)/2;
		if(mid==0 ||  a[mid-1] ==0 && a[mid] ==1)
			return mid;
		if(a[mid] == 0)
			return first(a, mid+1, high);
		else
			return first(a, low, mid-1);
	}
	
}















