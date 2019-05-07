package src.stringquestion.copystring.customTreadpool;

import java.security.Key;

public class MinimumWordBreakProblem {
	
	static TrieNode root = new TrieNode();
	static int minWordBreak = Integer.MAX_VALUE;
	
	static class TrieNode
	{
		boolean isEndOfWord;
		TrieNode[] child = new TrieNode[26];
		
		TrieNode()
		{
			isEndOfWord = false;
			for(int i=0;i<26;i++)
				child[i] = null;
		}
		
		public void insert(String key)
		{
			TrieNode crawl = root;
			
			int len = key.length();
			for(int i=0;i<len;i++)
			{
				int index = key.charAt(i)-'a';
				if(crawl.child[index] == null)
					crawl.child[index] = new TrieNode();
				
				crawl = crawl.child[index];
			}
			
			crawl.isEndOfWord = true;
		}
	}
		public static void minWord(String key)
		{
			
			 minWordUtil(key,root,0,Integer.MAX_VALUE,0);
			
		}
		public static void minWordUtil(String str,TrieNode root,int start,int minWord,int level)
		{
			TrieNode crawl = root;
			
			if(start == str.length())
			{
				minWord = Integer.min(minWord, level-1);
				if(minWord<minWordBreak)
					 minWordBreak = minWord;
				
				return ;
			}

			for(int i=start;i<str.length();i++)
			{
				int index = str.charAt(i)-'a';
				if(crawl.child[index] == null)
					return;
				if(crawl.child[index].isEndOfWord)
					minWordUtil(str, root, i+1, minWord, level+1);
				
				crawl = crawl.child[index];
			}
				
		}
		
		public static void main(String[] args) {
			  String keys[] = {"cat", "mat", "ca", "ma", 
	                    "at", "c", "dog", "og", "do" }; 
	  
			  TrieNode trie = new TrieNode(); 
	  
	        // Construct trie 
	          
	        int i; 
	        for (i = 0; i < keys.length ; i++) 
	            trie.insert(keys[i]); 
	          
	       minWord("catmatat");
	       System.out.println(minWordBreak);
	  
		}
}
