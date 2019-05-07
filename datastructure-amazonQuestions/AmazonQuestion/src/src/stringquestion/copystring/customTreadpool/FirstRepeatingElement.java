package src.stringquestion.copystring.customTreadpool;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,1};
		findRepeating(a);
	}
	public static void findRepeating(int[] a)
	{
		int min=-1;
		Set<Integer> set = new HashSet<>();	
		for(int i=a.length-1;i>=0;i--)
		{
			if(set.contains(a[i]))
				min=i;
			else
				set.add(a[i]);
		}
		System.out.println(a[min]);
	}

}
