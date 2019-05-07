package src.stringquestion.copystring.customTreadpool;

public class LongestPallindromSubstring {
	public static void main(String[] args) {
		String st="bananas";
		int start=0;
		int low=1,high=0;
		int max=0;
		int end =0;
		for(int i=1;i<st.length();i++)
		{
			low = i-1;
			high =i;
			while(low>=0 && high<st.length() && st.charAt(low) == st.charAt(high))
			{
				if(high-low+1>max)
				{
					max = high-low+1;
					start = low;
					end = high;
				}
				low--;
				high++;
			}
			
			low = i-1;
			high =i+1;
			while(low>=0 && high<st.length() && st.charAt(low) == st.charAt(high))
			{
				if(high-low+1>max)
				{
					max = high-low+1;
					start = low;
					end = high;
				}
				low--;
				high++;
			}
			
		}
		System.out.println(st.substring(start, start+max));
	}

}
