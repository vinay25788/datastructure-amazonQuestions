package com.src.dynamicprogramming;

import java.util.ArrayList;

public class StockBuySellArray {
public static void main(String[] args) {
	int price[] = {10,9,8,100, 180, 260, 310, 40,5,10,15, 535, 695}; 
	maxProfit(price);
}
public static void maxProfit(int[] price)
{
	ArrayList<Interval> list = new ArrayList<>();
	int i=0;
	int n= price.length;
	int count=0;
	while(i<n)
	{
		while(i<n-1 && price[i+1]<=price[i])
			i++;
		if(i== n-1)
			break;
		Interval in = new Interval();
		in.buy = i++;
		while(i<n-1 && price[i]>=price[i-1])
			i++;
		in.sell = i-1;
		list.add(in);
		count++;
	}
	System.out.println(count);
	for(Interval in:list)
	{
		System.out.println(in.buy+":"+in.sell);
	}
}
}
