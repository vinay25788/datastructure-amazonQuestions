package com.practise.paytm;

import java.util.HashMap;
import java.util.Map;

public class TrieSugession {
	
	static TrieNode root;
	static int index;
	TrieSugession()
	{
		root = new TrieNode();
	}
	static class TrieNode
	{
		Character val;
		TrieNode[] child ;
		boolean isEnd;
		Map<TrieNode,String> map;
		TrieNode()
		{
			child = new TrieNode[26];
			for(int i=0;i<26;i++)
			{
				child[i] = null;
			}
			isEnd = false;
			map = new HashMap<>();
		}
	}
	
	public void insert(String word)
	{
		TrieNode crawl = root;
		for(int i=0;i<word.length();i++)
		{
			char ch = word.charAt(i);
			
			if(crawl.child[ch-'a'] ==null)
			{
				crawl.child[ch-'a'] = new TrieNode();
			}
			crawl = crawl.child[ch-'a'];
		}
		crawl.isEnd = true;
		crawl.map.put(crawl, word);
	}
	
	public  void search(String word,TrieNode root)
	{
		TrieNode crawl = root;
		
		for(int i=0;i<word.length();i++)
		{
			if(crawl.child[word.charAt(i)-'a']==null)
				return;
			crawl = crawl.child[word.charAt(i)-'a'];
		}
		
		boolean isEnd = crawl.isEnd;
		if(isEnd)
		{
			System.out.println(crawl.map.get(crawl));
		}
		boolean isAnyword = check(crawl);
				if(!isAnyword)
				{
					StringBuffer sb = new StringBuffer();
					sb.append(word);
					suggestionRecursion(crawl,sb);
				}
	}
	
	public void suggestionRecursion(TrieNode root,StringBuffer sb)
	{
		if( root.isEnd)
		{
			System.out.println(root.map.get(root));
			//return;
		}
		if(check(root))
		{
			return;
		}
		for(int i=0;i<26;i++)
		{
			if(root.child[i] !=null) {
			//root = root.child[i];
			char ch = (char) ((char) i+97);
			sb.append(ch);
			suggestionRecursion(root.child[i],sb);
			}
		}
	}
	public boolean check(TrieNode root)
	{
		for(int i=0;i<26;i++)
		{
			if(root.child[i]!=null)
				return false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		String[] words = {"bear","bell","boo"};
		TrieSugession obj = new TrieSugession();
		for(String word : words)
		{
			obj.insert(word);
		}
		obj.search("be",obj.root);
	}

}
