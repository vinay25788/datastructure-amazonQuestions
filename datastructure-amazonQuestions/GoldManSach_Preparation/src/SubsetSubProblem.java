import java.util.Arrays;

public class SubsetSubProblem {
	public static void main(String[] args) {
		 int set[] = {3, 34, 4, 12, 5, 2}; 
	        int sum = 9; 
	        subset(set,sum);
	}
	public static void subset(int[] set,int sum)
	{
		int[] sub=new int[set.length];
		System.out.println("subset is present or not "+subsetUtil(set,sum,set.length,sub,0));
	}
	public static int subsetUtil(int[] set,int sum,int n,int[] sub,int k)
	{
		if(sum==0)
		{
			
			for(int i=0;i<k;i++)
				System.out.print(" "+sub[i]);

				System.out.println();
				k=0;
				return 1;
		}
		
		if(sum!=0 && n<=0)
			return 0;
		sub[k] = set[n-1];
		return subsetUtil(set, sum-set[n-1], n-1, sub, k+1) +subsetUtil(set, sum, n-1, sub, k);
	}
}
