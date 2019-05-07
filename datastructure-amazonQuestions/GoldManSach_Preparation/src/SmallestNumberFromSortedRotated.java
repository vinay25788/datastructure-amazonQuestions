
public class SmallestNumberFromSortedRotated {
	
	public static void main(String[] args) {
		//int a[] ={ 3, 4, 5, 6, 1, 2 };
		//int[] a= {2,1};
		int[] a= {1,2,3,4,5};
		System.out.println(findMin(a,0,a.length-1));
	}
	public static int findMin(int [] a,int l,int r)
	{
		if(l>r)
			return a[l];
			if(l==r)
				return a[l];
			int mid=(l+r)/2;
			/*if(l==mid)
				return a[l];*/
			if(mid<r && a[mid+1] <a[mid])
				return a[mid+1];
			if( mid>l && a[mid-1]>a[mid])
				return a[mid];
			if(a[mid]<a[r])
				return findMin(a, l,mid-1);
			
				return findMin(a,mid+1,r);
		//return -1;
		
	}

}
