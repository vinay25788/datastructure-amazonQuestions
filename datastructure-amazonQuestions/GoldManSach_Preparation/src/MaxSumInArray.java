
public class MaxSumInArray {

	public static void main(String[] args) {
		  int a[] = {2, 3, 7, 10, 12, 15, 30, 34}; 
	        int b[] = {1, 5, 7, 8, 10, 15, 16, 19}; 
		 System.out.println(findSum(a,b));
	}
	public static int findSum(int[] a,int[] b)
	{
		int sum1=0;
		int sum2=0;
		int result=0;
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				sum1+=a[i];
				i++;
			}
			else if(a[i]>b[j])
				{
				sum2+=b[j];
				j++;
				}
			else
			{
				result+=Math.max(sum1, sum2);
				sum1=0;
				sum2=0;
				while(i<a.length && j<b.length && a[i]==b[j])
				{
					result+=a[i];
					i++;
					j++;
				}
			}
		}
		
		while(i<a.length)
		{
			sum1+=a[i];
			i++;
		}
		while(j<b.length)
		{
			sum2+=b[j];
			j++;
		}
		result+=Math.max(sum1, sum2);
		return result;
	}
}
