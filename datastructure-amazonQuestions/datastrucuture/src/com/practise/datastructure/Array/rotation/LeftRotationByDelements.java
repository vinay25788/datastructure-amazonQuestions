package com.practise.datastructure.Array.rotation;

public class LeftRotationByDelements {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		
		int k =2;
		
		rotateArray(a,k);
	}

	public static void rotateArray(int[] a,int k)
	{
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		reverse(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
	}
	
	public static void reverse(int[] a,int l,int r)
	{
		while(l<r)
		{
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
	}
}
