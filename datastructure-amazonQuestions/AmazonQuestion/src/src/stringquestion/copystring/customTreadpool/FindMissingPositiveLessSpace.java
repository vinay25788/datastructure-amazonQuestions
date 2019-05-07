package src.stringquestion.copystring.customTreadpool;

public class FindMissingPositiveLessSpace {
	public static void main(String[] args) {
		int[] a = {1,3,4,5};
		int n= a.length;
		findMissing(a,n);
	}
	
	public static void findMissing(int[] a,int n)
	{
		int i=0;
		
		for(i=0;i<n;i++)
		{
			if(a[i]<=0 || a[i]>n)
				continue;
			int val = a[i];
			
			while(a[val-1] != val)
			{
				int next = a[val-1];
				a[val-1] = val;
				val = next;
				if(val<=0 || val>n)
					break;
			}
		}
		
		for(i=0;i<=n;i++)
		{
			if(a[i] != i+1)
			{
				System.out.println(i+1);
				return;
			}
		}
	}

}

