package src.stringquestion.copystring.customTreadpool;

public class RearrangePositiveAndNegativeNumber {
	public static void main(String[] args) {
		int[] a= {1,2,3,-1,-11,-2,5,8,-10};
		rearrange(a);
		String s = new String("vinay");
		s = s.substring(0, 2);
		System.out.println(s);
	}

	public static void rearrange(int[] a)
	{
		int pos=0;
		int neg=0;
		for(int k:a)
		{
			if(k<0)
				neg++;
		}
		int k=0,i=0,l=a.length-1;
		while(k<l)
		{
			if(a[k]<0)
			{
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
				i++;
				k++;
			}
			else
			{
				int temp = a[k];
				a[k] = a[l];
				a[l] = temp;
				l--;
			}
		}
		for( i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		
			
	}
}
