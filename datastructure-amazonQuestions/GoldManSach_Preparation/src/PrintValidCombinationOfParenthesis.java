import java.util.Arrays;

public class PrintValidCombinationOfParenthesis {

	public static void main(String[] args) {
		int n=3;
		char[] ch = new char[n*2];
		count(ch,n);
	}
	public static void count(char[] ch,int n)
	{
		if(n>0)
		{
			_printCount(ch,0,n,0,0);
		}
		return;
	}
	
	public static void _printCount(char[] ch,int pos,int n,int open,int close)
	{
		if(n== close)
		{
			System.out.println(Arrays.toString(ch));
			System.out.println();
			return;
		}
		else
		{
			if(open>close)
			{
				ch[pos] = '}';
				_printCount(ch, pos+1, n, open, close+1);
			}
			if(open<n)
			{
				ch[pos] ='{';
				_printCount(ch, pos+1, n, open+1, close);
			}
		}
	}
}
