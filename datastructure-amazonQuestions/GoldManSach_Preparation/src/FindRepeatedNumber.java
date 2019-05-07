
public class FindRepeatedNumber {

	public static void main(String[] args) {
		int[] a= {1,1,2,3,4};
		findRepeated(a);
	}
	public static void findRepeated(int [] a)
	{
		int x=a[0];
		for(int i=1;i<a.length;i++)
		{
			x=x^a[i];
		}
		for(int i=1;i<a.length;i++)
		{
			x=x^i;
		}
		System.out.println(x);
	}
}
