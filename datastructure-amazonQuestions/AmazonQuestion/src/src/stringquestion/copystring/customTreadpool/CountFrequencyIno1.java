package src.stringquestion.copystring.customTreadpool;

public class CountFrequencyIno1 {

	public static void main(String[] args) {
		 int arr[] = {2, 3, 3, 2, 5}; 
		 find(arr);
	}
	public static void find(int[] a)
	{
		int n=a.length;
		for(int i=0;i<a.length;i++)
		{
			a[i] = a[i]-1;
		}
		for(int i=0;i<a.length;i++)
		{
			a[a[i]%n] = a[a[i]%n]+n;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(i+1+" "+a[i]/n);
		}
	}
}
