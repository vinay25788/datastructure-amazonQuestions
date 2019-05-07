
public class IsPowerOf10 {
	public static void main(String[] args) {
		System.out.println(find(1007));
	}
	public static boolean find(int x)
	{
		for(int i=1;i<=x;i*=10)
		{
			if(i==x)
				{
				return true;
				}
			if(i>Integer.MAX_VALUE/10)
				return false;
		}
		return false;
	}

}
