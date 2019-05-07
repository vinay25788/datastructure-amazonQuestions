package src.stringquestion.copystring.customTreadpool;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] a= {1,2,4,5};
		findMissing(a);
		System.out.println(0^1);
	}
	public static void findMissing(int[] a)
	{
		int x=0;
		int aa=a[0];
		int bb=1;
		for(int i=1	;i<a.length;i++)
		{
			aa=aa^a[i];
		}
		for(int i=2;i<=a.length+1;i++)
		{
			bb=bb^i;
		}
		System.out.println(aa^bb);
	}

}

