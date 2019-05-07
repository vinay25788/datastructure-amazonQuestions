package com.practise.arrayRotations;

public class DuplicateFrom2Darray {
	public static void main(String[] args) {
		
		int a = Integer.valueOf(5);
		
		int[][] a =
			{
					{1,2,1,2},
					{2,3,7,5},
					{3,8,9,1}
						
					
			};
		
		for(int k=0;k<3*4;k++)
		{
			int data = a[k/4][k%4];
			for(int l=k+1;l<3*4;l++)
			{
				int data2 = a[l/4][l%4];
				if(data == data2)
				{
					a[l/4][l%4] =0;
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
