package src.stringquestion.copystring;

import java.util.Comparator;
import java.util.PriorityQueue;

class Key
{
	char ch;
	int freq;
	Key()
	{
		
	}
	Key(char ch,int freq)
	{
		this.ch = ch;
		this.freq = freq;
	}
}

class KeyComparator implements Comparator<Key>
{

	@Override
	public int compare(Key o1, Key o2) {
		// TODO Auto-generated method stub
		
		if(o1.freq < o2.freq)
			return 1;
		else if (o1.freq > o2.freq)
			return -1;
		return 0;
	}
	
}

public class RearrangeCharacterNotTwoAdjacentAreSame {
	
	public static void main(String[] args) {
		String st = "bbbaa";
		rearrange(st);
	}
	
	public static void rearrange(String st)
	{
		int n= st.length();
		
		int[] ch = new int[26];
		for(int i=0;i<st.length();i++)
		{
			ch[st.charAt(i) -'a']++;
		}
		KeyComparator comp = new KeyComparator();

		 PriorityQueue<Key> pq = new PriorityQueue<>(comp);

			

			 
			 
		Key cur = new Key();
		Key prev = new Key();
		prev.ch ='#';
		prev.freq =-1;
		
		for(char i='a';i<='z';i++)
		{
			int val = i-'a';
			if(ch[val] >0)
			{
				Key k1 = new Key();
				k1.freq = ch[val];
				k1.ch = i;
				pq.add(k1);
			}
		}
		
		String str="";
		while(pq.size()!=0)
		{
			 cur = pq.poll();
			str=str+cur.ch;
			if(prev.freq >0)
			{
				pq.add(prev);
				
			}
			cur.freq--;
			prev = cur;
			
		}
		
		if(n!=str.length())
		{
			System.out.println(" not possible");
		}
		else
			System.out.println(" possible ");
	}
	

}









