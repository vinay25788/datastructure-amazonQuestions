
public class MagicPotion {
	public static void main(String[] args) {
		String str="ABCABCE";
		System.out.println(magicPotion(str));
	}
	public static int magicPotion(String str)
	{
		int[] dp= new int[str.length()];
		
		for(int i=0;i<str.length();i++)
			dp[i]=Integer.MAX_VALUE;
		
		dp[0]=1;
		for(int i=1;i<str.length();i++)
		{
			dp[i] = Math.min(dp[i], dp[i-1]+1);
			if(2*i+1<str.length() && str.substring(0, i+1).equals(str.substring(i+1,2*i+2)))
			{
				dp[2*i+1]=dp[i]+1;
			}
		}
		
		
		return dp[str.length()-1];
		
	}
	

}
