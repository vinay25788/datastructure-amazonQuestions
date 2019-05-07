package com.practise.companyInterviewQuestion;

public class FibonacciUsingDP {

	public static void main(String[] args) {
		fib(8);
	}
	
	public static void fib(int n)
	{
		int[] f = new int[n];
		f[0] = 0;
		f[1] =1;
		for(int i=2;i<n;i++)
		{
			f[i] = f[i-2]+f[i-1];
		}
		System.out.println(f[n-1]);
	}
}
