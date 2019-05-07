
public class MinimumChangingCoin {
	public static void main(String[] args) {
		int[] coins = {1,5,6,8};
		findCoins(coins,11);
	}
	public static void findCoins(int[] coins,int sum)
	{
		int[][] dp = new int[coins.length][sum+1];
		for(int i=1;i<=sum;i++)
		{
			if(coins[0]>i)
			{
				dp[0][i]=0;
			}
			else
			{
				dp[0][i]=i/coins[0];
			}
		}
		
		for(int i=1;i<coins.length;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(j<coins[i])
				{
					dp[i][j] = dp[i-1][j];
				}
				else
				{
					dp[i][j] = Math.min(dp[i-1][j], dp[i][j-coins[i]]+1);
				}
			}
		}
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[i].length;j++)
			{
				System.out.print(" "+dp[i][j]);
			}
			System.out.println();
		}
		System.out.println(dp[coins.length-1][sum]);
	}

}
