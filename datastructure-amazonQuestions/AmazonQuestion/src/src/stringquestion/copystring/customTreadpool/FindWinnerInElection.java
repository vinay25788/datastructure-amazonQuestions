package src.stringquestion.copystring.customTreadpool;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindWinnerInElection {
	public static void main(String[] args) {
		 String[] votes = { "john", "johnny", "jackie", 
                 "johnny", "john", "jackie", 
                 "jamie", "jamie", "john", 
                 "johnny", "jamie", "johnny", 
                 "john" }; 

findWinner(votes); 

	}
	public static void findWinner(String[] vote)
	{
		Map<String,Integer> map = new HashMap<>();
		int maxVote=Integer.MIN_VALUE;
		String winner = null;
		for(String v:vote)
		{
			if(map.containsKey(v))
			{
				map.put(v, map.get(v)+1);
				
				
			}
			else
				map.put(v, 1);
			
			
		}
		
		for(Entry<String,Integer> entry:map.entrySet())
		{
			String key= entry.getKey();
			int val= entry.getValue();
			if(maxVote<val)
			{
				maxVote=entry.getValue();
				winner=key;
			}
			else if (maxVote== val && winner.compareTo(key)>0)
			{
				winner = key;
			}
		}
		System.out.println("winner "+winner);
		
	}
}
