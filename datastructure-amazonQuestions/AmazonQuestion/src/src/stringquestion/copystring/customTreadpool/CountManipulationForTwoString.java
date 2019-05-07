package src.stringquestion.copystring.customTreadpool;

public class CountManipulationForTwoString {
	public static void main(String[] args) {
		 String s1 = "ddcf"; 
	        String s2 = "cedk"; 
	        System.out.println(countManipulations(s1, s2)); 
	}
	
	public static int countManipulations(String s1,String s2)
	{
		int count=0;
		int[] ch = new int[26];
		for(int i=0;i<s1.length();i++)
			ch[s1.charAt(i)-'a']++;
		
		for(int i=0;i<s2.length();i++)
		{
			if(ch[s2.charAt(i)-'a'] >0)
			{
				ch[s2.charAt(i)-'a']--;
			}
			else
				count++;
		}
		
		
		return count;
	}

}
