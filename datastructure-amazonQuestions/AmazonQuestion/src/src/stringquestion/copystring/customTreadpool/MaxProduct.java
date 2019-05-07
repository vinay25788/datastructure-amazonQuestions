package src.stringquestion.copystring.customTreadpool;

public class MaxProduct {

	public static void main(String[] args) {
		int[] a= {6,-3,-10,0,2};
		find(a);
	}
	public static void find(int[] a)
	{
		int max_ending=1;
		int min_ending=1;
		int max_so_far=1;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				max_ending = max_ending*a[i];
				min_ending =Math.min(min_ending*a[i],1);
			}
			else if(a[i]==0)
			{
				max_ending=1;
				min_ending=1;
			}
			else
			{
				int temp = max_ending;
				max_ending= Math.max(min_ending*a[i],1);
				min_ending = temp*a[i];
			}
			if(max_so_far <max_ending)
				max_so_far=max_ending;
		}
		System.out.println(max_so_far);
	}
}
