package src.stringquestion.copystring.customTreadpool;

public class Sagregate0s1s {
	public static void main(String[] args) {
		int[] a= {1,1,1,1,1,0,0,0,1};
		int count=0;
		int i=0;
		for(;i<a.length;i++)
		{
			if(a[i] ==0)
				count++;
		}
		i=0;
		while( i<count )
		{
			System.out.print(" 0 ");
			i++ ;
			//count --;
			
		}
		for( ;i<a.length;i++)
		{
			
			System.out.print(" 1 ");
		}
	}

}
