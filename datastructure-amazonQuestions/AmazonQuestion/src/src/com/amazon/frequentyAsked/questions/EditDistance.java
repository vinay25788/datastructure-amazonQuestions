package src.com.amazon.frequentyAsked.questions;

public class EditDistance {
	public static void main(String[] args) {
		String st="vinay";
		String st2 ="viayk";
		editDist(st,st2,st.length(),st2.length());
	}
	
	public static int min(int x,int y,int z)
	{
		if(x<=y && x<=z)
			return x;
		if(y<=x&& y<=z)
			return y;
		else 
			return z;
			
	}
		public static void editDist(String st1,String st2,int m,int n)
		{
			int[][] edit = new int[m+1][n+1];
			
			for(int i=0;i<=m;i++)
			{
				for(int j=0;j<=n;j++)
				{
					if(i==0)
						edit[i][j]=j;
					else if(j==0)
					{
						edit[i][j]=i;
					}
					else if(st1.charAt(i-1) == st2.charAt(j-1))
						edit[i][j] = edit[i-1][j-1];
					else
						edit[i][j] = 1+min( edit[i][j-1],edit[i-1][j],edit[i-1][j-1]);
				}
			}
			System.out.println(edit[m][n]);
		}
}
