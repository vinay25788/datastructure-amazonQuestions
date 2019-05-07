package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SwapRequiredTocompleteSortArray {
	public static void main(String[] args) {
		int[] a= {15,2,3,10,14,11};
		findSwap(a);
	}
	
	public static void findSwap(int[] a)
	{
		int n=a.length;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++)
			map.put(a[i], i);
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = map.get(a[i]);
		}
		
		int val=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			val = a[i];
			if(val<0)
				continue;
			while(val!=i)
			{
				int nextval = a[val];
				a[val] = -1;
				val = nextval;
				count++;
			}
			a[val] =-1;
		}
		System.out.println(count);
	}

}
