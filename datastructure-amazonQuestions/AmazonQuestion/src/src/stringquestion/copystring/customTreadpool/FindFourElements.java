package src.stringquestion.copystring.customTreadpool;

import java.util.HashMap;
import java.util.Map;

class Pair
{
	int first;
	int second;
}
public class FindFourElements {
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 1, 2}; 
	   int n= arr.length; 
	    int x = 91; 
	    
	    findFour(arr,n,x);
	}
	
	public static void findFour(int[] a,int n,int x)
	{
		Map<Integer,Pair> map = new HashMap<>();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum = a[i]+a[j];
				Pair p = new Pair();
				p.first=i;
				p.second=j;
				map.put(sum, p);
			}
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum = a[i]+a[j];
				if(map.containsKey(x-sum))
				{
					Pair p = map.get(x-sum);
					if(p.first !=i && p.first != j	&& p.second!=i && p.second !=j)
					{
						System.out.println(a[p.first]+" "+a[p.second]+" "+a[i]+" "+a[j]);
					}
				}
			}
		}
	}
}
