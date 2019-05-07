package src.stringquestion.copystring;

public class KthLargestElements {
	public static void main(String[] args) {
		int [] a = {3,2,4,1,8};
		int k=2;
		kthSmallest(a,k);
		
		for(int i=0;i<k;i++)
			System.out.print(" "+a[i]);
	}
	
	public static void kthSmallest(int[] a,int k)
	{
		int n= a.length;
		for(int i=k-1;i>=0;i--)
		{
			heapify(a,i,n);
		}
		
		for(int i=n-1;i>=k;i--)
		{
			if(a[i] >a[0])
			{
				int temp = a[i];
				a[i] = a[0];
				a[0] = temp;
				heapify(a,0,i);
			}
		}
	}
	
	public static void heapify(int[] a,int i,int n)
	{
		int smallest = i;
		int first = 2*i+1;
		int second = 2*i+2;
		if(first<n && a[first]<a[smallest])
			smallest = first;
		if(second <n && a[second] <a[smallest])
			smallest= second;
		
		if(smallest != i)
		{
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
			heapify(a, smallest, n);
		}
	}

}
