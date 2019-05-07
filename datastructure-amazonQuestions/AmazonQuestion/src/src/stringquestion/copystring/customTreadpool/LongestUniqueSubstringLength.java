package src.stringquestion.copystring.customTreadpool;

public class LongestUniqueSubstringLength {
	
	public static void main(String[] args) {
		String st = "ABDEFGABEF";
		findLength(st);
		
	}

	public static void findLength(String st)
	{
		int cur_length=0;
		int max_length= Integer.MIN_VALUE;
		int prev_index = 0;
		int count=0;
		int [] visited = new int[256];
		for(int i=0;i<256;i++)
			visited[i] = -1;
		visited[st.charAt(0)]=0;
		for(int i=1;i<st.length();i++)
		{
			prev_index = visited[st.charAt(i)];
			if(prev_index  ==-1 || i-cur_length>prev_index)
				cur_length++;
			else {
					if(cur_length>max_length)
						max_length = cur_length;
					cur_length = i-prev_index;
				}
			visited[st.charAt(i)] = i;
		}
		if(cur_length>max_length)
			max_length = cur_length;
		
		System.out.println(max_length);
	}
}
