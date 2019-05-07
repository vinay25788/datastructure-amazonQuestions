import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class ApacheLogIPAddress {

	public static void main(String[] args) {
		String lines[] = new String[] {
		        "10.0.0.1 - log entry 1 11",
		        "10.0.0.1 - log entry 2 213",
		        "10.0.0.2 - log entry 133132" };
		    String result = findTopIpaddress(lines);
		    System.out.println(result);
	}
	public static String findTopIpaddress(String[] lines)
	{
		Map<String,Integer> map = new HashMap<>();
		Arrays.stream(lines).forEach(line->
		{
				String ipAddress = line.split(" ")[0];
				int count = map.getOrDefault(ipAddress, 0);
				map.put(ipAddress, count+1);
		});
		
		StringJoiner st = new StringJoiner(",");
		Integer max = map.entrySet().stream().max((p1,p2)->p1.getValue()>p1.getValue()?1:-1).get().getValue();
	map.entrySet().stream().filter(p->p.getValue() == max).sorted((p1,p2)->p1.getValue()>p1.getValue()?1:-1).forEach(p->st.add(p.getKey()));
		
		return st.toString();
	}
}
