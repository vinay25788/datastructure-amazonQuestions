package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumSwapREquiredToSortAnArray {
	public static void main(String[] args) {
		int[] a={5,3,2,1,0};
		minSwap(a);
	}
	public static void minSwap(int[] a)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i], i);
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			a[i] = map.get(a[i]);
		}
		map = null;
		int swap=0;
		for(int i=0;i<a.length;i++)
		{
			int val = a[i];
			if(val<0)continue;
			while(val!=i)
			{
				int newVal = a[val];
				a[val] = -1;
				val =newVal;
				swap++;
			}
			a[i] =-1;
		}
		System.out.println("required Swap "+swap);
	}

}
