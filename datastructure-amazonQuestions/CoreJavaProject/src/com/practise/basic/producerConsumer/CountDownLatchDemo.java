package com.practise.basic.producerConsumer;

import java.util.concurrent.CountDownLatch;

class CountDown implements Runnable
{
	CountDownLatch latch;
	public CountDown(CountDownLatch latch) {
		this.latch =latch;
	}
	
	public void run()
	{
		System.out.println("waiting "+Thread.currentThread().getName());
		latch.countDown();
		
		
	}
}
public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		CountDown down = new CountDown(latch);
		Thread t1 = new Thread(down,"thread1");
		Thread t2 = new Thread(down,"thread2");
		Thread t3 = new Thread(down,"thread3");
		t1.start();
		t2.start();
		t3.start();
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" reached ");
		t1.start();
		t2.start();
		t3.start();
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" reached ");
	}
}
