package src.stringquestion.copystring.customTreadpool;

public class LargestSumSubarray {
	public static void main(String[] args) {
		 int a[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		 largestSum(a);
		 String s ="vinay";
		 
		 String s2 = new StringBuilder(s).reverse().toString();
		 System.out.println(s2);
		 String s1 = new String("vk");
		 s1.intern();
		 String s3 ="vk";
		 System.out.println(s1==s3);
	}
	public static void  largestSum(int[] a)
	{
		int max_so_far=0,max_ending_here =0;
		int s=0 ,end =-1;
		for(int i=0;i<a.length;i++)
		{
			max_ending_here = max_ending_here+a[i];
			if(max_ending_here <0)
				{
				s = i+1;
				max_ending_here =0;
				}
			if(max_so_far<max_ending_here)
			{
				max_so_far=max_ending_here;
				end = i;
			
			}
		}
		System.out.println("sum "+max_so_far+ "start index "+s+"end index "+end );
	}

}
