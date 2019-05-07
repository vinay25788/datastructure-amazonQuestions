
public class MissingNumber {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,6};
		System.out.println(findMissing(a));
	}
	public static int findMissing(int[] a)
	{
		int x=1;
		for(int i=2;i<=a.length+1;i++)
		{
			x=x^i;
		}
		int y=a[0];
		for(int i=1;i<a.length;i++)
		{
			y=y^a[i];
		}
		return x^y;
	}
}
