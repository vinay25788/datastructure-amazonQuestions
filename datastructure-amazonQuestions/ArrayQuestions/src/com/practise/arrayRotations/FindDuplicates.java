package com.practise.arrayRotations;

public class FindDuplicates {
	public static void main(String[] args) {
		int arr[] = { 1, 6, 3, 1, 3, 6, 6 }; 
		findDuplicates(arr);
	}
	public static void findDuplicates(int[] arr)
	{
		boolean noDuplicates= false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[arr[i]%arr.length]>arr.length)
			{
				if(arr[arr[i]%arr.length]<2*arr.length)
				{
					System.out.print(" "+arr[i]%arr.length);
					noDuplicates=true;
				}
			}
			arr[arr[i]%arr.length]+=arr.length;
		}
		if(!noDuplicates)
			System.out.println("no duplicate found");
	}

}
