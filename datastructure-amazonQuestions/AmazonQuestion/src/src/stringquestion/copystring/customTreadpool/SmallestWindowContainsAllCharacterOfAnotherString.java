package src.stringquestion.copystring.customTreadpool;

public class SmallestWindowContainsAllCharacterOfAnotherString {
	
	public static void main(String[] args) {
		 String str = "this is a test string"; 
	        String pat = "tist"; 
	        
	        System.out.println(smallest(str,pat));
	}

	public static String smallest(String str,String pat)
	{
		int m= str.length();
		int n= pat.length();
		if(m<n)
		{
			System.out.println(" not possible ");
			return "Not present";
		}
		
		int[] hash_pat = new int[256];
		int[] hash_str = new int[256];
		
		for(int i=0;i<pat.length();i++)
			hash_pat[str.charAt(i)]++;
		
		int start =0,start_index=-1, minLength=Integer.MAX_VALUE;
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			hash_str[str.charAt(i)]++;
			if(hash_pat[str.charAt(i)] !=0 && hash_str[str.charAt(i)]<=hash_pat[str.charAt(i)])
				count++;
			if(count == n)
			{
				while(hash_str[str.charAt(start)] > hash_pat[str.charAt(start)] || hash_pat[str.charAt(start)] == 0)
					{
					if(hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
					hash_str[str.charAt(start)]--;
					start++;
					}
				
				int len_win = i-start+1;
				if(minLength>len_win)
					{
					minLength = len_win;
					start_index = start;
					}
			}
		}
		
		if(start_index == -1)
		{
			return "not Possible";
		}
		
		return str.substring(start_index, start_index+minLength);
		
	}
}
