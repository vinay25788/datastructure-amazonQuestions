
public class FindPanagram {
	public static final int size=26;
	public static void main(String[] args) {

		//String str = "The quick brown fox jumps over the lazy dog";
		String str="";
		System.out.println(findPana(str));
	}
	public static boolean findPana(String str)
	{
		boolean isPana=true;
		int[] ch=new int[size];
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			ch[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<size;i++)
		{
			if(ch[i] == 0)
				isPana=false;
		}
		
		
		return isPana;
	}

}
