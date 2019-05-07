
public class AddFractions {
	public static void main(String[] args) {
		int[] a=new int[]{ 2, 3 };
		int[] b=new int[]{ 1, 2 };
		int[] result = addFractions(a,b);
		System.out.println(result[0]+"/"+result[1]);
	}
	public static int[] addFractions(int[] a,int[] b)
	{
		int[] result = new int[2];
		
		if(a.length!=2 || b.length!=2)
			throw new IllegalArgumentException();
		int numerator1 = a[0];
		int numerator2 = b[0];
		int denominator1 = a[1];
		int denominator2 = b[1];
		 result[0] = 0;
		 result[1] = 1;
		if(denominator1 == 0 || denominator2== 0)
			throw new IllegalArgumentException();
		else
		{
			int num = numerator1*denominator2+numerator2*denominator1;
			int deno = denominator1* denominator2;
			if(deno == 0)
				return new int[]{0,1};
			int gcd = findGcd(num,deno);
			result[0] = num/gcd;
			result[1] = deno/gcd;
		}
		
		return result;
	}

	public static int findGcd(int a,int b)
	{
		if(a==0 | b==0)
			return a;
		if(a== b)
			return a;
		if(a>b)
			return findGcd(a-b, b);
		//else if(b>a)
			return findGcd(a, b-a);
	}
}
