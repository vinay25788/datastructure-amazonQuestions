package src.stringquestion.copystring.customTreadpool;

public class TappingRainWater {
	public static void main(String[] args) {
		int a[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		find(a);
	}
	public static void find(int[] a)
	{
		int lo=0;
		int hi=a.length-1;
		int rightMax=0;
		int leftMax=0;
		int result=0;
		while(lo<=hi)
		{
			if(a[lo]<=a[hi])
			{
				if(a[lo]>leftMax)
					leftMax =a[lo];
				else
					result+=leftMax-a[lo];
				lo++;
			}
			else
			{
				if(a[hi]>rightMax)
					rightMax =a[hi];
				else
					result+=rightMax-a[hi];
				hi--;
			}
		}
		System.out.println(result);
	}

}
