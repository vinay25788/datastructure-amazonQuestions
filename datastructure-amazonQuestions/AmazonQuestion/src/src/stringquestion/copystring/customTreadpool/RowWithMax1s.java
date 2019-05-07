package src.stringquestion.copystring.customTreadpool;

public class RowWithMax1s {

	public static void main(String[] args) {
		int mat[][] = { { 0, 0, 0, 1 }, 
                { 0, 1, 1, 1 }, 
                { 1, 1, 1, 1 }, 
                { 0, 0, 0, 0 } }; 
		find(mat);
	}
	public static void find(int[][] mat)
	{
		int max=Integer.MIN_VALUE;
		int rowIndex=-1;
		
		for(int i=0;i<mat.length;i++)
		{
			int ind = first(mat[i],0,mat[i].length-1);
			if(ind!=-1 && mat[i].length-ind>max)
			{
				max = mat[i].length-ind;
				rowIndex = i;
			}
		}
		System.out.println(rowIndex+" "+max);
	}
	
	public static int first(int[] a,int l,int h)
	{
		if(l<=h)
		{
			int mid = (l+h)/2;
			if(mid==0 || a[mid-1] ==0 && a[mid]==1)
				return mid;
			else if(a[mid]==0)
			{
				return first(a, mid+1, h);
			}
			else
			{
				return first(a, l, mid-1);
			}
		}
		return -1;
	}
}
