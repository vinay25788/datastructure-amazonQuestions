package src.stringquestion.copystring.customTreadpool;

public class UrilyFyInJava {
	public static void main(String[] args) {
		String st ="vinay kumar s";
		urilyFy(st);
	}
	public static void urilyFy(String st)
	{
		int scount=0;
		int i=0;
		for( i=0;i<st.length();i++)
			if(st.charAt(i)==' ')
				scount++;
		i--;
		while(st.charAt(i) == ' ')
		{
			scount--;
			i--;
		}
		
		int newlength = i+ scount*2+1;
		char[] ch = new char[newlength];
		int index = newlength-1;
		for( i=st.length()-1;i>=0;i--)
		{
			if(st.charAt(i) == ' ') {
				ch[index] ='0';
				ch[index-1] ='2';
						ch[index-2] ='%';
						index = index-3;
			}
			else
			{
				ch[index] = st.charAt(i);
				index--;
			}
						
		}
		System.out.println(String.valueOf(ch));
	}

}
