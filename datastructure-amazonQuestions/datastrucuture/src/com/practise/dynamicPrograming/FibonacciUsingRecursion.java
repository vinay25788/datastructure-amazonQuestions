package com.practise.dynamicPrograming;

public class FibonacciUsingRecursion {
	
	int result;
	public int fib(int n)
	{
		if(n ==1 || n==2)
			return 1;
		
		return  fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		FibonacciUsingRecursion obj = new FibonacciUsingRecursion();
		
		System.out.println(obj.fib(8));
	}

}
