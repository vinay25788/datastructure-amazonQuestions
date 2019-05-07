package src.stringquestion.copystring.customTreadpool;

public class MaximumProductSubArray {
	public static void main(String[] args) {
		int[] a= {6,-3,-10,0,2};
		find(a);
	}
	public static void find(int[] a)
	{
		int max_ending_here=1;
		int min_ending_here=1;
		int max_so_for=1;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				max_ending_here = max_ending_here*a[i];
				min_ending_here = Math.min(min_ending_here*a[i], 1);
			}
			else if(a[i]==0)
			{
				max_ending_here =1;
				min_ending_here=1;
			}
			else
			{
				int temp = max_ending_here;
				max_ending_here= Math.max(min_ending_here*a[i], 1);
				min_ending_here = temp*a[i];
				
			}
			if(max_so_for < max_ending_here)	
				max_so_for =max_ending_here;
		}
		System.out.println(max_so_for);
	}
	

}
