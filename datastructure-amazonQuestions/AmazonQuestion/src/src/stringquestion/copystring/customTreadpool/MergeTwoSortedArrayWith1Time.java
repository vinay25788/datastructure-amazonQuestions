package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class MergeTwoSortedArrayWith1Time {
	
	public static void main(String[] args) {
		  int a[] = new int[]{1, 5, 9, 10, 15, 20}; 
		     int b[] = new int[]{2, 3, 8, 13}; 
		     
		     merge(a,b);
		     System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
		     
		      
	}
	
	public static void merge(int[] a,int [] b)
	{
		int n=a.length;
		int m=b.length;
		for(int i=m-1;i>=0;i--)
		{
			int j=0,last =a[n-1];
			for( j=n-2;j>=0 && a[j]>b[i];j--)
			{
				a[j+1] =a[j];
			}
			if(j!=n-2 || last>b[i])
			{
				a[j+1] = b[i];
				b[i] =last;
			}
		}
	}

}
