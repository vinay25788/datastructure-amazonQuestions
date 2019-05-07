package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class MergeSortedArray {

	  static int arr1[] = new int[]{1, 5, 9, 10, 15, 20}; 
	    static int arr2[] = new int[]{2, 3, 8, 13};
	public static void main(String[] args) {
		int m=arr1.length;
		int n= arr2.length;
		sort(m,n);
	}
	public static void sort(int m,int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			int j,last = arr1[m-1];
			for( j=m-2;j>=0 && arr1[j]>arr2[i];j--)
			{
				arr1[j+1] = arr1[j];
				
			}
			if(j!=m-1 || last<arr2[i])
			{
				arr1[j+1] = arr2[i];
				arr2[i] = last;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
