
/*
  Minimum coins required to form the total and coins present in any order;
 */
public class MinimumCoinRequied {
	public static void main(String[] args) {
		int[] a = { 7, 2, 3, 6 };
		findCoins(a, 13);
	}

	public static void findCoins(int[] a, int sum) {
		int[] T = new int[sum + 1];
		int[] R = new int[sum + 1];

		for (int i = 1; i <= sum; i++) {
			T[i] = Integer.MAX_VALUE-1;
			R[i] = -1;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= sum; j++) {
				if (j >=a[i]) {
					if (T[j - a[i]] + 1 < T[j]) {
						T[j] = T[j - a[i]] + 1;
						R[j] = i;
					}
				}
			}
		}

		System.out.println(T[sum]);
		printArray(R,a);
	}
	public static void printArray(int[] R,int[] a)
	{
		if(R[R.length-1]==-1)
		{
			System.out.println(" not possible ");
			return;
		}
		int start = R.length-1;
		while(start!=0)
		{
			int j=R[start];
			System.out.print(a[j]+" ");
			start = start-a[j];
		}
		System.out.println();
	}

}
