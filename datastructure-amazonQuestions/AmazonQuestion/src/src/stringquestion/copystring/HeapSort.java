package src.stringquestion.copystring;

public class HeapSort {
	public static void main(String[] args) {
		int[] a= {10,3,1,4,8,9};
		int k=3;
		heapSort(a,k);
		
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
	}
	
	public static void heapSort(int a[],int k)
	{
		int n= a.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(a,i,n);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			if(a[i] >a[0]) {
				int temp = a[i];
				a[i] = a[0];
				a[0] = temp;
				heapify(a,0,i);
			}
		}
	}
	
	public static void heapify(int[] a,int i,int n)
	{
		int l = 2*i+1;
		int r = 2*i+2;
		int smallest=i;
		if(l<n && a[l]>a[smallest])
			smallest = l;
		if(r<n&& a[r] > a[smallest])
			smallest = r;
		if(smallest != i)
		{
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
			heapify(a, smallest, n);
		}
	}

}
