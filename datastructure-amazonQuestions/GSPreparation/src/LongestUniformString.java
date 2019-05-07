
public class LongestUniformString {
	public static void main(String[] args) {
		String str ="aabbbbbCdAA";
		findLength(str);
	}
	public static void findLength(String str)
	{
		int index=1;
		int maxLength=0;
		int startIndex=-1;
		while(index<str.length())
		{
			int count=1;
			int start = index-1;
			while(index<str.length() && str.charAt(index-1) == str.charAt(index))
			{
				count++;
				index++;
			}
			if(count>maxLength)
			{
				startIndex = start;
				maxLength = count;
			}
			index ++;
		}
		System.out.println(" sub "+str.substring(startIndex, startIndex+maxLength));
	}
}
