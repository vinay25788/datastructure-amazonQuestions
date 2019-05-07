package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class Sagreegate0s1s2s {
	public static void main(String[] args) {
		int[] a= {2,1,0,0,2,1,0};
		sagr(a);
	}
	
	public static void sagr(int[] a)
	{
		int i=0;
		int k=0;
		int temp=0;
		int l=a.length-1;
		while(k<l)
		{
			switch(a[k])
					{
			
			case 0:	
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
				i++;
				k++;
				
					break;
			case 1: 
				k++;
				break;
			case 2:
					temp = a[l];
					a[l] = a[k];
					a[k] = temp;
					l--;
				break;
					}
		}
		
			System.out.print(Arrays.toString(a));
	}

}
