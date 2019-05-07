package com.generic;

import java.util.LinkedList;
import java.util.Queue;

class Producer implements Runnable {

	Queue<Integer> que;
	int size = 2;
	Object obj;

	public Producer(Queue<Integer> que, int size, Object obj) {
		this.que = que;
		this.size = size;
		this.obj = obj;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void produce() throws InterruptedException {
		synchronized (obj) {
			for (int i = 0; i < 10; i++) {
				int a = 1/0;
				while (que.size() == 2) {
					obj.wait();
				}
				System.out.println(Thread.currentThread().getName() + " " + i);
				que.add(i);
				obj.notifyAll();
			}
			
		}
	}
}

class Consumer implements Runnable {

	Queue<Integer> que;
	int size;
	Object obj;

	public Consumer(Queue<Integer> que, int size, Object obj) {
		this.que = que;
		this.size = size;
		this.obj = obj;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void consume() throws InterruptedException {

		synchronized (obj) {
		while (true) {

				while (que.size() == 0) {
					obj.wait();
				}
				System.out.println(Thread.currentThread().getName() + " " + que.remove());
				obj.notifyAll();
			}
		
		}
	}
}

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Object obj = new Object();
		Queue<Integer> que = new LinkedList<Integer>();
		Producer pr = new Producer(que, 3, obj);
		Consumer cr = new Consumer(que, 3, obj);
		Thread pth = new Thread(pr, "producer");
		Thread cth = new Thread(cr, "consumer");
		pth.start();
		cth.start();
		/*pth.interrupt();
		cth.interrupt();*/
		CustemoHandler exh = new CustemoHandler();
		pth.setUncaughtExceptionHandler(exh);
		cth.setUncaughtExceptionHandler(exh);
	}

}
