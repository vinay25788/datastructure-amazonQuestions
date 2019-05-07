package main.java.ecs.impl;

public class MaxReachJump {

	public static void main(String[] args) {
		  int a[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; 
	  int n = a.length;
	  calJum(a,n);
	}
	
	public static void calJum(int[] a,int n)
	{
		int maxreach = a[0];
		int i=1;
		int jumps =1;
		int steps = a[0];
		if(n<=1)
		{
			System.out.println(1);
			return;
		}
		for( i=1;i<n;i++)
		{
			if(i== n-1)
			{
				System.out.println(" jump "+jumps);
				break;
			}
			maxreach = Math.max(maxreach, i+a[i]);
			steps--;
			if(steps ==0)
			{
				jumps++;
				if(i>=maxreach)
				{
					break;
				}
				steps = maxreach-i;
			}
		}
	}
}
