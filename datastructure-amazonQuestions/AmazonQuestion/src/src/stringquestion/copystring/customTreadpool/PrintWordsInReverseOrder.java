package src.stringquestion.copystring.customTreadpool;

import java.util.Stack;

public class PrintWordsInReverseOrder {
	public static void main(String[] args) {
		String s="my name is vinay";
		reverse(s);
		String ss = "vinay kumar";
		System.out.println();
		System.out.println(new StringBuffer(ss).reverse());
		 s="my name is vinay";
		reverseWordUsingStack(s);
		String str ="vinay";
		reverseWithXor(str);
		String num = Integer.toString(15);
		System.out.println(num.toString());
		
		
	}
	
	public static void reverseWithXor(String str)
	{
		int l=0,h=str.length()-1;
		char[] ch = str.toCharArray();
		System.out.println();
		System.out.println(" reverse using xor\n");
		while(l<h)
		{
			ch[l]=(char) (ch[l]^ch[h]);
			ch[h] = (char) (ch[h]^ch[l]);
			ch[l] = (char) (ch[l]^ch[h]);
			l++;
			h--;
		}
		
		System.out.println(String.valueOf(ch));
	}
	public static void reverseWordUsingStack(String s)
	{
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				while(st.isEmpty() == false)
				{
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
			else
			{
				st.push(s.charAt(i));
			}
		}
		while(st.isEmpty() == false)
		{
			System.out.print(st.pop());
		}
	}
	public static void reverse(String s)
	{
		String words[] = s.split(" ");
		int l=0,h=words.length-1;

		while(l<h)
		{
			String temp = words[l];
			words[l] = words[h];
			words[h] = temp;
			l++;
			h--;
		}
		for(String ss:words)
		{
			reverseChar(ss);
		}
	}

	public static void reverseChar(String rev)
	{
		char[] ch = rev.toCharArray();
		int l=0,h=ch.length-1;
		while(l<h)
		{
			char c = ch[l];
			ch[l] = ch[h];
			ch[h] = c;
			l++;
			h--;
		}
		System.out.print(" "+String.valueOf(ch));
	}
}
