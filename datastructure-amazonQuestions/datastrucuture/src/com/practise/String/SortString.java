package com.practise.String;

public class SortString {
	public static void main(String[] args) {
		String st ="viinaaay";
		sortString(st);
	}
	
	public static void sortString(String st)
	{
		char[] ch = new char[26];
		for(int i=0;i<st.length();i++)
		{
			ch[st.charAt(i)-'a']++;
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<26;i++)
		{
			while(ch[i]-- >0)
			{
				char c =  (char) (i+'a');
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
