package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class MoveAllNextAtStartAndPostAtEbd {
	public static void main(String[] args) {
		 int a[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 }; 
		 int count=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]%2==0)
			 {
				 int temp =a[count];
				 a[count] =a[i];
				 a[i] =temp;
				 count++;
			 }
		 }
		 System.out.println(Arrays.toString(a));
	}

}
