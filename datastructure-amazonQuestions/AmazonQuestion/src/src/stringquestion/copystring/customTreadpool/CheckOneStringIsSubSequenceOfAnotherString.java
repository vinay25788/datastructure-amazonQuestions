package src.stringquestion.copystring.customTreadpool;

public class CheckOneStringIsSubSequenceOfAnotherString {
	public static void main(String[] args) {
		String st ="vnayi";
		String s="iv";
		func(st,s);
	}
	
	public static void func(String st,String s)
	{
		int j=0;
		for(int i=0;i<st.length()&& j<s.length();i++)
		{
			if(st.charAt(i)== s.charAt(j))
			{
				j++;
			}
			if(j== s.length())
			{
				System.out.println(" yes ");
				return;
			}
		}
			
	}
	

}
