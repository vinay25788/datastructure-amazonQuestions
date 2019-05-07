package com.practise.arrayRotations;

import java.util.HashMap;
import java.util.Map;

public class MaximumLengthSubArrayWithEqual0s1s {
	public static void main(String[] args) {
		int a[] = {1, 0, 0, 1, 0, 1, 1};
		findLength(a);
	}
	public static void findLength(int[] a)
	{
		int max=0;
		int n= a.length;
		int sum=0;
		Map<Integer,Integer> map = new HashMap<>();
		int maxLength=0;
		int endingIndex =0;
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = (a[i]==0)?-1:1;
		}
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(sum==0)
			{
				endingIndex = i;
				maxLength=i+1;
			}
			
			if(map.containsKey(sum+n))
			{
				if(maxLength < i-map.get(sum+n))
				{
					maxLength = i-map.get(sum+n);
					endingIndex =i;
				}
			}
			else
				map.put(sum+n,i	);
		}
			for(int i=0;i<n;i++)
				a[i] = (a[i]==-1)?0:1;
			
			int end = endingIndex-maxLength+1;
			System.out.println("from "+end+" to "+endingIndex);
		}
	}


