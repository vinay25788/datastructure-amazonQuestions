import java.util.LinkedHashSet;
import java.util.Set;

public class AlienDictionary {

	public static void main(String[] args) {
		  String[] words = {"caa", "aaa", "aab"}; 
		  Set<Character> set= new LinkedHashSet<>();
		  for(String word: words)
		  {
			  for(int i=0;i<word.length();i++)
			  {
				  if(!set.contains(word.charAt(i)))
				  {
					  set.add(word.charAt(i));
				  }
			  }
		  }
		  System.out.println(set);
	}
}
