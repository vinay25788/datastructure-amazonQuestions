package src.stringquestion.copystring.customTreadpool;

import java.util.HashMap;
import java.util.Map;

class Pairs
{
	int first;
	int second;
}
public class FindFourLetInArray {
	
	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 1, 2};
		find(a,91);
	}
	public static void find(int[] a,int X)
	{
		Map<Integer,Pairs> map = new HashMap<>();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum= a[i]+a[j];
				Pairs pair = new Pairs();
				pair.first=i;
				pair.second =j;
				map.put(sum, pair);
			}
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum = a[i]+a[j];
				if(map.containsKey(X-sum))
				{
					Pairs pair = map.get(X-sum);
					if(pair.first !=i && pair.first !=j && pair.second !=i && pair.first !=j)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[pair.first]+" "+a[pair.second]);
						return;
					}
				}
				
			}
		}
	}

}
