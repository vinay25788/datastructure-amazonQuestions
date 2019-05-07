package src.stringquestion.copystring.customTreadpool;

public class MissingTwoNumber {
	public static void main(String[] args) {
		int[] a= {1,2,3,6};
		findMissingTwo(a,a.length+2);
	}
	public static void findMissingTwo(int[] a,int n)
	{
		int xor=a[0];
		for(int i=1;i<n-2;i++)
			xor = xor^a[i];
		for(int i=1;i<=n;i++)
			xor = xor^i;
		int setBit = xor&~(xor-1);
		int x=0,y=0;
		for(int i=0;i<n-2;i++)
		{
			if((setBit&a[i])>0)
			{
				x=x^a[i];
			}
			else
				y = y^a[i];
		}
		for(int i=1;i<=n;i++)
		{
			if((setBit&i)>0)
			{
				x=x^i;
			}
			else
				y=y^i;
		}
		System.out.println(y +" "+x);
	}
	/*public static void findMissingTwo(int[] a)
	{
		int xor=a[0];
		for(int i=1;i<a.length;i++)
			xor = xor^a[i];
		for(int i=1;i<=a.length+2;i++)
			xor = xor^i;
		int setBit = xor&~(xor-1);
		int x=0,y=0;
		for(int i=0;i<a.length;i++)
		{
			if((setBit&a[i])>0)
			{
				x=x^a[i];
			}
			else
				y = y^a[i];
		}
		for(int i=1;i<=a.length+2;i++)
		{
			if((setBit&i)>0)
			{
				x=x^i;
			}
			else
				y=y^i;
		}
		System.out.println(y +" "+x);
	}*/

}
