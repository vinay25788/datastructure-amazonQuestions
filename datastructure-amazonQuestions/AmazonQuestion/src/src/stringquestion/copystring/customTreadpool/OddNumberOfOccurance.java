package src.stringquestion.copystring.customTreadpool;

public class OddNumberOfOccurance {
	public static void main(String[] args) {
		 int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 }; 
	        int n = arr.length; 
	        findOdd(arr,n);
	}
	public static void findOdd(int[] a,int n)
	{
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			x=x^a[i];
		}
		System.out.println(x);
	}

}
