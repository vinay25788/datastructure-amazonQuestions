package com.src.dynamicprogramming;

public class MaxSumNonAdjacent {

	public static void main(String[] args) {
		//int[] a= {4,1,1,4,2,1}; 6, 7, 1, 3, 8, 2, 4
		int[] a= {6, 7, 1, 3, 8, 2, 4};
		System.out.println(findSum(a));
	}
	public static int findSum(int[] a)
	{
		int incl=a[0];
		int excl=0;
		int i=0;
		/*for(i=1;i<a.length;i++)
		{
			int ex_new = incl>excl?incl:excl;
			incl = a[i]+excl;
			excl=ex_new;
			
		}*/
		for( i=1;i<a.length;i++)
		{
			int newIncl = Math.max(excl+a[i], incl);
			excl = incl;
			incl = newIncl;
		}
		System.out.println("incl "+incl);
		return incl>excl?incl:excl;
	}
}
