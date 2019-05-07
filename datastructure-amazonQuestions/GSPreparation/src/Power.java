
public class Power {
	public static void main(String[] args) {
		double base[] = {2,2, 2.3, 0, 5.5,6.2};
	    int exponent[] ={4,-3,20, 10, 0,  1};
	    for(int i=0;i<base.length;i++)
	    System.out.println(find(base[i],exponent[i]));
	}
	public static double find(double base,int exp)
	{
		if(base == 0)
			return 0;
		if(exp==0)
			return 1;
		if(exp==1)
			return base;
		int positivExp = exp<0?exp*-1:exp;
		double result = positivExp%2 ==0?find(base*base,exp/2):base*find(base*base,(positivExp-1)/2);
		return result;
	}

}
