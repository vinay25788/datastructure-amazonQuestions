package main.java.ecs.impl;

import java.util.HashMap;
import java.util.Map;

class MyTrieNode
{
	char data;
	int frequency;
	int minHeapIndex=-1;
	Map<Character,MyTrieNode> nodes;
	boolean is_End_of_String;
	
	public MyTrieNode(char data)
	{
		this.data = data;
		this.is_End_of_String = false;
		nodes = new HashMap<>();
	}
	
	public MyTrieNode getChildren(char c)
	{
		return nodes.get(c);
	}
	
	public boolean isChildExist(char c)
	{
		return getChildren(c) != null; 
	}
}

class MyNode
{
	String word;
	int frequency;
	MyTrieNode node;
}

class MinHeap
{
	int size;
	int capacity;
	MyNode[] nodes;
}

class MyTrie
{
	MyTrieNode root;
	MinHeap minHeap;
	
	public MyTrie(int frequency)
	{
		root = new MyTrieNode(' ');
		this.minHeap = new MinHeap();
		this.minHeap.nodes = new MyNode[frequency];
		this.minHeap.capacity = frequency;
	}
	
	public void insert(String s)
	{
		if(s == null && s.trim().length() == 0)
			return;
		MyTrieNode current = root;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(!current.isChildExist(c))
			{
				MyTrieNode node= new MyTrieNode(c);
				current.nodes.put(c, node);
			}
			current = current.getChildren(c);
		}
		
		if(!current.is_End_of_String)
		{
			current.frequency++;
		}
		else
		{
			current.frequency =1;
			current.is_End_of_String= true;
		}
	}
	
	private void insertInMinHeap(String s,MyTrieNode current)
	{
		if(current.minHeapIndex != -1)
		{
			this.minHeap.nodes[current.minHeapIndex].frequency++;
			minHeapify(current.minHeapIndex);
		}
		else if (this.minHeap.size < this.minHeap.capacity)
		{
			this.minHeap.size++;
			MyNode node = new MyNode();
			node.word = s;
			node.frequency = current.frequency;
			node.node = current;
			node.node.minHeapIndex = this.minHeap.size -1;
			this.minHeap.nodes[this.minHeap.size-1] = node;
			buildHeap();
		}
		else if (current.frequency> this.minHeap.nodes[0].frequency)
		{
			this.minHeap.nodes[0].node.minHeapIndex = -1;
			this.minHeap.nodes[0].node = current;
			this.minHeap.nodes[0].frequency= current.frequency;
			this.minHeap.nodes[0].word = s;
			current.minHeapIndex=0;
			minHeapify(0);
		}
	}
	
	public void buildHeap()
	{
		for(int i=0;i<(this.minHeap.size-1)/2;i++)
		{
			minHeapify(i);
		}
	}
	 public void minHeapify(int node) {
	        int left = (node << 1) + 1;
	        int right = (node << 1) + 2;
	        int smallest = node;
	        if (left < this.minHeap.size
	                && this.minHeap.nodes[smallest].frequency > this.minHeap.nodes[left].frequency) {
	            smallest = left;
	        }
	        if (right < this.minHeap.size
	                && this.minHeap.nodes[smallest].frequency > this.minHeap.nodes[right].frequency) {
	            smallest = right;
	        }
	        if (smallest != node) {
	            int index = this.minHeap.nodes[smallest].node.minHeapIndex;
	            this.minHeap.nodes[smallest].node.minHeapIndex = this.minHeap.nodes[node].node.minHeapIndex;
	            this.minHeap.nodes[node].node.minHeapIndex = index;
	            MyNode temp = this.minHeap.nodes[smallest];
	            this.minHeap.nodes[smallest] = this.minHeap.nodes[node];
	            this.minHeap.nodes[node] = temp;
	            minHeapify(smallest);
	        }
	    }

	    /*
	     * Traverse through Min Heap and show all words and their frequency 
	     * */
	    public void display() {
	        for (int i = 0; i < this.minHeap.size; i++) {
	            System.out.println("word\t:\t" + this.minHeap.nodes[i].word
	                    + "\t\t\t\tfrequency\t:\t" + this.minHeap.nodes[i].frequency);
	        }
	    }
}
public class FindKMostFrequencyWordInFile {

}




























