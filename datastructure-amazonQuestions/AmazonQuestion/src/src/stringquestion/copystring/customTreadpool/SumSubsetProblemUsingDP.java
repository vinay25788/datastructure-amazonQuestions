package src.stringquestion.copystring.customTreadpool;

public class SumSubsetProblemUsingDP {

	public static void main(String[] args) {
		int[] set = {2,3,7,8,10};
		int n=set.length;
		int sum = 11;
		System.out.println(isSubset(set,n,sum));
	}
	
	public static boolean isSubset(int[] set,int n,int sum)
	{
		boolean[][] subset= new boolean[n][sum+1];
		for(int i=0;i<n;i++)
		{
			subset[i][0] = true;
		}
		for(int i=1;i<=sum;i++)
		{
			if(i<set[0])
				subset[0][i]= false;
			else if(set[0]>=i)
				subset[0][i] = true;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				
				if(j<set[i])
				{
					subset[i][j] = subset[i-1][j];
				}
				else
					subset[i][j] = subset[i-1][j] || subset[i-1][j-set[i]];
					
			}
		}
		return subset[n-1][sum];
	}
}
