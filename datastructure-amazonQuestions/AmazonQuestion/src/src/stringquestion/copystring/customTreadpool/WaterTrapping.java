package src.stringquestion.copystring.customTreadpool;

public class WaterTrapping {
	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 
                3, 2, 1, 2, 1}; 
   int n = arr.length; 
   waterTrapping(arr,n);
	}
	public static void waterTrapping(int[] a,int n)
	{
		int lo=0,hi=a.length-1;
		int leftMax=0,rightMax=0;
		int result=0;
		while(lo<=hi)
		{
			if(a[lo]<a[hi])
			{
				if(a[lo]>leftMax)
					leftMax = a[lo];
				else
					result+=leftMax-a[lo];
				lo++;
			}
			else
			{
				if(a[hi]>rightMax)
				{
					rightMax = a[hi];
				}
				else
					result+=rightMax-a[hi];
				hi--;
			}
		}
		System.out.println(result);
	}
}
