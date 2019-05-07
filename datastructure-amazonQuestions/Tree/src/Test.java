import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		int[] a= {4353};
		findNumber(a);
	}
	public static void findNumber(int[] a)
	{
		TreeSet<Integer> set= new TreeSet<>();
		for(int e:a)
		{
			String st=String.valueOf(e);
			if(st.contains("1") && st.contains("2")&& st.contains("3"))
			{
				set.add(e);
			}
		}
		String st=new String();
		List<String> list = new ArrayList<>();
		for(int i:set)
		{
		list.add(String.valueOf(i));
		}
		
		String result = String.join(",", list);
		if(list.size()==0)
			System.out.println("-1");
			
		System.out.println(st.join(",", list));
	}
	
	
}
