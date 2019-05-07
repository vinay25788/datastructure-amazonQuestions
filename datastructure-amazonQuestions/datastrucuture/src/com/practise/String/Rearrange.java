package com.practise.String;

import java.util.PriorityQueue;

public class Rearrange {
	public static void main(String[] args) {
		String a="aabbb";
		rearrange(a);
		
		Integer i1= new Integer(1);
		Integer i2 = new Integer(2);
		if(i1== i2)
			System.out.println("true");
		else
			System.out.println(" false");
		
		Integer i3= Integer.valueOf(1);
		Integer i4 = Integer.valueOf(1);
		if(i3== i4)
			System.out.println("true");
		else
			System.out.println(" false");
		
	}
	
	public static void rearrange(String a)
	{
		int n= a.length();
		int count[] = new int[26];
		PriorityQueue<Character> pq = new PriorityQueue<>();
		for(int i=0;i<a.length();i++)
		{
			count[a.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++)
		{
			if(count[i] >0)
			{
				pq.add((char)count[i]);
			}
		}
		String str="";
		char prev = 0;
		 while (!pq.isEmpty()) 
		    { 
		        // pop top element from queue and add it 
		        // to string. 
		        char k = pq.peek(); 
		        pq.poll(); 
		        str = str + k; 
		        
		       
		       if(prev >0)
		    	   pq.add((char)count[k]);
		    	   
		       count[k]--;
		        prev = k;
		        
		    } 
		 
		 if(str.length() == a.length())	
			 System.out.println(str);
		 else
			 System.out.println("invalid");
	}

}
