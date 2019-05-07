package src.stringquestion.copystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Anagram {
	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
        listString.add("cat");
        listString.add("pencil");
        listString.add("now");
        listString.add("tac");
        listString.add("own");
        listString.add("act");
        listString.add("won");
        System.out.println(listString);
        Map<String,List<String>> map = new HashMap<>();
        List<String> list;
        
        for(String st:listString)
        {
        	char[] ch = st.toCharArray();
        	Arrays.sort(ch);
        	String val = String.valueOf(ch);
        	if(map.containsKey(val))
        	{
        		 list = map.get(val);
        	}
        	else
        	    list= new ArrayList<>();
        	
        	list.add(st);
        	map.put(val, list);
        }
        
        System.out.println(map);
        Map<Integer,String> ma = new HashMap<>();
        ma.put(1, "vinay");
        ma.put(2, "kumar");
        System.out.println(ma);
        for(Entry<String,List<String>> entry:map.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
	}

}
