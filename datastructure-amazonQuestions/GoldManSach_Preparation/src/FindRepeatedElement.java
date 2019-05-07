
public class FindRepeatedElement {
	public static void main(String[] args) {
		 int a[] = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 }; 
		 find(a);
	}
	public static void find(int[] a)
	{
		int x=1;
		int n=a.length;
		for(int i=2;i<=n-1;i++)
			x=x^i;
		int y = a[0];
		for(int i=1;i<n;i++)
			y=y^a[i];
		System.out.println(y^x);
	}

}
