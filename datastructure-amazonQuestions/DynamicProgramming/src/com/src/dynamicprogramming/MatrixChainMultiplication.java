package com.src.dynamicprogramming;

public class MatrixChainMultiplication {
	public static void main(String[] args) {
		 int arr[] = new int[] {1, 2, 3, 4}; 
	        int size = arr.length; 
	        System.out.println(maxChainOrdr(arr,size));
	}
	public static int maxChainOrdr(int[] a,int size)
	{
		int[][]	 m = new int[size][size];
		int i,j,k,l;
		for( i=0;i<size;i++)
			m[i][i] =0;
		
		for(l=2;l<size;l++)
		{
			for(i=1;i<size-l+1;i++)
			{
				j=i+l-1;
				if(j==size)
					continue;
				m[i][j] = Integer.MAX_VALUE;
				for(k=i;k<=j-1;k++)
				{
					int q = m[i][k]+m[k+1][j]+a[i-1]*a[k]*a[j];
					if(q<m[i][j])
						m[i][j] = q;
				}
			}
		}
		
		return m[1][size-1];
	}

}
