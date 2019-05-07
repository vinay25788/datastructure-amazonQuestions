import java.util.ArrayList;
import java.util.Iterator;

class Interval
{
	int buy;
	int sell;
	@Override
	public String toString() {
		return "Interval [buy=" + buy + ", sell=" + sell + "]";
	}
	
}
public class StockBuyAndSel {
	public static void main(String[] args) {
		int[] a= {100,180,260,310,40,535,695};
		findProfit(a);
	}
	
	public static void findProfit(int[] a)
	{
		int i=0;
		int n=a.length;
		ArrayList<Interval> list = new ArrayList<>();
		while(i<n)
		{
			while(i<n-1 && a[i+1]<=a[i])
				i++;
			if(i==n-1)
				break;
			Interval sol = new Interval();
			sol.buy=a[i++];
			while(i<n && a[i]>a[i-1])
				i++;
			sol.sell = a[i-1];
			
			list.add(sol);		
		}
		System.out.println(list);
		Iterator<Interval> it = list.iterator();
		int sum=0;
		while(it.hasNext())
		{
			Interval in = it.next();
			sum+=in.sell-in.buy;
		}
		System.out.println(sum);
	}
}
