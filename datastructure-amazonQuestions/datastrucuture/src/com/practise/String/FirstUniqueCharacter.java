package com.practise.String;

public class FirstUniqueCharacter {
	
	public static void main(String[] args) {
		String s = "vvinnay";
		firstUnique(s);
		String str ="vinay ku mar   ";
		spaceFilledWith20(str);
		
		String n = "123";
		findPer(n);
		
	}
	public static void findPer(String n)
	{
		findPerUtil("",n);
	}
	
	public static void findPerUtil(String perm ,String word)
	{
		if(word.isEmpty())
			System.out.println(perm+"  "+word);
		else
		{
			for(int i=0;i<word.length();i++)
			findPerUtil(perm+word.charAt(i), word.substring(0, i)+word.substring(i+1,word.length()));
		}
	}

	public static void spaceFilledWith20(String str)
	{
		int space_count=0;
		int i=0;
		for( i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				space_count++;
		}
		i--;
		while(str.charAt(i) == ' ')
		{
			space_count--;
			i--;
		}
		int newLength = i+2*space_count+1;
		int index = newLength-1;
		char[] newch = new char[newLength];
		newch[index--] = '\0';
		for(int j=i-1;j>=0;j--)
		{
			if(str.charAt(j) ==' ')
			{
				newch[index] = '0';
				newch[index-1] = '2';
				newch[index-2] ='%';
				index = index-3;
			}
			else
			{
				newch[index] = str.charAt(j);
				index--;
			}
		}
		for(i=0;i<newch.length;i++)
		{
			System.out.print(newch[i]);
		}
	}
	public static void firstUnique(String s)
	{
		char[] ch = new char[26];
		
		for(int i=0;i<s.length();i++)
		{
			ch[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(ch[s.charAt(i)-'a'] == 1)
			{
				System.out.println(" "+(char)s.charAt(i));
				break;
			}
		}
		
		/*for(int i=0;i<26;i++)
		{
			while(ch[i]-- >0)
			{
				char c =  (char) (i+'a');
				sb.append(c);
			}
		}*/
			
	}
}
