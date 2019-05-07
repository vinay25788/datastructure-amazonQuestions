package com.practise.stack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeInterval {
	
	static class Interval
	{
		int first;
		int second;
		public Interval(int first,int second) {
			// TODO Auto-generated constructor stub
			this.first = first;
			this.second = second;
		}
	}

	public static class IntervalComparator implements Comparator<Interval>
	{
		
		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			int a = o1.first;
			int b = o2.first;
			return a<b?-1:1;
		}
		
	}
	
	Stack<Interval> st = new Stack<>();
	
	public void merge(Interval[] intervals)
	{
		IntervalComparator com = new IntervalComparator();
		Arrays.sort(intervals, com);
		for(int i=0;i<intervals.length;i++)
		{
			if(st.isEmpty() == false)
			{
				st.push(intervals[i]);
			}
			else
			{
				Interval inter1 = st.peek();
				
				if(inter1.second < intervals[i].second)
				{
					Interval latest = st.pop();
					
					latest.second = intervals[i].second;
					
					st.push(latest);
				}
				else
				{
					st.push(intervals[i]);
				}
				
			}
		}
		
		
	}
	
	public void print()
	{
		while(st.size()>0)
		{
			Interval va = st.pop();
			System.out.println("{"+va.first+" ,"+va.second+"}");
		}
	}
	
	public static void main(String[] args) {
		Interval arr[] =  new Interval[5];
		
		
			arr[0] = new Interval(6,8);
			arr[0] = new Interval(1,9);
			arr[0] = new Interval(2,4);
			arr[0] = new Interval(4,7);
			MergeInterval ob = new MergeInterval();
			ob.merge(arr);
			ob.print();
	}
}




















