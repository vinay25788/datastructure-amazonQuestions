package com.src.dynamicprogramming;

public class DecodeString {
	public static void main(String[] args) {
		String st ="123";
		char[] ch = st.toCharArray();
		int n = ch.length;
	  findDecode(ch,n);
	}
	
	public static int findDecode(char[] ch,int n)//123
	{
		int count[] = new int[n+1];
		count[0] =1;
		count[1] =1;
		for(int i = 2;i <= n; i++)
		{
			if(ch[i-1] > '0')
			{
				count[i] = count[i-1];
			}
			if(ch[i-2] =='1' || (ch[i-2] == '2' && ch[i-1] <'7'))
			{
				count[i] = count[i]+count[i-2];
			}
		}
			
		System.out.println(count[n]);
		return count[n];
	}

}
