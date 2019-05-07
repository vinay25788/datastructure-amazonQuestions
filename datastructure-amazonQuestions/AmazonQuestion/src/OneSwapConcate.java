
public class OneSwapConcate {
	public static void main(String[] args) {
		String st1 = "meat";
		String st2 ="meka";
		findSwap(st1,st2);
	}
	
	public static void findSwap(String st1,String st2) {
		int m= st1.length();
		int n= st2.length();
		if(m != n)
		{
			System.out.println("not possible");
			return;
		}
		int count=0;
		int cur=-1;
		int prev =-1;
		for(int i=0;i<m;i++)
		{
			if(st1.charAt(i) != st2.charAt(i))
			{
				count++;
				if(cur==-1)
				{
					prev = cur;
					cur = i;
				}
				else
				{
					prev = cur;
					cur = i;
				}
			}
			
			if(count>2)
			{
				System.out.println(" not possible ");
				return;
			}
			
		}
		
		if(count ==2 )
		{
			if(st1.charAt(cur) == st2.charAt(prev))
			System.out.println(" possible ");
			else
				System.out.println(" not possible");
			
		}
	}

}
