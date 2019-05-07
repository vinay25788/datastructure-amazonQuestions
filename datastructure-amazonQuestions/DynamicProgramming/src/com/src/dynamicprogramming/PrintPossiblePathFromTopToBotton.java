package com.src.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;


public class PrintPossiblePathFromTopToBotton {
		
	static class Point
	{
		int x;
		int y;
	}
	
	public boolean isSafe(int x,int y)
	{
		if(x>=0 && x<3 && y>=0 && y<3)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int[][] a= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		List<Integer> list = new ArrayList<>();
		int n=3;
		int m=3;
		Point pt = new Point();
		pt.x =0;
		pt.y=0;
		printPath(a,n,m,pt,list);
	}
	public static void printPath(int[][] a,int n,int m,Point p,List<Integer> list)
	{
		a[]
		if(n==0 && m==0)
		{
			System.out.println(list);
			return;
		}
		if(m==0)
		{
			
		}
	}
	
}





