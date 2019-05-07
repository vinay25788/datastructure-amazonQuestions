package com.practise.datastructure.Array.rotation;

public class RearrangePositiveNegativeNumber {
	
	public static void main(String[] args) {
		 int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9}; 
	        int n = arr.length; 
	        reArrange(arr); 
	}
	public static void reArrange(int[] a)
	{
		int j=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] <=0)
			{
				j++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp; 
				
			}
		}
		
		int pos = j+1;
		int neg = 0;
		
		while(pos<a.length && neg<a.length && a[neg] < 0)
		{
			int temp = a[pos];
			a[pos] = a[neg];
			a[neg] = temp;
			pos++;
			neg+=2;
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
	}

}
