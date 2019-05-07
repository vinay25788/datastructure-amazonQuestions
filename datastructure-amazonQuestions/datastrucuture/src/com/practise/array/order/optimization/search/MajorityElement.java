package com.practise.array.order.optimization.search;

public class MajorityElement {

	public static void main(String[] args) {
		int[] a= {1,2,2,2,2,3,4,2};
		findMajority(a);
	}
	
	public static void findMajority(int[] a	)
	{
		int maj=0;
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[maj]== a[i])
			{
				count++;
			}
			else
				count--;
			if(count ==0)
			{
				maj=i;
				count=1;
			}
		}
		
		count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[maj]== a[i])
				count++;
		}
		if(count > a.length/2)
			System.out.println(" majority Element "+a[maj]);
		else
			System.out.println(" no majority element ");
	}
}
