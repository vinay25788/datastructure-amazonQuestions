package com.practise.arrayRotations;

public class FindMajority {
	public static void main(String[] args) {
		 int a[] = new int[]{2, 2, 1, 1, 1, 2, 2}; 
		 int cand = find(a);
		 if(isMajority(a,cand))
			 System.out.println(cand);
		 else
		 System.out.println(" no  majority ");
	}
	
	public static boolean isMajority(int[] a,int cand)
	{
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]== cand)
			{
				count++;
			}
		}
		return count >= a.length/2 ?true:false;
	}
	public static int find(int[] a)
	{
		int maj_ind =0, count=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[maj_ind] == a[i])
			{
				count++;
			}
			else
				count--;
			if(count == 0)
			{
				maj_ind = i;
				count =1;
			}
		}
		return a[maj_ind];
	}
}
