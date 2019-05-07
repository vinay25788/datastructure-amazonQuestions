package src.stringquestion.copystring.customTreadpool;

public class FindMissingNumberInAnotherArray {
	public static void main(String[] args) {
		 int a[] = { 4, 1, 5, 9, 7 }; 
	        int b[] = { 7, 5, 9, 4 }; 
	        find(a,b);
	}
	public static void find(int[] a,int[] b)
	{
		int xor=0;
		for(int i=0;i<a.length;i++)
		{
			xor =xor^a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			xor = xor^b[i];
		}
		System.out.println(xor);
	}

}
