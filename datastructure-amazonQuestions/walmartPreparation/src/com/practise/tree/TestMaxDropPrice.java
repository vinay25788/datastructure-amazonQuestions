package com.practise.tree;

import java.util.ArrayList;
import java.util.List;

class Interval
{
	int max;
	int min;
}
public class TestMaxDropPrice {
	public static void main(String[] args) {
		//int[] a= {21, 19, 24, 32, 30, 31, 34, 31, 31, 26, 29};
		int[] a= {1,30,10,33,31};
		find(a);
	}
	public static void find(int[] a)
	{
		int n=a.length;
		int min=Integer.MIN_VALUE;
		int curDiff=Integer.MAX_VALUE;
		List<Interval> list = new ArrayList<>();
		for(int i=0;i<n;)
		{
			while(i<n-1 && a[i]<a[i+1])
			{
				i++;
			}
			if(i==n-1)
				break;
			Interval val = new Interval();
			val.max=a[i++];
			while(i<n-1 && a[i]>=a[i+1])
				i++;
			if(i<n) {
				val.min=a[i++];
				curDiff = val.max-val.min;
				if(curDiff>min)
					min=curDiff;
			}
			
		}
		System.out.println(min);
	}

}
