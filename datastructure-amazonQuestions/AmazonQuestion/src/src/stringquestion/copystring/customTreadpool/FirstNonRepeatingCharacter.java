package src.stringquestion.copystring.customTreadpool;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String st="viviny";
		firstNonRepeating(st);
	}

	public static void firstNonRepeating(String st)
	{
		int[] ch =new int[26];
		for(int i=0;i<st.length();i++)
		{
			ch[st.charAt(i)-'a']++;
		}
		
		for(int i=0;i<st.length();i++)
		{
			if(ch[st.charAt(i)-'a'] == 1)
			{
				System.out.println(st.charAt(i));
				return;
			}
		}
	}
}
