
public class FindMissingTwoNumber {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,7};
		findMissingTwoNumber(a);
	}
	public static void findMissingTwoNumber(int[] a)
	{
		int x=1;
		for(int i=2;i<=a.length+2;i++)
			x=x^i;
		for(int i=1;i<a.length;i++)
			x=x^a[i];
		int setBit = x&(~(x-1));
		int first=0;
		int second=0;
		for(int i=1;i<=a.length+2;i++)
		{
			if((setBit&i)>0)
			{
				first = first^i;
			}
			else
			{
				second = second^i;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if((setBit&a[i])>0)
			{
				first =first^a[i];
			}
			else
				second =second^a[i];
		}
		System.out.println(first+" "+second);
	}

}
