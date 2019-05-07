package com.practise.graph.simple;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

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
	
	public void bfs(int source)
	{
			boolean[] visited = new boolean[g.adjacecyList.length];
			Queue<Integer> que = new LinkedList<>();
			
			que.add(source);
			visited[source] = true;
			while(que.isEmpty() == false)
			{
				int list = que.poll();
				
				System.out.print(" "+list);
				Iterator<Integer> it = g.adjacecyList[list].listIterator();
				
				while(it.hasNext())
				{
					int next = it.next();
					if(visited[next] == false)
					{
						visited[next] = true;
						que.add(next);
					}
				}
			}
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(4);
		BFS obj = new BFS();
		obj.g = g;
		obj.addEdge(0, 2);
		obj.addEdge(0, 1);
		obj.addEdge(1, 3);
		obj.addEdge(3, 2);
		
		obj.bfs(0);
	}
}















