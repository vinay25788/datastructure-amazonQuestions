package src.stringquestion.copystring.customTreadpool;

public class MedianOfTwoSortedArray {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {1,5,6,7};
		try {
			System.out.println(find(a,b));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static double find(int[] a,int[] b) throws IllegalAccessException
	{
		if(a.length>b.length)
			return find(b,a);
		int sizeA = a.length;
		int sizeB = b.length;
		int l=0;
		int h=sizeA;
		while(l<=h)
		{
			int partA = (l+h)/2;
			int partB = (sizeA+sizeB+1)/2-partA;
			
			int maxA = partA==0?Integer.MIN_VALUE:a[partA-1];
			int minA=partA==sizeA?Integer.MAX_VALUE:a[partA];
			int maxB = partB==0?Integer.MIN_VALUE:b[partB-1];
			int minB=partB==sizeB?Integer.MAX_VALUE:b[partB];
			
			if(maxA<=minB && maxB<=minA)
			{
				if((sizeA+sizeB)%2==0)
				return (double) ((Math.max(maxA, maxB))+Math.min(minA, minB))/2;
				else
					return (double) Math.max(maxB, maxA);
			}
			else if(maxA>minB)
				h=partA-1;
			else
				l=partA+1;
			
		}
		throw new IllegalArgumentException();
	}

}
