package com.practise.companyInterviewQuestion;

public class TestInteger {
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int d =2;
		rotateArray(a,d);
	}

	public static void rotateArray(int[] a,int d)
	{
		reverse(a,0,d-1);
		reverse(a,d,a.length-1);
		reverse(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
			System.out.print(" " +a[i]);
	}
	
	public static void reverse(int[] a,int low,int high)
	{
		while(low<high)
		{
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
	}
}
