
public class SecondSmallest {
	public static void main(String[] args) {
		int[] a= {0};
		System.out.println(findSecondSmallest(a));
	}
	
	public static int findSecondSmallest(int[] a)
	{
		int first =Integer.MAX_VALUE;
		int second=0;
		for(int el:a)
		{
			if(first>el)
			{
				second = first;
				first= el;
				
			}
			if(first!=el && second>el)
			{
				second = el;
			}
		}
		if(second == Integer.MAX_VALUE)
			second = first;
		return second;
	}

}
