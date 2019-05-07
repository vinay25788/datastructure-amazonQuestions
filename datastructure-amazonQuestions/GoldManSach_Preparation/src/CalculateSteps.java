
public class CalculateSteps {

	public static void main(String[] args) {
		int x =11;
		System.out.println(calculateSteps(x,0,0));
	}
	public static int calculateSteps(int dest,int source,int step)
	{
		if(Math.abs(source)>dest)
		{
			//System.out.println(" not possible");
			return Integer.MAX_VALUE;
		}
		
		if(source==dest)
			return step;
		int pos = calculateSteps(dest, source+step+1, step+1);
		int neg = calculateSteps(dest, source-step-1, step+1);
		return Math.min(pos, neg);
	}
}
