
public class MinimumCutOfStringPallindromePartitions {
	public static void main(String[] args) {
		String str ="aabaa";
		System.out.println(minCut(str));
	}
	public static int minCut(String str)
	{
		int[] cuts = new int[str.length()+1];
		boolean[][] pal=new boolean[str.length()][str.length()];
		
		for(int i=1;i<str.length();i++)
		{
			int min=i;
			for(int j=0;j<=i;j++)
			{
				if(str.charAt(i)==str.charAt(j) && (i<=j+1  || pal[i-1][j+1]))
						{
							pal[i][j] = true;
							min=Math.min(min, j==0?0:1+cuts[j-1]);
						}
			}
			cuts[i]=min;
		}
		System.out.println("pallindrome Matrix");
		System.out.println();
		for(int i=0;i<pal.length;i++)
		{
			for(int j=0;j<str.length();j++)
			{
				System.out.print(pal[i][j]+" ");
			}
			System.out.println();
		}
		return cuts[str.length()-1];
		
	}

}
