package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;

public class NextImmediateGreaterNumber {
	
	public static void main(String[] args) {
		char[] ch= {'5','3','4','9','7','6'};
		int n = ch.length;
		findNumber(ch,n);
	}
	public static void findNumber(char[] ch,int n)
	{
		int i=n-1;
		for(;i>=0;i--)
		{
			if(ch[i-1]<ch[i])
				break;
		}
		
		if(i==0)
		{
			System.out.println(" not possible ");
			return;
		}
		else
		{
			int min=i;
			int x = ch[i-1];
			for(int j= i+1;j<n;j++)
			{
				if(ch[j]>x && ch[j]<ch[min])
				{
					min = j;
				}
			}
			
			char temp = ch[i-1];
			ch[i-1] = ch[min];
			ch[min] = temp;
			Arrays.sort(ch, i, n-1);
			
			System.out.println(Arrays.toString(ch));
			
			
		}
	}
}
