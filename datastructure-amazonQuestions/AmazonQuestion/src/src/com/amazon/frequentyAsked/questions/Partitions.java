package src.com.amazon.frequentyAsked.questions;

import java.util.Arrays;

public class Partitions {
	public static void main(String[] args) {
		int[] a= {1,5,11,5};
		//int sum =11;
		findSubset(a);
		
	
	}
	public static void findSubset(int[] a)
	{
		int curSum = 0;
		for(int el:a)
			curSum+=el;
		if(curSum %2 !=0)
		{
			System.out.println(" subSet not possible");
			return;
		}
		int half = curSum/2;
		int[] subset= new int[a.length];
		
		isSubset(a,a.length,subset,0,half);
		
	}
	
	public static int isSubset(int[] a,int n,int[] sub,int k,int sum)
	{
		if(sum ==0)
		{
			System.out.println(Arrays.toString(sub));
			System.out.println();
			Arrays.fill(a, 0);
			k=0;
			return 1;
		}
		if( n<=0 && sum!=0 )
		{
			//System.out.println(" not possible");
			return 0;
		}
		if(a[n-1]>sum)
			isSubset(a, n-1, sub, k, sum);	
		sub[k] = a[n-1];
		 return isSubset(a, n-1, sub, k+1, sum-a[n-1]) +isSubset(a, n-1, sub, k, sum);
	}
}
