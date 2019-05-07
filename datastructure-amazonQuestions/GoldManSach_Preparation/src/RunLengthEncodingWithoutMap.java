
public class RunLengthEncodingWithoutMap {
	public static void main(String[] args) {
		String str ="aaabbbccca";
		System.out.println(findRunLength(str));
		System.out.println(findRunLeng(str));
	}
	public static String findRunLeng(String str)
	{
		int[] ch = new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			ch[str.charAt(i)]++;
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] !=0)
				sb.append((char)i).append(ch[i]);
		}
		return sb.toString();
	}
	public static String findRunLength(String str)
	{
		char lastSeen=0;
		int count=1;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char current = str.charAt(i);
			if(current==lastSeen)
				count++;
			else
			{
				if(lastSeen!=0)
				{
					sb.append(lastSeen).append(count);
				}
				count=1;
				lastSeen = current;
			}
		}
		sb.append(lastSeen).append(count);
		return sb.toString();
	}
	

}
