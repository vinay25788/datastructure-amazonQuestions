package src.stringquestion.copystring.customTreadpool;

public class PossibleStringWithSpaces {
	public static void main(String[] args) {
		String st ="ABCD";
		check(st);
	}
	public static void check(String st)
	{
		int n=st.length();
		char[] buf = new char[2*n];
		buf[0] = st.charAt(0);
		checkUtil(st,buf,1,1,n);
	}
	
	public static void checkUtil(String st,char[] buf,int i,int j,int n)
	{
		if(i== n)
		{
			buf[j] ='\0';
			System.out.println(String.valueOf(buf));
			return;
		}
		buf[j] = st.charAt(i);
		checkUtil(st, buf, i+1, j+1, n);
		buf[j] =' ';
		buf[j+1] = st.charAt(i);
		checkUtil(st, buf, i+1, j+2,n);
	}

}
