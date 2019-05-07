package com.practise.array.order;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2) >0?-1:1;
			}
		});
		pq.add(5);
		pq.add(10);
		pq.add(1);
		pq.add(15);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	}
}
