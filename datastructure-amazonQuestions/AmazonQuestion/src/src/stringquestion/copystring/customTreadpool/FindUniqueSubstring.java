package src.stringquestion.copystring.customTreadpool;

public class FindUniqueSubstring {
	
	public static void main(String[] args) {
		String str = "ABDEFGABEF"; 
		System.out.println(findUnique(str));
	}
	
	public static int findUnique(String str)
	{
		int cur_len=0;
		int i=0;
		int max_len=Integer.MIN_VALUE;
		int prev_index=0;
		int[] visited = new int[256];
		visited[str.charAt(i)] = 0;
		for(i=0;i<256;i++)
			visited[i] =-1;
		for(i=1;i<str.length();i++)
		{
			prev_index = visited[str.charAt(i)];
			if(prev_index == -1 || i-cur_len > prev_index)
				cur_len++;
			else
			{
				if(cur_len>max_len)
					max_len = cur_len;
				
				cur_len = i-prev_index;
			}
			visited[str.charAt(i)] = i;
		}
		
		if(cur_len > max_len)
			max_len = cur_len;
		
		return max_len;
	}
	

}
