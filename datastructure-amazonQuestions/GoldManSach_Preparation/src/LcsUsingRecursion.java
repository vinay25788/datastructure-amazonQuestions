import java.util.HashSet;
import java.util.Set;

public class LcsUsingRecursion {
	public static void main(String[] args) {
		String s1 ="abcdaf";
		String s2 ="acbcf";
		Set<String> sb = new HashSet<>();
		int k=0;
		System.out.println(lcs(s1.toCharArray(),s2.toCharArray(),sb,0,0));
		System.out.println(sb);
	}
	public static int lcs(char[] s1,char[] s2,Set<String> sb,int i,int j)
	{
		if(i== s1.length || j== s2.length)
		{
			//System.out.println(sb);
			return 0;
		}
		
		if(s1[i]==s2[j])
		{
			char ch = s1[i];
			
			sb.add(String.valueOf(ch));
			return 1+lcs(s1, s2, sb, i+1, j+1);
		}
		
		else 
			return Math.max(lcs(s1, s2, sb, i+1, j), lcs(s1, s2, sb, i, j+1));
	}

}
