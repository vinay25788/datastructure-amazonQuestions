package com.src.dynamicprogramming;

public class PrintPossiblePath {
	
	static class Point
	{
		int i;
		int j;
	}
	public static void printArray(Point[] arr, int n)
	{
	  for(int i=0; i<n; i++)
	  {
	    System.out.println(" ("+arr[i].i+", "+arr[i].j+")");
	  }
	}

	public static int printPaths(int n, int m, Point[] arr, int N, int curCell)
	{
	  arr[curCell].i = n;
	  arr[curCell].j = m;
	  
	  if(n == 0 && m == 0)
	  {
	    printArray(arr, N);
	    System.out.println();// PRINT NEXT PATH IN NEW LINE
	    return 0;
	  }
	  
	  if(n == 0)
	  {
	    printPaths(n, m-1, arr, N, curCell-1);
	    return 1;
	  }
	  if(m==0)
	  {
	    printPaths(n-1, m, arr, N, curCell-1);
	    return 1;
	  }
	  return printPaths(n, m-1, arr, N, curCell-1) + printPaths(n-1, m, arr, N, curCell-1);
	}

	public static void  main(String args[])
	{
	  // IF MATRIX IS 3*3
	  Point arr[] = new Point[5];
	  for(int i=0;i<5;i++)
	  {
		  arr[i] = new Point();
	  }
	  printPaths(2, 2, arr, 5, 4);
	  
	}

}
