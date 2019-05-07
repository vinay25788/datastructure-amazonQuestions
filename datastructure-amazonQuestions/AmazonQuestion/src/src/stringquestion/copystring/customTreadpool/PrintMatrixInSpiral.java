package src.stringquestion.copystring.customTreadpool;

public class PrintMatrixInSpiral {
	public static void main(String[] args) {
		 int a[][] = { {1,  2,  3,  4,  5,  6}, 
                 {7,  8,  9,  10, 11, 12}, 
                 {13, 14, 15, 16, 17, 18} 
               }; 
		printSpiral(a);
	}
	public static void printSpiral(int[][] a)
	{
		int R = a.length;
		int C = a[0].length;
		int r=0,c=0,i=0;
		
		while(r<R && c<C)
		{
			for( i=c;i<C;i++)
				System.out.print(a[r][i]+" ");
			r++;
			for(i=r;i<R;i++)
			{
				System.out.print(a[i][C-1]+" ");
			}
			C--;
			if(r<R) {
			for(i=C-1;i>=c;i--)
			{
				System.out.print(a[R-1][i]+ " ");
				
			}
			R--;
			
			for(i=R-1;i>=r;i--)
			{
				System.out.print(a[i][c]	+" ");
			}
			c++;
		}
		}
	}

}
