package main.java.ecs.impl;

import java.util.LinkedList;
import java.util.Queue;

//To store matrix cell cordinates 
class Point 
{ 
	int x; 
	int y; 
}; 

class QueueNode
{
	Point pt; // The cordinates of a cell 
	int dist;
}
//A Data Structure for queue used in BFS 
public class  ShortestPath 
{ 
	

	 // cell's distance of from the source 
	public static final int ROW=9;
	public static final int COL=10;

//check whether given cell (row, col) is a valid 
//cell or not. 
public static boolean isValid(int row, int col) 
{ 
	// return true if row number and column number 
	// is in range 
	return (row >= 0) && (row < ROW) && 
		(col >= 0) && (col < COL); 
} 

//These arrays are used to get row and column 
//numbers of 4 neighbours of a given cell 
static int rowNum[] = {-1, 0, 0, 1}; 
static int colNum[] = {0, -1, 1, 0}; 

//function to find the shortest path between 
//a given source cell to a destination cell. 
public static int BFS(int mat[][], Point src, Point dest) 
{ 
	// check source and destination cell 
	// of the matrix have value 1 
	if (mat[src.x][src.y] != 1 || mat[dest.x][dest.y] != 1) 
		return -1; 

	boolean [][] visited= new boolean[ROW][COL]; 
	//memset(visited, false, sizeof visited); 
	
	// Mark the source cell as visited 
	visited[src.x][src.y] = true; 

	// Create a queue for BFS 
	Queue<QueueNode> q = new LinkedList<>(); 
	
	// Distance of source cell is 0 
	QueueNode s = new QueueNode();
	s.dist=0;
	s.pt=src;
	
	q.add(s); // Enqueue source cell 

	// Do a BFS starting from source cell 
	while (!q.isEmpty()) 
	{ 
		QueueNode curr = q.poll(); 
		Point pt = curr.pt; 

		// If we have reached the destination cell, 
		// we are done 
		if (pt.x == dest.x && pt.y == dest.y) 
			return curr.dist; 

		// Otherwise dequeue the front cell in the queue 
		// and enqueue its adjacent cells 
	//q.poll();

		for (int i = 0; i < 4; i++) 
		{ 
			int row = pt.x + rowNum[i]; 
			int col = pt.y + colNum[i]; 
			
			// if adjacent cell is valid, has path and 
			// not visited yet, enqueue it. 
			if (isValid(row, col) && mat[row][col] ==1 && !visited[row][col]) 
			{ 
				// mark cell as visited and enqueue it 
				visited[row][col] = true;
				Point pr = new Point();
				pr.x = row;
				pr.y = col;
				QueueNode Adjcell = new QueueNode();
				Adjcell.pt = pr;
				Adjcell.dist = curr.dist+1;
				q.add(Adjcell); 
			} 
		} 
	} 

	// Return -1 if destination cannot be reached 
	return -1; 
} 

//Driver program to test above function 
public static void  main(String args[]) 
{ 
	int[][] mat = 
	{ 
		{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
		{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 }, 
		{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, 
		{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, 
		{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 }, 
		{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, 
		{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
		{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
		{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 } 
	}; 

	Point source = new Point();
	source.x= 0;
	source.y =0;
	Point dest = new Point();
	dest.x =3;
	dest.y = 4;

	int dist = BFS(mat, source, dest); 

	if (dist != Integer.MAX_VALUE) 
		System.out.println(" shortest path "+dist);
		else
			System.out.println(" doesn't exist ");
			
} 
}