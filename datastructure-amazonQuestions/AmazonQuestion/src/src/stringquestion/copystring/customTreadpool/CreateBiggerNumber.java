package src.stringquestion.copystring.customTreadpool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Comp implements Comparator<String>
{

	@Override
	public int compare(String x, String y) {
		// TODO Auto-generated method stub
		String xy=x+y;
		String yx = y+x;
		
		return xy.compareTo(yx)<0?1:-1;
	}
	 
}
public class CreateBiggerNumber {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		/*
		 *  arr.add("54"); 
        arr.add("546"); 
        arr.add("548"); 
        arr.add("60"); 
		 */
		list.add("54");
		list.add("546");
		list.add("548");
		list.add("60");
		Comp comp = new Comp();
		Collections.sort(list, comp);
		for(String st:list)
			System.out.print(st+"");
	}
  
}
