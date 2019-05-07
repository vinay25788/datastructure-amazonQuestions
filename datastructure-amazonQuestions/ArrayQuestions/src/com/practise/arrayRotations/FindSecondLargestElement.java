package com.practise.arrayRotations;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		 int arr[] = {12, 35, 1, 10, 34, 1}; 
		 findSecond(arr);
	}
	public static void findSecond(int[] arr)
	{
		int first=0;
		int second=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second = first;
				first = arr[i];
			}
			else if (arr[i]> second && first != arr[i])
			{
				second = arr[i];
			}
		}
		System.out.println(second);
	}
}
