package src.stringquestion.copystring.customTreadpool;

import java.util.ArrayList;
import java.util.List;

class Stock
{
	int buy;
	int sell;
}
public class StockBuySell {
	public static void main(String[] args) {
		  int price[] = {2, 30, 15, 10, 8, 25, 80}; 
		  find(price);
	}
	
	public static void find(int[] price)
	{
		List<Stock> list = new ArrayList<>();
		
		int i=0;
		int n=price.length;
		while(i<n)
		{
			while(i<n-1 && price[i+1]<=price[i])
				i++;
			if(i==n-1)
				break;
			Stock st = new Stock();
			st.buy=price[i++];
			while(i<n && price[i]>=price[i-1])
				i++;
			st.sell=price[i-1];
			list.add(st);
			
		}
		int profit=0;
		for(Stock st:list)
		{
			profit+=st.sell-st.buy;
			System.out.println(st.buy+" "+st.sell);
		}
		System.out.println(profit);
	}

}
