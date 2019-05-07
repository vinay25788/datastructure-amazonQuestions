package com.practise.array.order.optimization.search;

public class FirstTwoRepeatingElement {
	public static void main(String[] args) {
		int[] a= {1,2,3,1,2,4,5};
		findFirstTwo(a);
	}
	
	public static void findFirstTwo(int[] a)
	{
		int count[] = new int[a.length];
		
		
		for(int i=0;i<a.length;i++)
		{
			if(count[a[i]] == 1)
			{
				System.out.println(" "+a[i]);
			}
			else
				count[a[i]]++;
		}
	}

}
