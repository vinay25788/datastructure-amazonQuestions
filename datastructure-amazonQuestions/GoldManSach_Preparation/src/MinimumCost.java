
public class MinimumCost {
	public static void main(String[] args) {
		int[][] mat= {{ 10,12,2},
				{4,2,10},
				{5,2,11}
		};
		System.out.println(findMin(mat,0,0));
	}
	public static int min(int x,int y,int z)
	{
		if(x<y && x<z)
			return x;
		else if(y<z && y<x)
			return y;
		 
			return z;
	}
	public static int findMin(int[][] mat,int row,int col)
	{
		if(row>2 || col>2)
		{
			return Integer.MAX_VALUE;
		}
		else if(row == 2 && col==2)
			return mat[row][col];
		else
		return min(findMin(mat, row+1, col),findMin(mat, row, col+1),findMin(mat, row+1, col+1))+mat[row][col];
	}

}
