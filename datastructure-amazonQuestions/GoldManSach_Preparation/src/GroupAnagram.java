import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupAnagram {
	static String input = "cat dog tac sat tas god dog";
	public static void main(String[] args) {
		
		groupAnagram();
	}
	public static void groupAnagram()
	{
		Map<String,List<String>> map = new TreeMap<>();
		String[] arr = input.split(" ");
		List<String> list;
		for(String s:arr)
		{
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			String key= String.valueOf(ch);
			
			if(map.containsKey(key))
			{
				 list = map.get(key);
				list.add(s);
			}
			else
			{
				list = new ArrayList<>();
				list.add(s);
				
			}
			map.put(key, list);
		}
		map.entrySet().stream().forEach(i->System.out.println(i.getValue()));
		System.out.println();
		List<String > addAll = new ArrayList<>();
		for(Map.Entry<String, List<String>> entry:map.entrySet())
		{
			List<String> lis=entry.getValue();
			
			addAll.addAll(lis);
				
			//System.out.print(mapValues);
		}
		String mapValues = String.join(",", addAll);
		System.out.println(mapValues);
	}
}
