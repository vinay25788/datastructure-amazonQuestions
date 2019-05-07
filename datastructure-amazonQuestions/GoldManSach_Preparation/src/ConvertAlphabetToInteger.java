
public class ConvertAlphabetToInteger {
	public static void main(String[] args) {
		String a="-1230";
		System.out.println(convert(a));
	}
	public static int convert(String a)
	{
		int result = 0;
		int i=0;
		int multiplier =1;
		
		if(a.length()!=0 && a.charAt(0)=='-')
		{
			multiplier=-1;
			i++;
		}
		
		for(;i<a.length();i++ )
		{
			int c = (a.charAt(i)-'0');
			if(c<0 || c>9)
				return -1;
			result = result*10+c;
		}
		result = result*multiplier;
		return result;
	}

}
