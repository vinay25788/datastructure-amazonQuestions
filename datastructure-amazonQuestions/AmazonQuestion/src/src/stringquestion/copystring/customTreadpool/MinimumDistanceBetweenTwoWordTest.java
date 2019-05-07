package src.stringquestion.copystring.customTreadpool;

public class MinimumDistanceBetweenTwoWordTest {
	public static void main(String[] args) {
		String words ="vinay is my hello name is vb cd vinay aaa name";
		find(words,"vinay","name");
	}
	public static void find(String word,String first,String second)
	{
		String[] words=word.split(" ");
		int i=0;
		int prev =0;
		int n=words.length;
		int min_distance = Integer.MAX_VALUE;
		for(;i<n;i++)
		{
			if(words[i].equalsIgnoreCase(first) || words[i].equalsIgnoreCase(second))
			{
				prev =i;
				break;
			}
		}
		i++;
		for(;i<n;i++)
		{
			if(words[i].equalsIgnoreCase(first) || words[i].equalsIgnoreCase(second))
			{
				if(!words[i].equalsIgnoreCase(words[prev]) && min_distance>i-prev)
				{
					min_distance =i-prev;
					prev =i;
					
				}
				else
					prev =i;
			}
		}
		System.out.println(min_distance);
	}

}
