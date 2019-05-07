package com.practise.companyInterviewQuestion;

import com.practise.graph.simple.DFS;

public class Islands {
	
	public static final int ROW=5;
	public static final int COL= 5;
	public static void main(String[] args) {
		
		 int M[][]=  new int[][] {{1, 1, 0, 0, 0}, 
             {0, 1, 0, 0, 1}, 
             {1, 0, 0, 1, 1}, 
             {0, 0, 0, 0, 0}, 
             {1, 0, 1, 0, 1}
		 };
		 
		 
		 Islands island  = new Islands();
		 island.count(M);
	}
	private void count(int[][] mat) {
		// TODO Auto-generated method stub
		boolean visited[][] = new boolean[ROW][COL];
		int count=0;
		for(int i=0;i<ROW;i++)
		{
			for(int j=0;j<COL;j++)
			{
				if(mat[i][j] == 1 && !visited[i][j])
				{
					DFS(mat,i,j,visited);
					++count;
				}
			}
		}
		System.out.println("count-->"+count);
	}
	
	private void DFS(int[][] mat,int r,int c,boolean[][] visited) {

		int[] ro = {-1,-1,-1,0,0,1,1,1};
		int[] co = {-1,0,1,-1,1,-1,0,1};
		visited[r][c] = true;
		for(int i=0;i<8;i++)
		{
			if(isSafe(mat,r+ro[i],c+co[i],visited))
			{
				DFS(mat,r+ro[i],c+co[i],visited);
			}
		}
	}
	
	private boolean isSafe(int[][] mat,int r,int c,boolean[][] visited) {
		return r>=0 && r<ROW && c>=0 && c<COL && mat[r][c] ==1&& !visited[r][c];
	}
}
