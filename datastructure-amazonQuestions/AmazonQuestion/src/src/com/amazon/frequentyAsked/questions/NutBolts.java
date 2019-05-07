package src.com.amazon.frequentyAsked.questions;

public class NutBolts {
	public static void main(String[] args) {
		char nuts[] = {'@', '#', '$', '%', '^', '&'}; 
        char bolts[] = {'$', '%', '&', '^', '@', '#'}; 
        sort(nuts,bolts,0,5);
        for(int i=0;i<6;i++)
        	System.out.print(nuts[i]+" ");
        System.out.println();
        for(int i=0;i<6;i++)
        	System.out.print(" "+bolts[i]);
	}
	
	public static void sort(char[] nuts,char[] bolts,int low,int high)
	{
		if(low<high)
		{
			int part = partitions( nuts,low, high,  bolts[high]);
			partitions(bolts,low,high,nuts[part]);
			
			sort(nuts,bolts,low,part-1);
			sort(nuts,bolts,part+1,high);
		}
	}

	public static int partitions(char[] a,int low, int high,char pivot)
	{
		int i=low;
		char temp1=' ',temp=' ';
		for(int j=low;j<high;j++)
		{
			if(a[j]<pivot)
			{
				temp1 = a[i];
				a[i] = a[j];
				a[j] = (char) temp1;
				
			}
			if(a[j] == pivot)
			{
				temp1 = a[high];
				a[high] = a[j];
				a[j] = temp1;
			}
		}
		
		temp = a[high];
		a[high] = a[i];
		a[i] = temp;
		return i++;
	}
}
