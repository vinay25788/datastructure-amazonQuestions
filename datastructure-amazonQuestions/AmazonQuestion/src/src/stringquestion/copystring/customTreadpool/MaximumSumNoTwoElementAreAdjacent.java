package src.stringquestion.copystring.customTreadpool;

public class MaximumSumNoTwoElementAreAdjacent {
 
	
	public static void main(String[] args) {

        int a[] = new int[]{5, 5, 10, 100, 10, 5}; 
        System.out.println(maxsum(a));
	}
	
	public static int maxsum(int[] a)
	{
		int incl = a[0];
		int excl =0;
		int excl_new=0;
		for(int i=1;i<a.length;i++)
		{
			excl_new = excl>incl?excl:incl;
			incl = excl+a[i];
			excl = excl_new;
		}
		return excl>incl?excl:incl;
	}

}
