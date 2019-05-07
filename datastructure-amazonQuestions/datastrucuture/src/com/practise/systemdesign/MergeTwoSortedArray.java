package com.practise.systemdesign;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int[] a= {2,4,6};
		int[] b= {3,5,7};
		merge(a,b);
		
		//Iterator
	}
	
	public static void merge(int[] a,int [] b)
	{
		int[] c = new int[a.length+b.length];
		int m =0;
		int n= 0;
		int k=0;
		while(m<a.length && n<b.length)
		{
			if(a[m]<b[n])
			{
				c[k] = a[m];
				m++;
			}
			else
			{
				c[k] = b[n];
				n++;
			}
			k++;
		}
		while(m<a.length)
		{
			c[k] = a[m];
			m++;
			k++;
		}
		while(n<b.length)
		{
			c[k] = b[n];
			k++;
			n++;
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
	

}
