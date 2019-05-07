package src.stringquestion.copystring.customTreadpool;

public class MinimumRotationRequiredToGetOriginalString {
	public static void main(String[] args) {
		String s ="vinay";
		//String v ="nayvi";
		System.out.println(check(s));
	}

	public static int check(String s)
	{
		int i=0;
		String con = s+s;
		for(i=1;i<=s.length();i++)
		{
			String temp = con.substring(i, con.length());
			if(temp == s);
			return i;
		}
		return s.length();
		
	}
}
