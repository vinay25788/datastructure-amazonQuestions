package src.stringquestion.copystring.customTreadpool;

//Java program to count the 
//distinct transformation 
//of one string to other. 
public class TransformOneStringToAnother 
{ 

	static int countTransformation(String a, 
								String b) 
	{ 
		int n = a.length(), m = b.length(); 

		// If b = "" i.e., an empty string. There 
		// is only one way to transform (remove all 
		// characters) 
		if (m == 0) 
		{ 
			return 1; 
		} 

		int dp[][] = new int[m + 1][n + 1]; 

		// Fil dp[][] in bottom up manner 
		// Traverse all character of b[] 
		for (int i = 0; i < m; i++) 
		{ 

			// Traverse all charaters of a[] for b[i] 
			for (int j = i; j < n; j++) 
			{ 

				// Filling the first row of the dp 
				// matrix. 
				if (i == 0) 
				{ 
					if (a.charAt(j) == b.charAt(i) && 
											j == 0) 
					{ 
						dp[i][j] = 1; 
					} 
					else if (a.charAt(j) == b.charAt(i)) 
					{ 
						dp[i][j] = dp[i][j - 1] + 1; 
					} 
					else
					{ 
						dp[i][j] = dp[i][j - 1]; 
					} 
				} 
				
				// Filling other rows. 
				else if (a.charAt(j) == b.charAt(i)) 
				{ 
					dp[i][j] = dp[i][j - 1] 
							+ dp[i - 1][j - 1]; 
				} 
				else
				{ 
					dp[i][j] = dp[i][j - 1]; 
				} 
			} 
		} 
		return dp[m - 1][n - 1]; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String a = "abcccdf", b = "abccdf"; 
		System.out.println(countTransformation(a, b)); 
	} 
} 

//This code is contributed by 
//PrinciRaj1992 
