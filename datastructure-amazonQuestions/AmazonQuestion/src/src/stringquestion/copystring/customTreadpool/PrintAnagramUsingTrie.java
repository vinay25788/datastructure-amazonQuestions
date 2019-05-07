package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;
import java.util.LinkedList;

public class PrintAnagramUsingTrie {
	
	static class TrieNode
	{
		TrieNode[] child = new TrieNode[26];
		public boolean isEnd;
		LinkedList<Integer> head;
		
		TrieNode()
		{
			isEnd = false;
			head = new LinkedList<>();
			for(int i=0;i<26;i++)
			{
				child[i] = null;
			}
		}
		
		public static TrieNode issert(TrieNode root,String buff,int index,int i)
		{
			if(root == null)
				root = new TrieNode();
			if(i<buff.length())
			{
				int ind = buff.charAt(i)-'a';
				root.child[ind] = issert(root.child[ind], buff, index, i+1);
			}
			else
			{
				if(root.isEnd )
					root.head.add(index);
				else
				{
					root.isEnd = true;
					root.head.add(index);
				}
			}
			return root;
		}
	}

	public static void printAnagram(String[] word,int size)
	{
		TrieNode root = null;
		for(int i=0;i<word.length;i++)
		{
			char[] buff = word[i].toCharArray();
			Arrays.sort(buff);
			root = TrieNode.issert(root, new String(buff), i, 0);
		}
		printAnagramUtil(root,word);
	}
	
	public static void printAnagramUtil(TrieNode root,String[] word)
	{
		if(root == null)
			return;
		if(root.isEnd)
		{
			for(Integer i:root.head)
			{
				System.out.println(word[root.head.getFirst()]+" "+word[i]);
			}
		}
		else
		{
			for(int i=0;i<26;i++)
				printAnagramUtil(root.child[i], word);	
		}
			
	}
	public static void main(String[] args) {
		String wordArr[] = {"cat", "dog", "tac", "god", 
	            "act", "gdo"}; 
	int size = wordArr.length; 
	printAnagram(wordArr, size); 
	}
}










