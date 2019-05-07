package com.practise.datastructure.Array.rotation;

public class RearrageElement {

	public static void main(String[] args) {
		 int a[] = {-1, -1, 6, 1,  
                 9, 3, 2, -1, 4,-1}; 
		for(int i=0;i<a.length;)
		{
			if(a[i] !=-1 && a[i] != i)
			{
				int ele = a[a[i]];
				a[a[i]] = a[i];
				a[i] = ele;
				
			}
			else
			{
				i++;
			}
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
	}
}
