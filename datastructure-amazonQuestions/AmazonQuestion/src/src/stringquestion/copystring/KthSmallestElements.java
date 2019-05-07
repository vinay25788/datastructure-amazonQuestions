package src.stringquestion.copystring;

public class KthSmallestElements { 
	public static void main(String[] args) {
		int a[] = {5,4,32,1,7,8};
		int k=3;
		findKthSmallest(a,k);
		System.out.println(k+"th "+a[0]);
		for(int i=0;i<k;i++)
			System.out.println(a[i]);
	}
	
	public static void findKthSmallest(int[] a,int k)
	{
		int n= a.length-1;
		for(int i=k-1;i>=0;i--)
		{
			heapify(a,i,n);
		}
		
		for(int i=k;i<=n;i++)
		{
			if(a[0]>a[i])
			{
				int temp = a[i];
				a[i] = a[0];
				a[0] = temp;
				heapify(a,0,i);
			}
		}
	}
	
	public static void heapify(int [] a,int i,int n)
	{
		int first = 2*i+1;
		int second = 2*i+2;
		int largest = i;
		if(first<n && a[first]>a[largest])
			largest = first;
		if(second<n && a[second]>a[largest])
			largest = second;
		if(largest != i)
		{
			int temp = a[i];
			a[i] = a[largest];
			a[largest]=temp;
			heapify(a, largest, n);
		}
	}

}














