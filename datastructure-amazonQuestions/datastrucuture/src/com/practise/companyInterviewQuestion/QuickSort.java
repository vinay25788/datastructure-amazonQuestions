package com.practise.companyInterviewQuestion;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] a = {4,3,2,1,0,11	};
		sort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
	
	public static void sort(int[] a,int low,int high)
	{
	
		if(low<high)
		{
			int partition = partitions(a,low,high);
			sort(a,low,partition-1);
			sort(a,partition+1,high);
		}
	}
	
	public static int partitions(int[] a,int low ,int high)
	{
		int pivot = a[high];
		int i=low-1;
		int j=low;
		
		for(j=low;j<high;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		return i+1;
	}

}
