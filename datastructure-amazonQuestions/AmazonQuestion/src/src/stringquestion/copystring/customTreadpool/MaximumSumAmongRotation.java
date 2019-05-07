package src.stringquestion.copystring.customTreadpool;

public class MaximumSumAmongRotation {

	public static void main(String[] args) {
		int[] a= {8,3,1,2};
		System.out.println(max(a));
	}
	public static int max(int[] a)
	{
		int sum=0,cur_val=0,next_val=0;
		int result =0;
		
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		for(int i=0;i<a.length;i++)
			cur_val+=i*a[i];
		
		for(int i=1;i<a.length;i++)
		{
			next_val = cur_val -(sum-a[i-1])+(a[i-1]*(a.length-1));
			cur_val = next_val;
			
			result = Math.max(result, next_val);
		}
		return result;
	}
}
