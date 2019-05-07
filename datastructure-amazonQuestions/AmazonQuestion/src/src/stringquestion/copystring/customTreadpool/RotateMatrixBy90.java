package src.stringquestion.copystring.customTreadpool;

public class RotateMatrixBy90 {

static int N=4;

	// An Inplace function to rotate a N x N matrix 
	// by 90 degrees in anti-clockwise direction 
	static void rotateMatrix(int mat[][]) 
	{ 
		// Consider all squares one by one 
		for (int x = 0; x < N / 2; x++) 
		{ 
			// Consider elements in group of 4 in 
			// current square 
			for (int y = x; y < N-x-1; y++) 
			{ 
				// store current cell in temp variable 
				int temp = mat[x][y]; 

				// move values from right to top 
				mat[x][y] = mat[y][N-1-x]; 

				// move values from bottom to right 
				mat[y][N-1-x] = mat[N-1-x][N-1-y]; 

				// move values from left to bottom 
				mat[N-1-x][N-1-y] = mat[N-1-y][x]; 

				// assign temp to left 
				mat[N-1-y][x] = temp; 
			} 
		} 
	} 

	// Function to print the matrix 
	static void displayMatrix(int mat[][]) 
	{ 
		for (int i = 0; i < N; i++) 
		{ 
			for (int j = 0; j < N; j++) 
				System.out.println( mat[i][j]+" "); 

			System.out.println("\n"); 
		} 
		System.out.println("\n"); 
	} 

	static void print(int mat[][])
	{
		for(int i=0;i<N;i++)
			
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(" "+mat[i][j]);
			}
			System.out.println();
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		
	
	
		// Test Case 1 
		
	
		int mat[][] =  {
				 {1,2,3,4},
				 {5,6,7,8},
				 {9,10,11,12},
				 {13,14,15,16}
				};


		// Tese Case 2 
		/* int mat[N][N] = { 
							{1, 2, 3}, 
							{4, 5, 6}, 
							{7, 8, 9} 
						}; 
		*/

		// Tese Case 3 
		/*int mat[N][N] = { 
						{1, 2}, 
						{4, 5} 
					};*/

		//displayMatrix(mat); 

		rotateMatrix(mat); 
		print(mat);
		// Print rotated matrix 

	} 

}
