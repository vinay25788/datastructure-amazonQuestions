package com.src.dynamicprogramming;

import java.util.ArrayList;
import java.util.Iterator;

class Interval 
{
	int buy;
	int sell;
}
public class StockBuySell {

	public static void main(String[] args) {
		int price[] = {10,9,8,100, 180, 260, 310, 40,5,10,15, 535, 695}; 
		maxPrice(price);
	}
	public static void maxPrice(int[] price)
	{
		
		ArrayList<Interval> list = new ArrayList<>();
		int i=0;
		int n = price.length;
		int count =0;
		while(i<n)
		{
			while(i<n-1 && price[i+1]<=price[i])
				i++;
			if(i== n-1)
				break;
			Interval in = new Interval();
			in.buy = i++;
			while(i<n && price[i]>= price[i-1])
				i++;
			in.sell = i-1;
			list.add(in);
			count++;
		}
		
		Iterator<Interval> it = list.iterator();
		while(it.hasNext())
		{
			Interval sol = it.next();
			System.out.println(sol.buy+" "+sol.sell);
		}
	}
}
