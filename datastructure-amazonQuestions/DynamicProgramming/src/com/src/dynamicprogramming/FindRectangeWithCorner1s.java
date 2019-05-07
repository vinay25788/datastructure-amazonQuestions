package com.src.dynamicprogramming;

//An efficient approach based Java program to 
//find if there is a rectangle with 1 as 
//corners. 
import java.util.HashMap; 
import java.util.HashSet; 
public class FindRectangeWithCorner1s 
{ 
	// Returns true if there is a rectangle with 
	// 1 as corners. 
	static boolean isRectangle(int matrix[][]) 
	{ 
		// finding row and column size 
		int rows = matrix.length; 
		if (rows == 0) 
			return false; 
		int columns = matrix[0].length; 

		// map for storing the index of combination of 2 1's 
		HashMap<Integer,HashSet<Integer>> table=new HashMap<>(); 

		// scanning from top to bottom line by line 
		for(int i=0;i<rows;i++) 
		{ 
			for(int j=0;j<columns-1;j++) 
			{ 
				for(int k=j+1;k<columns;k++) 
				{ 
					//if found two 1's in a column 
					if(matrix[i][j]==1 && matrix[i][k]==1) 
					{ 
						// check if there exists 1's in same 
						// row previously then return true 
						if(table.containsKey(j) && table.get(j).contains(k)) 
						{ 
							return true; 
						} 
						if(table.containsKey(k) && table.get(k).contains(j)) 
						{ 
							return true; 
						} 

						// store the indexes in hashset 
						if(!table.containsKey(j)) 
						{ 
							HashSet<Integer> x=new HashSet<>(); 
							x.add(k); 
							table.put(j,x); 
						} 
						else
						{ 
							table.get(j).add(k); 
						} 
						if(!table.containsKey(k)) 
						{ 
							HashSet<Integer> x=new HashSet<>(); 
							x.add(j); 
							table.put(k,x); 
						} 
						else
						{ 
							table.get(k).add(j); 
						} 
					} 
				} 
			} 
		} 
		return false; 
	} 

	public static void main(String args[]) 
	{ 
		int mat[][]={ { 1, 0, 0, 1, 0 }, 
					{ 0, 0, 1, 0, 1 }, 
					{ 0, 0, 0, 1, 0 }, 
					{ 1, 0, 1, 0, 1 } }; 
		if (isRectangle(mat)) 
			System.out.print("Yes"); 
		else
			System.out.print("No"); 
	} 
} 
//This code is contributed by Gaurav Tiwari 

//This code is contributed by Gaurav Tiwari 
