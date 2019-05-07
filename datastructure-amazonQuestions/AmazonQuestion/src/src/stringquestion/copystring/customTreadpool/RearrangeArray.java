package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		arange(a);
	}
	public static void arange(int[] a)
	{
		int ind=0;
		int[] tempAr=new int[a.length];
		for(int i=0,j=a.length-1 ;i<=a.length/2 || j>a.length/2;i++,j--)
		{
			if(ind<a.length)
			{
				tempAr[ind++]=a[i];
			}
			if(ind<a.length)
			{
				tempAr[ind++] =a[j];
			}
			
		}
		System.out.println(Arrays.toString(tempAr));
	}
}
