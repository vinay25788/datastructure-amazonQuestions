import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class One implements Comparable
{
	int id;
	String name;
	One(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	One()
	{}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		One o1 = (One) o;
		if(this.id<o1.id)
			return -1;
		if(this.id>o1.id)
			return 1;
		
		return 0;
	}
	
	
	
	
}

class Test
{
	private final HashMap<Integer,String> map;
	Test(HashMap<Integer,String> map)
	{
		HashMap<Integer,String> newMap = (HashMap<Integer, String>) map.clone();
		this.map = newMap;
	}
	
	HashMap<Integer,String> getMap()
	{
		HashMap<Integer,String> newMap = (HashMap<Integer, String>) map.clone();
		return newMap;
	}

	@Override
	public String toString() {
		return "Test [map=" + map + "]";
	}
	
}
public class HasCodeAndEqualsDmo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> ma = new HashMap<Integer,String>();
		ma.put(1, "vinay");
		Test t = new Test(ma);
		System.out.println(t.toString());
	String val =	t.getMap().get(1);
		ma.put(1, "kumar");
		System.out.println(t.toString());
		Set<One> set = new TreeSet<>();
		One o1 = new One(1,"vinay");
		One o2 = new One(2,"kumar");
		set.add(o1);
		set.add(o2);
		System.out.println(set);
		List<Integer> lis = new ArrayList<>();
		lis.add(1);
		lis.add(15);
		HashMap<String,String> map;
		Collections.sort(lis, Collections.reverseOrder());
		System.out.println(lis);
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list.add("vinay");
		list2.add("kumar");
		try
		{
			throw new Error();
		}catch(Error er)
		{
			throw new Error();
			//er.printStackTrace();
		}
		/*if(list.equals(list2))
			System.out.println(true);
		else
			System.out.println(false);*/
	}
}
