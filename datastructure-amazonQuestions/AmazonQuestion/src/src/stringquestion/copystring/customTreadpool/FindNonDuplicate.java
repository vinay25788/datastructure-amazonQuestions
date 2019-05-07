package src.stringquestion.copystring.customTreadpool;

public class FindNonDuplicate {
	public static void main(String[] args) {
		int arr[] = {1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8};
		  find(arr);
	}
	public static void find(int[] a)
	{
		int x=a[0];
		for(int i=1;i<a.length;i++)
		{
			x=x^a[i];
		}
		System.out.println(x);
	}

}
