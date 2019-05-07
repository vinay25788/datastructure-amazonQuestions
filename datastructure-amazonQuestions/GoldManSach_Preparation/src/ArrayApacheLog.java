import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class ArrayApacheLog {
	public static void main(String[] args) {
		String lines[] = new String[] {
		        "10.0.0.1 - log entry 1 11",
		        "10.0.0.1 - log entry 2 213",
		        "10.0.0.2 - log entry 133132" };
		
		System.out.println(findIp(lines));
	}
	public static String findIp(String[] line)
	{
		Map<String,Integer> map = new HashMap<>();
		Arrays.stream(line).forEach(p->{
			String ip = p.split(" ")[0];
			int count = map.getOrDefault(ip, 0);
			map.put(ip, count+1);
		});
		
		int max = map.entrySet().stream().max((p1,p2)->p1.getValue()>p2.getValue()?1:-1).get().getValue();
		
		StringJoiner st = new StringJoiner(",");
		
		map.entrySet().stream().filter(p->p.getValue()== max).sorted((p1,p2)->p1.getValue()>p2.getValue()?1:-1).forEach(p->st.add(p.getKey()));
		return st.toString();
	}
}
