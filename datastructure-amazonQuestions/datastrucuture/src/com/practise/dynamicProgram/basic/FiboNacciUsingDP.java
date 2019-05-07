package com.practise.dynamicProgram.basic;

public class FiboNacciUsingDP {
	public static void main(String[] args) {
		int n = 5;
		
		int result = fib(5);
		System.out.println(result);
	}

	public static int fib(int n)
	{

		int f[] = new int [n+2];
		int i=0;
		f[0] =0;
		f[1] =1;
		for(i=2;i<n;i++)
		{
			f[i] = f[i-1]+f[i-2];
		}
		
		return f[n-1];
	}
}
