
public class LongestPallindrome {

	public static void main(String[] args) {
		String st = "geeksforgeeks";
		findLongest(st);
	}
	
	public static void findLongest(String st)
	{
		int n = st.length();
		int lps[][] = new int[n][n];
		for(int i=0;i<n;i++)
			lps[i][i] =1;
		
		for(int cl=2;cl<=n;cl++)
		{
			for(int i=0;i<n-cl+1;i++)
			{
				int j = i+cl-1;
				
				if(st.charAt(i) == st.charAt( j) && cl==2)
					lps[i][j] = 2;
				else if(st.charAt(i) == st.charAt(j))
					lps[i][j] = lps[i+1][j-1]+2;
				else
					lps[i][j] = Math.max(lps[i+1][j], lps[i][j-1]);
			}
		}
		System.out.println(lps[0][n-1]);
	}
}
