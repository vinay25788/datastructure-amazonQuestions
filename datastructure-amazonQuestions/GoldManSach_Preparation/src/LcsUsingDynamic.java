
public class LcsUsingDynamic {
	
	public static void main(String[] args) {
		String s1 ="abcdaf";
		String s2 ="acbcf";
		lcsUsingDp(s1,s2);
	}
	public static void lcsUsingDp(String s1,String s2)
	{
		int[][] temp = new int[s2.length()+1][s1.length()+1];
		
		for(int i=1;i<=s2.length();i++)
		{
			for(int j =1;j<=s1.length();j++)
			{
				if(s2.charAt(i-1)==s1.charAt(j-1))
				{
					temp[i][j] = 1+temp[i-1][j-1];
				}
				else
					temp[i][j] = Math.max(temp[i-1][j], temp[i][j-1]);
			}
		}
		System.out.println(temp[s2.length()][s1.length()]);
	}

}
