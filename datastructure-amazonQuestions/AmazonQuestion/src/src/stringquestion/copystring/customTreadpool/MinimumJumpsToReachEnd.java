package src.stringquestion.copystring.customTreadpool;

public class MinimumJumpsToReachEnd {
	public static void main(String[] args) {
		 int a[] = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; 
		 find(a);
	}
	public static void find(int[] a)
	{
		int jumps=1;
		int maxReach=a[0];
		int i=1;
		int n=a.length;
		int steps =a[0];
		while(i<n)
		{
			maxReach = Math.max(maxReach, a[i]+i);
			if(i>=n-1)
			{
				System.out.println(jumps);
				break;
			}
			steps--;
			if(steps==0)
			{
				jumps++;
				if(i>maxReach)
				{
					System.out.println("not possible to reach end ");
					break;
				}
				steps = maxReach-i;
			}
			i++;
		}
	}

}
