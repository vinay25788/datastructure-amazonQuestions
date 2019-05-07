import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {
	
	public static void main(String[] args) {
		 int a[]={12, 1, 78, 90, 57, 89, 56}; 
		 int k=3;
		 find(a,k);
	}
	public static void find(int[] a,int k)
	{
		Deque<Integer> qi=new LinkedList<>();
		int i=0;
		int n=a.length;
		
		for(;i<k;i++)
		{
			while(!qi.isEmpty() && a[i]>=a[qi.peekLast()])
				qi.removeLast();
			qi.addLast(i);
		}
		for(;i<n;i++)
		{
			System.out.println(a[qi.peek()]);
			while(!qi.isEmpty() && qi.peekFirst()<=i-k)
				qi.removeFirst();
			while(!qi.isEmpty() && a[i]>=a[qi.peekLast()])
				qi.removeLast();
			qi.addLast(i);
		}
		if(!qi.isEmpty())
			System.out.println(a[qi.peek()]);
	}

}
