
public class AtoI {

	public static void main(String[] args) {
		String st="-123";
		find(st);
	}
	public static void find(String st)
	{
		int result =0;
		int multiplier=1;
		int length =st.length();
		int i=0;
		if(length !=0 && st.charAt(i)=='-')
		{
			multiplier=-1;
			i++;
			
		}
		for(;i<length;i++)
		{
			int c=st.charAt(i)-'0';
			if(c<0 && c>9)
				break;
			result=result*10+c;
		}
		
		result =result*multiplier;
		System.out.println(result);
	}
}
