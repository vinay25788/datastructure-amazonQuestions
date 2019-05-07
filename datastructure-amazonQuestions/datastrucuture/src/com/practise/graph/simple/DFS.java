package com.practise.graph.simple;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DFS {

	Graph g;
	static class Graph
	{
		List<Integer>  adjacecyList[];
		
		Graph(int v)
		{
			adjacecyList = new LinkedList[v];
			for(int i=0;i<v;i++)
			{
				adjacecyList[i] = new LinkedList();
			}
		}
	}
	
	public void addEdge(int source,int target)
	{
		g.adjacecyList[source].add(target);
	}
	
	public void dfs(int s)
	{
		boolean[] visited = new boolean[g.adjacecyList.length];
		dfsUtil(s,visited);
		
		for(int i=0;i<visited.length;i++)
		{
			if(visited[i] == false)
				dfsUtil(i, visited);
		}
	}
	public void dfsUtil(int source,boolean[] visited)
	{
			visited[source] = true;
			System.out.print(" "+source);
			
			Iterator<Integer> it = g.adjacecyList[source].listIterator();
			while(it.hasNext())
			{
				int next = it.next();
				if(visited[next] == false)
				{
					dfsUtil(next, visited);
				}
			}
			
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(4);
		DFS obj = new DFS();
		obj.g = g;
		obj.addEdge(0, 2);
		obj.addEdge(0, 1);
		obj.addEdge(1, 3);
		obj.addEdge(3, 2);
		
		obj.dfs(0);
	}
}















