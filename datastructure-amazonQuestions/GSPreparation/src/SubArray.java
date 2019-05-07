
public class SubArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] sub=new int[a.length];
		find(a,sub,a.length,0,8);
	}
	public static void find(int[] a,int sub[],int n,int k,int sum)
	{
		if(sum==0)
		{
			for(int i=0;i<k;i++)
				System.out.print(sub[i]+" ");
			System.out.println();
			k=0;
			return;
		}
		if(sum!=0 && n<=0)
		{
			return;
		}
		sub[k]=a[n-1];
		find(a, sub, n-1, k+1, sum-a[n-1]);
		find(a, sub, n-1, k, sum);
	}

}
