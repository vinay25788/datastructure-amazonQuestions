package com.practise.array.order.optimization;

public class MinimumNumberOfOperationTomakePallindrome {
	
	public static void main(String[] args) {
		int[] a= {1,4,5,9,1};
		findOperation(a,a.length-1);
	}
	
	public static void findOperation(int[] a,int n)
	{
		int operation=0;
		
		int i=0;
		int j=n;
		for(; i<=j;)
		{
			if(a[i] == a[j])
			{
				i++;
				j--;
			}
			else if( a[i] > a[j])
			{
				j--;
				a[j] +=a[j+1];
				operation++;
			}
			else
			{
				i++;
				a[i] +=a[i-1];
				operation++;
			}
		}
		
		System.out.println("number of operaiton required -->"+operation);
	}

}
