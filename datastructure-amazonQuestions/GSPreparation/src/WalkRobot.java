
public class WalkRobot {

	public static void main(String[] args) {
		String str="ULDR";
		find(str);
	}
	public static void find(String str)
	{
		char[] ch = str.toCharArray();
		int[] result = {0,0};
		for(int i=0;i<str.length();i++)
		{
			switch(ch[i])
			{
			case'U': result[0]++;
						break;
			case'L': result[1]++;
			break;
			case'D': result[0]++;
			break;
			case'R': result[1]++;
			break;
			
			}
		}
		System.out.println(result[0] +" "+result[1]);
	}
}
