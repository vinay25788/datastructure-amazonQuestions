
public class MimumuJumps {
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(findJumps(arr));
	}
	public static int findJumps(int[] a)
	{
		int jumps=1;
		
		int steps = a[0];
		int maxReach = a[0];
		int i=1;
		while(i<a.length)
		{
			maxReach= Math.max(maxReach, a[i]+i);
			if(i==a.length)
				return jumps;
			steps--;
			if(steps==0)
			{
				jumps++;
				if(maxReach<i)
					return -1;
				steps = maxReach-i;
					
			}
			i++;
		}
		
		return jumps;
	}

}
