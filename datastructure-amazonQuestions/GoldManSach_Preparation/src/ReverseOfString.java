
public class ReverseOfString {

	public static void main(String[] args) {
		String s="vinay kumar";
		System.out.println(reverse(s));
		System.out.println(reverseSentence(s));
	}
	public static String reverse(String s)
	{
		int l=0;
		int r = s.length()-1;
		char[] ch = s.toCharArray();
		while(l<r)
		{
			char temp = ch[l];
			ch[l] = ch[r];
			ch[r ] = temp;
			l++;
			r--;
			
		}
		return String.valueOf(ch);
	}
	public static String reverseSentence(String s)
	{
		int l=0;
		
		String[] ar = s.split(" ");
		int r=ar.length-1;
		while(l<r)
		{
			String temp = ar[l];
			ar[l] = ar[r];
			ar[r] = temp;
			l++;
			r--;
		}
		String finalv = String.valueOf(ar).toString();
		return finalv;
	}
}
