package com.src.dynamicprogramming;

public class StairCaseUsingRecursion {
	public static void main(String[] args) {
		int stair = 5;
		System.out.println(findStep(stair));
	}
	public static int findStep(int stair)
	{
		/*if(stair ==0)
			return 0;*/
		if(stair == 1)
			return 1;
		else if (stair == 2)
			return 2;
		else
			return findStep(stair-1)+findStep(stair-2);
	}

}
