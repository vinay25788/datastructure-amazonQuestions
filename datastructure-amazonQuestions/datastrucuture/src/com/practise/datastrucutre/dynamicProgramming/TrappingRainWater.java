package com.practise.datastrucutre.dynamicProgramming;

public class TrappingRainWater {

		public static void main(String[] args) {
			int arr[] = {0, 1, 0, 2, 1, 0, 1, 
		            3, 2, 1, 2, 1}; 
		int n = arr.length; 
		System.out.println("maximum "+findTrappingWater(arr,n));
		}

		private static int findTrappingWater(int[] a, int n) {
			// TODO Auto-generated method stub
			int result =0;
			int lo =0,hi = n-1;
			
			int leftmax =0,rightmax =0;
			while(lo<=hi)
			{
				if(a[lo]<a[hi])
				{
				
					if(a[lo]>leftmax)
					{
						leftmax = a[lo];
					}
					else
						result+=leftmax-a[lo];
					
					lo++;
				}
				else
				{
					if(a[hi]>rightmax)
					{
						rightmax = a[hi];
					}
					else
						result +=rightmax -a[hi];
					hi--;
				}
			}
			
			return result;
		}

}
