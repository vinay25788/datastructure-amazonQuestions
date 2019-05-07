package com.src.datastructure.matrix;

public class MinimumJumToReachEnd {
	public static void main(String[] args) {
		int[] a= {2,3,1,1,2,4,2,0,1,1};
		minJumps(a);
	}
	public static void minJumps(int[] a)
	{
		int jumps=1,steps=0;
		steps = a[0];
		int i=1;
		int maxRech=a[0];
		while(i<a.length)
		{
			maxRech=Math.max(maxRech, a[i]+i);
			if(i>=a.length-1)
			{
				System.out.println(jumps);
				break;
			}
			steps--;
			if(steps == 0)
			{
				jumps++;
				
				if(i>=maxRech)
					break;
				
				steps = maxRech-i;
			}
			i=i+1;
		}
			
	}

}
