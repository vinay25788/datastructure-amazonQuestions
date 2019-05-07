package src.com.amazon.frequentyAsked.questions;

public class LeaderElement {

	public static void main(String[] args) {
		int[] a= {15,16,3,2,6,4};
		int n= a.length;
		int rightMax = a[n-1];
		System.out.println(rightMax);
		for(int i=n-2;i>=0;i--)
		{
			if(rightMax<a[i])
			{
				rightMax = a[i];
				System.out.println(rightMax);
			}
		}
		
	}
}
