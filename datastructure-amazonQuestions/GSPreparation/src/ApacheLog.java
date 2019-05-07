import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class ApacheLog {
	public static void main(String[] args) {
		String lines[] = new String[] {
		        "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
		        "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
		        "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234" };
		
		findIp(lines);
	}
	
	public static void findIp(String[] lines)
	{
		Map<String,Integer> map = new HashMap<>();
		
		Arrays.stream(lines).forEach(line->{
			String ip=line.split(" ")[0];	
			if(map.containsKey(line))
			{
				map.put(line, 1+map.get(line));
			}
			map.put(ip, 0);
		});
		
		Integer max = map.entrySet().stream().max((p1,p2)->p1.getValue()>p2.getValue()?1:-1).get().getValue();
		StringJoiner sj=new StringJoiner(",");
		 map.entrySet().stream().filter(entry->max==entry.getValue()).sorted((p1,p2)->p1.getValue()>p2.getValue()?1:-1).forEach(p1->sj.add(p1.getKey()));
	System.out.println(sj.toString());
	}

}
