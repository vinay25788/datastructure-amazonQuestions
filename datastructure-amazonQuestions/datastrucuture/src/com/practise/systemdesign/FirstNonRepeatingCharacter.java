package com.practise.systemdesign;

class A
{
	public void test()
	{
		System.out.println("a");
	}
}
class B extends A
{
	public void test()
	{
		System.out.println("B");
	}
}

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String str="viavav";
		findNonRepeating(str);
	}
	
	public static void findNonRepeating(String str)
	{
		A a = new B();
		a.test();
		String name = "vinay";
		char[] n = name.toCharArray();
		 //Character.is
		int[] ch = new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			ch[str.charAt(i)-'a']++;
		}
		
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch[str.charAt(i)-'a'] == 1)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

}
