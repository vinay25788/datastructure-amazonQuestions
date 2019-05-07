package com.practise.tree;

public class CountNumberOfIsland {
	static int count=0;
	public static void main(String[] args) {
		char mat[][] = { 
				{ '1', '1', '0', '0', '0' },
				{ '1', '1', '0', '0', '1'},
				{ '1', '0', '0', '1', '1' }, 
				{ '0', '0', '0', '0', '0' }, 
				{ '1', '0','1', '0', '1' } };

		System.out.println(countNumber(mat));
	}

	public static int countNumber(char[][] mat) {

		int max = 0;
		int m= mat.length;
		int n= mat[0].length;
		for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (mat[i][j] == '1') {
	                max = Math.max(max, dfs(mat, i, j, 0));
	            }
	        }
	    }
	    // recover the grid
	    for (int i = 0; i < m; i++)
	        for (int j = 0; j < n; j++)
	            if (mat[i][j] == '#')  mat[i][j] = '1';
	    return max;

	}

	private static int dfs(char[][] grid, int i, int j, int count) {
	    if (grid[i][j] == '1') {
	        grid[i][j] = '#';
	        count++;
	        int m = grid.length, n = grid[0].length;
	        if (i - 1 >= 0) 
	        	count = dfs(grid, i - 1, j, count);
	        if (i + 1 < m) 
	        	count = dfs(grid, i + 1, j, count);
	        if (j - 1 >= 0) 
	        	count = dfs(grid, i, j - 1, count);
	        if (j + 1 < n) 
	        	count = dfs(grid, i, j + 1, count);
	    }
	    return count;
	}

}
