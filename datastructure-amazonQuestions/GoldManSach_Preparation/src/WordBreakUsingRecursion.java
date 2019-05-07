import java.util.HashSet;
import java.util.Set;

public class WordBreakUsingRecursion {
	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		set.add("i");
		set.add("like");
		set.add("me");
		System.out.println(findWord("i like",set));
	}
	public static boolean findWord(String word1,Set<String> set)
	{
		String word = word1.trim();
		int size = word.length();
		if(size==0)
			return true;
		
		for(int i=1;i<=size;i++)
		{
			if(set.contains(word.substring(0,i))&& findWord(word.substring(i, size), set))
				return true;
		}
		return false;
	}

}
