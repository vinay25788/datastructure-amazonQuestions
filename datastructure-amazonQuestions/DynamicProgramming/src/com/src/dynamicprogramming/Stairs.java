package com.src.dynamicprogramming;

public class Stairs {
	public static void main(String[] args) {
		int stair = 5;
		System.out.println(count(stair));
	}
	public static int count(int stair)
	{
		int[] step= new int[stair+1];
		//step[1] = 1;
		step[2] = 2;
		step [3] =3;
		for(int i=4;i<=stair;i++)
		{
			step[i] = step[i-2]+step[i-3];
			
		}
		return step[stair];
	}

}
