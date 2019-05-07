package src.stringquestion.copystring.customTreadpool;

public class LexicalOrderStringWithNumber {
	public static void main(String[] args) {
		String st = "AC2BEW3";
		change(st);
	}
	
	public static void change(String st)
	{
		int[] ch = new int[26];
		int sum=0;
		for(int i=0;i<st.length();i++)
		{
			char c = Character.toLowerCase(st.charAt(i));
			if(Character.isAlphabetic(c))
			{
				ch[c-'a']++;
			}
			else
			{
				sum+=st.charAt(i)-'0';
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{
			char c = (char) (i+'a');
			while(ch[i]>0)
			{
				sb.append(c);
				ch[i]--;
			}
		}
		if(sum>0)
			sb.append(sum);
		
		System.out.println(sb);
	}

}
