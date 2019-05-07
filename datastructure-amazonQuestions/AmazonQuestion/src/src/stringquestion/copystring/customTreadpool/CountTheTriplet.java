package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class CountTheTriplet {
	public static void main(String[] args) {
		int a[] = new int[]{5, 1, 3, 4, 7};
		find(a,12);
	}
	public static void find(int[] a,int sum)
	{
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<a.length-2;i++)
		{
			int l=i+1;
			int r = a.length-1;
			while(l<r)
			{
				if(a[i]+a[l]+a[r]>=sum)
				{
					System.out.println(a[i]+" "+a[l]+" "+a[r]);
					count++;
					r--;
					
				}
				else if (a[i]+a[l]+a[r]<sum)
					l++;
				else
					r--;
			}
			
		}
		System.out.println(count);
	}

}
