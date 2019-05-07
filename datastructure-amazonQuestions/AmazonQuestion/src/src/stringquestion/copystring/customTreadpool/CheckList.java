package src.stringquestion.copystring.customTreadpool;

import java.util.ArrayList;
import java.util.List;


class Test2
{
	public void meth(List list)
	{
		list.add("vinay");
		Integer i = (Integer) list.get(2);
		System.out.println(list);
	}
}

public class CheckList {

	public static void main(String[] args) {
		List<Integer > list = new ArrayList<>();
		list.add(1);
		list.add(2);
		Test2 obj = new Test2();
		obj.meth(list);
	}
}
