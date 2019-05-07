import java.util.ArrayList;
import java.util.List;

public class StockBuyAndSell {
	
	static class Stock
	{
		int buy;
		int sell;
	}

	public static void main(String[] args) {
		  int price[] = {100, 180, 260, 310, 40, 535, 695}; 
		  findProfit(price);
	}
	public static void findProfit(int[] price)
	{
		int start=0;
		int i=0;
		int n=price.length;
		List<Stock> list = new ArrayList<>();
		while(i<n-1)
		{
			while(i<n-1 && price[i+1]<=price[i])
				i++;
			if(i==n-1)
				break;
			Stock st = new Stock();
			st.buy = i++;
			while(i<n && price[i]>price[i-1])
				i++;
			st.sell=i-1;
			
			list.add(st);
		}
		
		int result=0;
		for(Stock st:list)
		{
			result = price[st.sell]-price[st.buy];
		}
		System.out.println(result);
	}
}
