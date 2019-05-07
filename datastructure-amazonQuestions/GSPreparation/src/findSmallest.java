
public class findSmallest {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[] = {3,4,5,6,1,2};
		int c[] = {4,1,2,3};
		int d[] = {2,1};
		System.out.println(findSmallest(a,0,a.length-1));
		System.out.println(findSmallest(b,0,b.length-1));
		System.out.println(findSmallest(c,0,c.length-1));

		System.out.println(findSmallest(d,0,d.length-1));
	}
	
	public static int findSmallest(int[] a,int l,int h)
	{
		if(l==h)
			return a[l];
		if(l>h)
			return a[l];
		int mid = (l+h)/2;
		if(mid<h && a[mid]>a[mid+1])
			return a[mid+1];
		if(mid>l && a[mid-1]>a[mid])
			return a[mid];
		if(a[mid]<a[h])
		{
			
			return findSmallest(a, l, mid-1);
		}
		return findSmallest(a, mid+1, h);
	}

}
