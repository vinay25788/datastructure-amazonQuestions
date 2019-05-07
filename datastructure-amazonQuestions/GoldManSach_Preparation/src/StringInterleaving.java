
public class StringInterleaving {
	public static void main(String[] args) {
		String s1 = "XXY";
        String s2 = "XXZ";
        String s3 = "XXZXXXY";
        System.out.println(findInterleav(s1,s2,s3));
	}
	
	public static boolean findInterleav(String s1,String s2,String s3)
	{
		boolean dp[][] = new boolean[s1.length()+1][s2.length()+1];
		dp[0][0]= true;
		
		for(int i=1;i<dp.length;i++)
		{
			for(int j=0;j<dp[i].length;j++)
			{
				int l= i+j-1;
				if(i==0 && j==0)
					dp[i][j] = true;
				else if(i==0)
				{
					if(s3.charAt(l)== s2.charAt(j-1))
						dp[i][j]=dp[i][j-1];
				}
				else if (j==0)
				{
					if(s1.charAt(i-1)== s3.charAt(l))
						dp[i][j] = dp[i-1][j];
				}
				else
					dp[i][j] = (s1.charAt(i-1) == s3.charAt(l)?dp[i-1][j]:false)|| (s2.charAt(j-1)== s3.charAt(l)?dp[i][j-1]:false);
					
			
			}
		}
		return dp[s1.length()][s2.length()];
	}

}
