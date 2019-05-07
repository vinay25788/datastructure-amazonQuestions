package src.stringquestion.copystring.customTreadpool;

import java.util.Comparator;

class A implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class SmalllestWindowContainAllCharacterOfItSelf {
	public static void main(String[] args) {
		String str = "aabcbcdbca"; 
        System.out.println( findSubString(str)); 
	}

	public static String findSubString(String str)
	{
		int[] hash = new int[256];
		int start=0,start_index=0;
		int count=0;
		int dist=0;
		int min_length=Integer.MAX_VALUE;
		int[] fist = new int[256];
		for(int i=0;i<str.length();i++)
		{
			fist[str.charAt(i)]++;
			if(fist[str.charAt(i)]==1)
				dist++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			hash[str.charAt(i)]++;
			if(hash[str.charAt(i)]==1)
				count++;
			if(count== dist)
			{
				while(hash[str.charAt(start)]>1)
				{
					if(hash[str.charAt(start)]>1)
						hash[str.charAt(start)]--;
					start++;
				}
				int len = i-start+1;
				if(min_length>len)
				{
					min_length = len;
					start_index = start;
				}
			}
			
			
		}
		if(start_index == 0)
		{
			return "all character are same";
		}
		else
		{
			return str.substring(start_index, start_index+min_length);
		}
		
	}
}
