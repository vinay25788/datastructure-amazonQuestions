
public class StairCase {

	public static void main(String[] args) {
		int n=5;
		System.out.println(findStep( n));
		System.out.println(findStepsUsingRec(n));
	}
	
	public static int findStep(int n)
	{
		int[] steps = new int[n+1];
		steps[1]=1;
		steps[2]=2;
		for(int i=3;i<=n;i++)
		{
			steps[i] = steps[i-1]+steps[i-2];
		}
		return steps[n];
	}
	
	public static int findStepsUsingRec(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return findStepsUsingRec(n-1)+findStepsUsingRec(n-2);
	}
}

