package src.stringquestion.copystring.customTreadpool;

public class FirstFirstRepeatingCharacter {

	public static void main(String[] args) {
		String st ="vinvinay";
		//firstRepeating(st);
		printCharacterAndFrequency(st);
	}
	public static void printCharacterAndFrequency(String st)
	{
		int[] ch = new int[26];
		for(int i=0;i<st.length();i++)
		{
			ch[st.charAt(i)-'a']++;
		}
		System.out.println("character with frequency \n");
		boolean[] visited = new boolean[26];
		for(int i=0;i<st.length();i++)
		{
			if(!visited[st.charAt(i)-'a'])
			{
				System.out.print(st.charAt(i)+""+ch[st.charAt(i)-'a']);
				visited[st.charAt(i)-'a'] = true;
			}
		}
	}
	public static void firstRepeating(String st)
	{
		int[] ch = new int[26];
		for(int i=0;i<st.length();i++)
		{
			ch[st.charAt(i)-'a']++;
			if(ch[st.charAt(i)-'a']>1)
			{
				System.out.println(st.charAt(i));
				return;
			}
		}
	}
}
