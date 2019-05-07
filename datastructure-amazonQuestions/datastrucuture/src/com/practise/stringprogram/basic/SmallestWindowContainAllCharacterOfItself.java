package com.practise.stringprogram.basic;

public class SmallestWindowContainAllCharacterOfItself {
	
	public static void main(String[] args) {
		String str = "aabcbcdbca"; 
		String sub = findSubString(str);
		if(sub.isEmpty() == false)
			System.out.println(" found "+ sub);
		else
			System.out.println(" not found ");
	}
     public static String findSubString(String str)
     {
    	 int len = str.length();
    	 boolean [] visited = new boolean[256];
    	 int dist_count=0;
    	 for(int i=0;i<str.length();i++)
    	 {
    		 if(visited[str.charAt(i)] == false)
    			 {
    			 	visited[str.charAt(i)] = true;
    			 	dist_count++;
    			 }
    	 }
    	 
    	 int start=0,start_index = -1;
    	 int [] cur_count  = new int[256];
    	 int min_length=Integer.MAX_VALUE;
    	 int count =0;
    	 
    	 
    	 for(int i=0;i<str.length();i++)
    	 {
    		 cur_count[str.charAt(i)]++;
    		 
    		 if(cur_count[str.charAt(i)] ==1)
    		 {
    			 count++;
    		 }
    		 
    		 if(count == dist_count)
    		 {
    			 while(cur_count[str.charAt(start)] > 1)
    			 {
    				 if(cur_count[str.charAt(start)]>1)
    					 cur_count[str.charAt(start)]--;
    				 
    				 start++;
    			 }
    			 
    			 int cur_length = i-start+1;
    			 if(min_length > cur_length)
    			 {
    				 min_length = cur_length;
    				 start_index = start;
    			 }
    		 }
    		 
    	 }
    	 
    	 if(start_index == -1)
    		 return "";
    	 
    	 return str.substring(start_index, start_index+min_length);
    	 
    	 
     }
}
