package src.com.amazon.frequentyAsked.questions;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		int[] a= {11, 15, 14, 13};
		System.out.println(missing(a));
	}
	
	public static int missing(int[] a)
	{
		int min=a[0];
		int max = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min > a[i])
				min = a[i];
			if(max < a[i])
				max = a[i];
		}
		
		int x = min;
		for(int i = min + 1; i <= max; i++)
		{
			x = x^i;
		}
		int y=a[0];
		for(int i=1;i<a.length;i++)
		{
			y=y^a[i];
		}
		
		return y^x;
	}
}
