package src.stringquestion.copystring.customTreadpool;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLengthWithoutRepeatingCharacter {
	public static void main(String[] args) {
		String str = "ABDEFGABEF"; 
        System.out.println("The input string is "+str); 
        int len = longestUniqueSubsttr(str); 
        System.out.println(len);
        System.out.println(usingSet(str));
        
	}

	public static int usingSet(String str)
	{
		Set<Character> set = new HashSet<>();
		String longest="";
		String maxLongest="";
		for(int i=0;i<str.length();i++)
		{
			if(set.contains(str.charAt(i)))
			{
				set.clear();
				longest="";
			}
			else
			{
				set.add(str.charAt(i));
				longest+=str.charAt(i);
				if(longest.length()>maxLongest.length())
					maxLongest = longest;
			}
		}
		return maxLongest.length();
	}
	public static int longestUniqueSubsttr(String str)
	{
		int prev_index =-1;
		int[] visited= new int[256];
		int cur_length=0,max_length=Integer.MIN_VALUE;
		for(int i=0;i<256;i++)
			visited[i] =-1;
		visited[str.charAt(0)] =0;
		for(int i=0;i<str.length();i++)
		{
			prev_index = visited[str.charAt(i)];
			if(prev_index == -1 || i- prev_index > cur_length)
			{
				cur_length++;
			}
			else
			{
				if(cur_length>max_length)
					max_length = cur_length;
				
				cur_length = i-prev_index;
			}
			visited[str.charAt(i)] = i;
		}
		
		if(cur_length>max_length)
			max_length= cur_length;
		return max_length;
	}

}
