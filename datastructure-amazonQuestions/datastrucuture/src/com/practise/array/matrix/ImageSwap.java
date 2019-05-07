package com.practise.array.matrix;

//Efficient Java program to find mirror of 
//matrix across diagonal. 
import java.io.*; 

public class ImageSwap { 
	
	static int MAX = 100; 
	
	static void imageSwap(int mat[][], int n) 
	{ 
		
		// traverse a matrix and swap 
		// mat[i][j] with mat[j][i] 
		for (int i = 0; i < n; i++) 
			for (int j = 0; j <= i; j++) 
				mat[i][j] = mat[i][j] + mat[j][i] - (mat[j][i] = mat[i][j]);	 
	} 
	
	// Utility function to print a matrix 
	static void printMatrix(int mat[][], int n) 
	{ 
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) 
				System.out.print( mat[i][j] + " "); 
			System.out.println(); 
		} 
	} 
	
	// driver program to test above function 
	public static void main (String[] args) 
	{ 
		int mat[][] = { { 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16 } }; 
		int n = 4; 
		imageSwap(mat, n); 
		printMatrix(mat, n); 
	} 
} 

//This code is contributed by anuj_67. 
