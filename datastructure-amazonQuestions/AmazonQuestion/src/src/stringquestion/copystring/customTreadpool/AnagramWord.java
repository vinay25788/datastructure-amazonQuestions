package src.stringquestion.copystring.customTreadpool;

public class AnagramWord {
	public static void main(String[] args) {
		String s1 ="vinay";
		String s2 ="naiyvvv";
		System.out.println(check(s1,s2));
	}
	public static boolean check(String s1,String s2)
	{
		int[] ch= new int[26];
		int[] ch2 = new int[26];
		for(int i=0;i<s1.length();i++)
			ch[s1.charAt(i)-'a']++;
		for(int i=0;i<s2.length();i++)
			ch2[s2.charAt(i)-'a']++;
		
		for(int i=0;i<26;i++)
		{
			if(ch[i] !=ch2[i])
			{
				return false;
			}
			
		}
		return true;
	}

}
