package com.src.datastructure.matrix;

public class TestSolution {
	
	public static void main(String[] args) {
		Long sum = getSum(1000);
		
	}
	public static Long getSum(int n)
	{
		long sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		return sum;
	}

}
