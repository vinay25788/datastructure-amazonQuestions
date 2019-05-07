package com.src.datastructure.matrix;

public class FindNumberOfwaysToClimbStair {
	public static void main(String[] args) {
		int stair = 5;
		ways(5);
	}
	public static void ways(int stair)
	{
		int[] f = new int[stair+1];
		f[1] =1;
		f[2]=2;
		f[3] =3;
		for(int i=3;i<=stair;i++)
		{
			f[i] = f[i-1]+f[i-2]+f[i-3];
		}
		System.out.println(f[stair]);
	}
}
