package src.stringquestion.copystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Panagram2 {

	public static void main(String[] args) {
		/*
		 *we promptly judged antique ivory buckles for the next prize
we promptly judged antique ivory buckles for the prizes
the quick brown fox jumps over the lazy dog
the quick brown fox jump over the lazy dog
		 */
		List<String> strings = new ArrayList<>();
		strings.add("we promptly judged antique ivory buckles for the next prize");
		strings.add("we promptly judged antique ivory buckles for the prizes");
		strings.add("the quick brown fox jumps over the lazy dog");
		strings.add("the quick brown fox jump over the lazy dog");
		System.out.println(find(strings));
	}
	
	public static String find(List<String> strings	)
	{
		boolean ch[] = new boolean[26];
	    StringBuffer sb = new StringBuffer();
	    int index =0;
	    for(String st:strings)
	    {
	    	st =st.toLowerCase();
	        for(int i=0;i<st.length();i++)
	        {
	             if ('a' <= st.charAt(i) && st.charAt(i)<='z') {
	                    index = st.charAt(i) - 'a';
	            }
	            ch[index] = true;
	        }
	        boolean check = true;
	        for(int i=0;i<26;i++)
	        {
	            if(ch[i]==false)
	            {
	                check =false;
	                break;
	            }
	        }
	        if(!check)
	        sb.append("0");
	        else
	        sb.append("1");
	        
	        Arrays.fill(ch, false);
	    }
	    return sb.toString();

	    }
	}

