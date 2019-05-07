package com.practise.array.order.optimization;

public class MinimumJumpSimple {
	public static void main(String[] args) {
		 int arr[] = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; 
		 int n= arr.length-1;
		 
		 findjum(arr,n)	;
		 
		 
	}

	public static void findjum(int[] a,int n)
	{
		if(a[0] == 0)
			{	
			System.out.println(" not able to proceed");
			return ;
			}
		int step = a[0];
		int jump=1;
		int maxReach=0;
		for(int i=1;i<=n;i++)
		{
			if(i== n)
			{
				System.out.println(" jump "+jump);
				return;
			}
			
			maxReach = Math.max(maxReach, i+a[i]);
			step--;
			
			if(step == 0)
			{
				jump++;
				if(i>maxReach)
				{
					System.out.println(" not able to come out ");
					return;
				}
				
				step = maxReach-i;
			}
		}
	}
}
