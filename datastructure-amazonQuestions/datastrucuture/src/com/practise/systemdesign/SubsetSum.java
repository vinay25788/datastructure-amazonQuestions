package com.practise.systemdesign;

public class SubsetSum {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int sum=3;
		subsetSum(a,sum);
	}
	
	public static void subsetSum(int[] a,int sum)
	{
		boolean[][] subset = new boolean[sum+1][a.length+1];
		
		for(int i=0;i<=a.length;i++)
		{
			subset[0][i]=true;
		}
		
		for(int i=0;i<=sum;i++)
		{
			subset[i][0] = false;
			
		}
		
		for(int i=1;i<=sum;i++)
		{
			for(int j=1;j<=a.length;j++)
			{
				subset[i][j] = subset[i][j-1];
				if(i>=a[j-1])
				{
					subset[i][j] = subset[i][j] || subset[i-a[j-1]][j-1];
				}
			}
		}
		
		for(int i=0;i<=sum;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
				System.out.println("i->" +i+ " j->"+j+ " "+subset[i][j]);
			}
		}
		
		System.out.println(" final result ");
		System.out.println(subset[sum][a.length]);
	}

}
