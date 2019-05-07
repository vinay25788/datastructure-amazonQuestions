package src.stringquestion.copystring.customTreadpool;

public class MaxMinAlterNate {
	public static void main(String[] args) {
		int[] a= {11,12,13,14,15};
		arrange(a);
	}
	public static void arrange(int[] a)
	{
		int maxId = a.length-1;
		int minId=0;
		int maxEle = a[a.length-1]+1;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				a[i]+=(a[maxId]%maxEle)*maxEle;
				maxId--;
			}
			else
			{
				a[i]+=(a[minId]%maxEle)*maxEle;
				minId++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]/maxEle+" ");
		}
	}

}
