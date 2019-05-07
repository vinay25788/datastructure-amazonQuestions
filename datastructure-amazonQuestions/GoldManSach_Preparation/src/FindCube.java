
public class FindCube {
	public static void main(String[] args) {
		int x=27;
		System.out.println(floorSqrt(x));
	}
	public static int floorSqrt(int x)
	{
		
		if(x==1 ||x==0)
		{
			return x;
		}
		int ans=0;
		int start = 0,end=x,mid=0;
		while(start<end)
		{
			mid = (start+end)/3;
			if(mid*mid*mid==x)
				return mid;
			if(mid*mid*mid<x)
			{
				start=mid+1;
				ans =mid;
			}
			else
			{
				end = mid-1;
			}
		}
		return ans;
	}
	

}
