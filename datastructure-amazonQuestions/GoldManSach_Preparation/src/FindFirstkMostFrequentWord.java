import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Trie
{
	int count;
	String key;
	Map<Character,Trie> map= new HashMap<>();
}

class Node implements Comparable<Node>
{
	String key;
	int count;
	public Node(String key,int count) {
		this.key = key;
		this.count = count;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		Node node = (Node)o;
		return this.count-node.count;
	}
}

public class FindFirstkMostFrequentWord {

	public static void insert(Trie root,String word)
	{
		Trie cur=root;
		for(int i=0;i<word.length();i++)
		{
			if(!cur.map.containsKey(word.charAt(i)))
					{
						cur.map.put(word.charAt(i), new Trie());
					}
			
			cur = cur.map.get(word.charAt(i));
				
		}
		
		cur.key= word;
		cur.count+=1;
	}
	
	public static void preorder(Trie curr,PriorityQueue<Node> pq)
	{
		if(curr== null)
			return;
		for(Map.Entry<Character, Trie> entry:curr.map.entrySet())
		{
			if(entry.getValue().count !=0)
			{
				pq.add(new Node(entry.getValue().key,entry.getValue().count));
			}
			preorder(entry.getValue(), pq);
		}
	}
	
	public static void findKFrequentWord(String[] dic,int k)
	{
		Trie root = new Trie();
		
		for(String word:dic)
		{
			insert(root, word);
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		preorder(root, pq);
		
		while(k-->0&& !pq.isEmpty())
		{
			Node max = pq.poll();
			System.out.println(max.key+" "+max.count);
		}
	}
	public static void main(String[] args) {
		String[] dict =
			{
				"code", "coder", "coding", "codable", "codec", "codecs",
				"coded", "codeless", "codec", "codecs", "codependence",
				"codex", "codify", "codependents", "codes", "code",
				"coder", "codesign", "codec", "codeveloper", "codrive",
				"codec", "codecs", "codiscovered"
			};

			int k = 4;

			findKFrequentWord(dict, k);
	}
}
















