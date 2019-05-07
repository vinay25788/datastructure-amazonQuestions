package src.stringquestion.copystring.customTreadpool;

public class WordPresentInDictinary {
	
	static TrieNode root = new TrieNode();
	static class TrieNode
	{
		boolean isEnd;
		TrieNode[] child = new TrieNode[26];
		public TrieNode() {
			this.isEnd = false;
			for(int i=0;i<26;i++)
				child[i] = null;
		}
		
		public static void insert(String key)
		{
			TrieNode crawl = root;
			key = key.toLowerCase();
			for(int i=0;i<key.length();i++)
			{
				int index = key.charAt(i)-'a' ;
				
				//int index2 = key.charAt(i)-'A';
				if(crawl.child[index] == null)
					crawl.child[index] = new TrieNode();
				
				crawl = crawl.child[index];
			}
			
			crawl.isEnd = true;
			
		}
		
		
	}
	public static void search(String key)
	{
		TrieNode crawl = root;
		
		searchUtil(root,key.toLowerCase(),0);
		
	}
	
	public static void searchUtil(TrieNode root,String key,int index)
	{
		
		TrieNode crawl = root;
		int i=0;
		for( i=0;i<key.length();i++)
		{
			int ind = key.charAt(i)-'a';
			if(crawl.child[ind] != null)
				crawl =crawl.child[ind];
			
			//crawl = crawl.child[ind];
			
		}
		if(i== key.length() && crawl.isEnd)
		{
			System.out.println("found ");
			return;
			
		}
		else
			System.out.println("not found");
	}
	public static void main(String[] args) {
		String[] word = {"i","am","vinay","osim"};
		for(int i=0;i<word.length;i++)
			root.insert(word[i]);
		search("iamOsim");
	}

}
