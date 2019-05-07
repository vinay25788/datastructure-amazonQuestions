package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class PushZeroToEnd {
	
	public static void main(String[] args) {
		int[] a= {4,5,0,2,0,1,0,2};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] !=0)
			{
				int temp = a[i];
				a[i] = a[count];
				a[count] = temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
