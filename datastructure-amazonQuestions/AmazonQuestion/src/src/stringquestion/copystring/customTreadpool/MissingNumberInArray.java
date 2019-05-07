package src.stringquestion.copystring.customTreadpool;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,6};
		find(a);
	}
	
	public static void find(int[] a)
	{
		int xor=0;
		for(int i=0;i<a.length;i++)
		{
			xor = xor^a[i];
		}
		for(int i=1;i<=a.length+1;i++)
		{
			xor=xor^i;
		}
		System.out.println(xor);
	}

}
