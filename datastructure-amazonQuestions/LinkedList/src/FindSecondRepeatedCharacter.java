
public class FindSecondRepeatedCharacter {
	public static void main(String[] args) {
		String st ="vinayni";
		findSecond(st);
	}
	public static void findSecond(String st)
	{
		char[] ch = new char[256];
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			ch[st.charAt(i)]++;
			if(ch[st.charAt(i)]== 2)
			{
				count++;
			}
			if(ch[st.charAt(i)]== 2 && count==2)
			{
				System.out.println(st.charAt(i));
			}
		}
	}

}
