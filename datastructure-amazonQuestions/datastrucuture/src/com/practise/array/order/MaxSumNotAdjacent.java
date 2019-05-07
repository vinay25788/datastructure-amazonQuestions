package com.practise.array.order;

public class MaxSumNotAdjacent {

	public static void main(String[] args) {
		int arr[] = {5, 5, 10, 100, 10, 5}; 
		System.out.println(nonAdjacent(arr));
	}
	public static int nonAdjacent(int[] a)
	{
		int incl=a[0];
		int excl=0;
		int i=1;
		int excludeNew=0;
		while(i<a.length)
		{
			 excludeNew = incl>excl?incl:excl;
			incl= excl+a[i];
			excl = excludeNew;
			i++;
		}
		
		/*for( i=1;i<a.length;i++)
		{
			int temp = incl;
			incl = Math.max(excl+a[i], incl);
			excl=temp;
		}*/
		
		return excl>incl?excl:incl;
	}
}
