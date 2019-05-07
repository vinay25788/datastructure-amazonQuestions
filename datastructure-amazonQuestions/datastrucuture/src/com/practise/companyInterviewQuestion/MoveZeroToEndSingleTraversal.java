package com.practise.companyInterviewQuestion;

public class MoveZeroToEndSingleTraversal {
	public static void main(String[] args) {
		 int a[] = {0, 1, 9, 8, 4, 0, 0, 2, 
                 7, 0, 6, 0, 9}; 
		 moveZeroToEnd(a);
		 for(int i=0;i<a.length;i++)
			 System.out.print(a[i]+" ");
	}
	
	public static void moveZeroToEnd(int[] a)
	{
		int n = a.length;
		int temp=0;
		int count =0;
		for(int i=0;i<n;i++)
		{
			if(a[i] !=0)
			{
				temp = a[count];
				a[count] = a[i];
				a[i] = temp;
				count++;
			}
		}
	}

}
