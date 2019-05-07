import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Num implements Comparable<Num>
{
	int val;
	int count;
	Num(int val,int count)
	{
		this.val =val;
		this.count =count;
	}
	@Override
	public int compareTo(Num o) {
		// TODO Auto-generated method stub
		int freq = this.count<o.count?-1:1;
		//int val = this.val <o.val?-1:1;
		
		
		return freq;
		
		/*if(freq==0)
			return freq;
		else
			return val;*/
	}
	
}
public class KMostOccuringNumber {
	public static void main(String[] args) {
		int[] a= {1,2,2,2,1,1,4,4,4,4,5,6,7,8,9};
		int k=3;
		find(a,k);
	}
	public static void find(int[] a,int k)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int el:a)
		{
			if(map.containsKey(el))
			{
				map.put(el, map.get(el)+1);
			}
			else
				map.put(el, 1);
			
			
		}
		
		PriorityQueue<Num> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			Num n= new Num(entry.getKey(),entry.getValue());
			pq.add(n);
		}
		
		while(k>0)
		{
			Num nu = pq.poll();
			System.out.println(nu.val);
			int fre = nu.count;
			if(fre>0)
			{
			  nu.count--;
			  pq.add(nu);
			}
			k--;
			
		}
	}

}
