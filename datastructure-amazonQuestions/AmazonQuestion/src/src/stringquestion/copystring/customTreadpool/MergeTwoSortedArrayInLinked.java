package src.stringquestion.copystring.customTreadpool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrayInLinked {
	public static void main(String[] args) {
		List<Integer> a= Arrays.asList(1,2,3);
		List<Integer> b = Arrays.asList(2,3,5,6);
		List<Integer> c = merge(a,b);
	}
	public static List<Integer> merge(List<Integer> a,List<Integer> b)
	{
		List<Integer> list = new ArrayList<>();
		while(a.size()!=0 && b.size()!=0)
		{
			if(a.get(0)<=b.get(0))
			{
				list.add(a.get(0));
				a.remove(0);
			}
			else
			{
				list.add(b.get(0));
				b.remove(0);
			}
		}
		while(a.size()!=0)
		{
			list.add(a.get(0));
			a.remove(0);
		}
		while(b.size() !=0)
		{
			list.add(b.get(0));
			b.remove(0);
		}
	}

}
