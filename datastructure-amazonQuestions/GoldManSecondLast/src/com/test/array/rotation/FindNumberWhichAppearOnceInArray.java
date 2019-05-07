package com.test.array.rotation;

public class FindNumberWhichAppearOnceInArray {
	public static void main(String[] args) {
			int[] a= {7, 7, 8, 8, 9, 1, 1, 4, 2, 2};
		//int a[] = {-9, -8, 4, 4, 5, 5, -1};
			int i=0;
			if(a.length ==2)
			{
				if(a[i] != a[i+1])
				{
					System.out.println(a[i]+" "+a[i+1]);
				}
			}
			else
			{
				for(i=1;i<a.length;i++)
				{
					if(a[i-1] == a[i])
						i++;
					else
					{
						System.out.println(a[i-1]);
					}
				}
				if(a[a.length-1] !=a[a.length-2])
					System.out.println(a[a.length-1]);
			}
	}

}
