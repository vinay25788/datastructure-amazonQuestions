package src.stringquestion.copystring.customTreadpool;

import java.util.Arrays;
import java.util.LinkedList;


public class AnagramUsingTrie {

	static class TrieNode
	{
		public static final int NO_OF_CHARACTER=26;
		TrieNode[] child = new TrieNode[NO_OF_CHARACTER];
		public boolean isEnd;
		LinkedList< Integer> head ;
		public TrieNode() {
			// TODO Auto-generated constructor stub
			isEnd = false;
			head = new LinkedList<>();
			for(int i=0;i<NO_OF_CHARACTER;i++)
			{
				child[i] = null;
			}
		}
		public static TrieNode insert(TrieNode root,String word,int index,int i	)
		{
			if(root == null)
				root = new TrieNode();
			if(i<word.length())
			{
				int index1 = word.charAt(i)-'a';
				root.child[index1] = insert(root.child[index1], word, index, index1+1);
			}
			else
			{
				if(root.isEnd)
				{
					root.head.add(index);
				}
				else
				{
					root.isEnd = true;
					root.head.add(index);
				}
			}
			
			return root;
		}
	}
	public static void printAnagramUtil(TrieNode root, String[] word)
	{
		if(root == null)
			return;
		if(root.isEnd)
		{
			for(Integer i:root.head)
				System.out.println(word[i]);
		}
		else
		{
			for(int i=0;i<TrieNode.NO_OF_CHARACTER;i++)
			{
				printAnagramUtil(root.child[i], word);
			}
		}
	}
	
	public static void printAnagramsTogether(String[] wordArr,int size)
	{
		TrieNode root=null;
		for(int i=0;i<wordArr.length;i++)
		{
			char[] buff = wordArr[i].toCharArray();
			Arrays.sort(buff);
			root = TrieNode.insert(root,new String(buff),i,0);
		}
		printAnagramUtil(root,wordArr);
	}
	
	
	
	
public static void main(String[] args) {
	String wordArr[] = {"cat", "dog", "tac", "god", 
            "act", "gdo"}; 
int size = wordArr.length; 
printAnagramsTogether(wordArr, size); 
}
}
