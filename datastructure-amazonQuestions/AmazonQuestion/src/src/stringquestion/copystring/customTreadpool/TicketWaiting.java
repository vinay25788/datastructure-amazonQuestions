package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;
import java.util.List;

public class TicketWaiting {
	public static void main(String[] args) {
		Integer[] a= {2,1,3,4,5};
		int p=0;
		countWait(a,p);
		String a;
		
	}
	public static void countWait(Integer[] a,int p)
	{
		int count=0;
		List<Integer> list = Arrays.asList(a);
		boolean isDone=false;
				final int size = list.size();
				while(!isDone)
				{
					for(int i=0;i<size;i++)
					{
						if(list.get(i) ==0)
							continue;
						if(list.get(p)==0)
						{
							isDone = true;
							break;
						}
						list.set(i, list.get(i)-1);
						count++;
					}
				}
				System.out.println("count "+count);
		
	}

}
