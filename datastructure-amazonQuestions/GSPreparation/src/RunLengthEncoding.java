
public class RunLengthEncoding {
	public static void main(String[] args) {
		String str ="AAABBCCCCAA";
		findEncoding(str);
	}
	public static void findEncoding(String str)
	{
		int i=1;
		StringBuilder sb = new StringBuilder();
		while(i<str.length())
		{
			int count=1;
			while(i<str.length()&& str.charAt(i-1)== str.charAt(i))
				{
				count++;
				i++;
				}
			sb.append(str.charAt(i-1)).append(count);
			
			i++;
			
		}
		System.out.println(sb.toString());
	}

}
