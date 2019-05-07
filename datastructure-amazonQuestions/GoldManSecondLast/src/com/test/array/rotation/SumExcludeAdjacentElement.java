package com.test.array.rotation;

public class SumExcludeAdjacentElement {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println(find(a));
	}
	public static int find(int[] a)
	{
		int incl=a[0];
		int excl=0;
		int newExcl=0;
		for(int i=1;i<a.length;i++)
		{
			newExcl=excl>incl?excl:incl;
			incl = excl+a[i];
			excl=newExcl;
		}
		
		return excl>incl?excl:incl;
	}

}
