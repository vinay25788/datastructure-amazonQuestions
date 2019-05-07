package src.stringquestion.copystring.customTreadpool;

public class SumSubetUsingRecursion {
	public static void main(String[] args) {
		int[] set={2,3,7,8,10};
		int n=set.length;
		int sum =11;
		System.out.println(isSubset(set,n-1,sum));
	}
	public static boolean isSubset(int[] set,int n,int sum)
	{
		if(sum == 0)
			return true;
		if(n==0 && sum !=0)
			return false;
		if(set[n-1] >sum)
			return isSubset(set, n-1, sum);
		return isSubset(set, n-1, sum)|| isSubset(set, n-1, sum-set[n-1]);
	}
}
