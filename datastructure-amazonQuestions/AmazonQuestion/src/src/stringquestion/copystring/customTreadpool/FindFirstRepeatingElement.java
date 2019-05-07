package src.stringquestion.copystring.customTreadpool;

import java.util.HashSet;

public class FindFirstRepeatingElement {
	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 4, 3, 5, 6}; 
		find(arr);
	}
	public static void find(int[] a)
	{
		HashSet<Integer> set = new HashSet<>();
		int el=0;
		for(int i=a.length-1;i>=0;i--)
		{
			if(set.contains(a[i]))
			{
				el=a[i];
			}
			set.add(a[i]);
		}
		System.out.println(el);
	}

}
