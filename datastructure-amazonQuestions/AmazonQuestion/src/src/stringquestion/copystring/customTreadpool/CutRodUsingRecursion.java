package src.stringquestion.copystring.customTreadpool;

public class CutRodUsingRecursion {
	public static void main(String[] args) {
		int arr[] = {1, 5, 8, 9, 10, 17, 17, 20};
		System.out.println("max profit-->"+cutRod(arr,arr.length));
	}
	
	public static int cutRod(int[] arr,int n)
	{
		if(n<0)
		{
			return 0;
		}
		int max= 0;
		for(int i=0;i<n;i++)
		{
			max = Math.max(max, arr[i]+cutRod(arr, n-i-1));
		}
		return max;
	
	}

}
