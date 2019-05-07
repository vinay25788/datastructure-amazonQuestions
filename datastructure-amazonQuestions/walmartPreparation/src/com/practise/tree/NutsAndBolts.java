package com.practise.tree;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class NutsAndBolts {
	public static void main(String[] args) {
		char nuts[] = {'@', '#', '$', '%', '^', '&'}; 
	    char bolts[] = {'$', '%', '&', '^', '@', '#'}; 
	    
	    findMatch(nuts,bolts);
	}
	public static void findMatch(char[] nuts,char[] bolts)
	{
		Set<Character> set = new LinkedHashSet<>();
		for(char ch:nuts)
		{
			if(!set.contains(ch))
				set.add(ch);
		}
		
		/*Iterator it= set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}*/
		
		for(int i=0;i<bolts.length;i++)
		{
			if(set.contains(bolts[i]))
			{
				nuts[i] = bolts[i];
			}
		}
		
		for(int i=0;i<nuts.length;i++)
		{
			System.out.print(nuts[i]+ " ");
		}
		System.out.println();
		for(int i=0;i<bolts.length;i++)
		{
			System.out.print(bolts[i]+ " ");
		}
	}

}
