package src.stringquestion.copystring;

public class Panagram {
	
	static  final int  MAX = 26;
	
	public static void pana(String st)
	{
		boolean[] ch = new boolean[MAX];
		int index =0;
		for(int i=0;i<st.length();i++)
		{
			if('A' <= st.charAt(i) && st.charAt(i) <='Z')
			index = st.charAt(i)-'A';
			if('a' <= st.charAt(i) && st.charAt(i) <='z')
				index = st.charAt(i)-'a';
			ch[index] = true;
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == false)
			{
				System.out.println(" false not panagram ");
				return;
			}
		}
		System.out.println(" its is panagram ");
	}
	
	public static void main(String[] args) {
	
		String str = "The quick brown fox jumps over the lazy dog";
		pana(str);
	}

}
