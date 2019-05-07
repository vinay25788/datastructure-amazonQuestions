package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class BiggerNumber {
	public static void main(String[] args) {
		String [] a= {"54","546","548","60"};
		List<String> list = Arrays.asList(a);
		java.util.Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String x, String y) {
				// TODO Auto-generated method stub
				String xy = x+y;
				String yx = y+x;
				
				//if(xy<yx)
			
				
				return xy.compareTo(yx)<0?1:-1;
			}
		});
		
		for(String st:list)
		{
		System.out.print(""+st);
		}
	}
}
 