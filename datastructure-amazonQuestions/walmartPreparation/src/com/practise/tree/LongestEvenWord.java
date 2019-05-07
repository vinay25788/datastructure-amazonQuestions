package com.practise.tree;

public class LongestEvenWord {
	public static void main(String[] args) {
		String st ="it is pleasant day today";
		find(st);
	}
	public static void find(String st)
	{
		String[] ch = st.split(" ");
		boolean first=false;
		String evenWord="";
		int maxLength=0;
		for(int i=0;i<ch.length;i++)
		{
			String word = ch[i];
			int length = word.length();
			
			if(length%2 ==0 && length>maxLength)
			{
				first=true;
				evenWord = ch[i];
				maxLength = length;
				//break;
			}
		}
		if(first)
			System.out.println(evenWord);
		else
			System.out.println("00");
	}

}
