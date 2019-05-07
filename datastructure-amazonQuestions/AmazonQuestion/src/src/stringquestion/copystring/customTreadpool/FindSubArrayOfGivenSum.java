package src.stringquestion.copystring.customTreadpool;

public class FindSubArrayOfGivenSum {
	public static void main(String[] args) {
		int[]  a= {2,3,5,9};
		int sum=10;
		findSubArray(a,sum);
	}
	public static void findSubArray(int[] a,int sum)
	{
		boolean[][] dp= new boolean[a.length+1][sum+1];
		dp[0][0] = true;
		int n= a.length;
		for(int i=1;i<=n;i++)
		{
			dp[i][0] = true;
		}
		for(int i=1;i<=sum;i++)
		{
			dp[0][i] = false;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(j<a[i-1])
				{
					dp[i][j] = dp[i-1][j];
				}
				else
				{
					dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
				}
			}
		}
		
		System.out.println(" Array elements");
		if(dp[n][sum] == true)
		{
			for(int i=n;i>=0;)
			{
				for(int j=sum;j>=0;)
				{
					if(dp[i][j] == true)
					{
						if(dp[i-1][j] == true)
						{
							System.out.print(a[i]);
							i--;
							break;
						}
						else
						{
							i=i-1;
							j= j-a[i];
							break;
						}
							
					}
				}
			}
		}
	}

}
