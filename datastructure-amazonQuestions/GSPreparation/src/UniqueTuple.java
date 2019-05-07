import java.util.HashSet;
import java.util.Set;

public class UniqueTuple {
	public static void main(String[] args) {
			String str ="aaabbb";
			findUnique(str,2);
	}
	public static void findUnique(String str,int len)
	{
		Set<String> set = new HashSet<>();
		for(int i=0;i<str.length()-len+1;i++)
		{
			set.add(str.substring(i, i+len));
		}
		System.out.println(set);
	}
}
