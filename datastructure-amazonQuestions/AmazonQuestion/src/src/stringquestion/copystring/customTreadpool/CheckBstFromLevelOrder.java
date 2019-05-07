package src.stringquestion.copystring.customTreadpool;

import java.util.LinkedList;
import java.util.Queue;

public class CheckBstFromLevelOrder {
	
	static class Node
	{
		int data;
		int min;
		int max;
	}
	public static void main(String[] args) {
		int arr[] = {7, 4, 12, 3, 6, 8, 1, 5, 10};    
		System.out.println(check(arr));
	}
	public static boolean check(int[] a)
	{
		Queue<Node> que = new LinkedList<>();
		int n = a.length;
		int i=0;
		Node newNode = new Node();
		newNode.data = a[i++];
		newNode.min = Integer.MIN_VALUE;
		newNode.max = Integer.MAX_VALUE;
		que.add(newNode);
		while(i!=n && que.isEmpty() == false)
		{
			Node temp = que.poll();
			if(i<n && a[i]<temp.data && a[i]>temp.min)
			{
				newNode.data = a[i++];
				newNode.min = temp.min;
				newNode.max = temp.data;
				que.add(newNode);
			}
			if(i<n && (a[i]>temp.data && a[i]<temp.max))
			{
				newNode.data = a[i++];
				newNode.min = temp.data;
				newNode.max = temp.max;
				que.add(newNode);
			}
		}
		
		if(i==n)
			return true;
		return false;
	}

}
