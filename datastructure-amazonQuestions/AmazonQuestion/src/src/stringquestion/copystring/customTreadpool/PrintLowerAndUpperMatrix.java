package src.stringquestion.copystring.customTreadpool;

public class PrintLowerAndUpperMatrix {
	public static void main(String[] args) {
		  int mat[][] = {{1, 2, 3},  
                  {4, 5, 6},  
                  {7, 8, 9}}; 
		  
		  System.out.println("print lower " );
		  lower(mat,mat.length,mat[0].length);
		  System.out.println("print Upper " );
		  upper(mat,mat.length,mat[0].length);
	}
	
	public static void lower(int[][] mat,int R,int C)
	{
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
				if(i<j)
				{
					System.out.print("0" +" ");
				}
				else
					System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void upper(int[][] mat,int R,int C)
	{
		for(int i=0;i<R;i++)
		{
			for(int j=0;j<C;j++)
			{
				if(i>j)
				{
					System.out.print("0" +" ");
				}
				else
					System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
