package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class CountTripletWithGiveSum {
	public static void main(String[] args) {
		  int arr[] = new int[]{5, 1, 3, 4, 7};
		  int sum=12;
		  printCount(arr,sum);
	}
	public static void printCount(int[] a,int sum)
	{
		Arrays.sort(a);
		int ans=0;
		for(int i=0;i<a.length-2;i++)
		{
			int j= i+1;
			int k=a.length-1;
			while(j<k)
			{
				if(a[i]+a[j]+a[k]>=sum)
				{
					k--;
				}
				else
				{
					ans+=k-j;
					j++;
				}
			}
		}
		System.out.println(ans);
	}

}
