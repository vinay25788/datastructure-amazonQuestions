package com.practise.basic.producerConsumer;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Task2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Action executed ");
	}
	
}
class Barrier implements Runnable
{
	CyclicBarrier latch;
	public Barrier(CyclicBarrier latch) {
		this.latch =latch;
	}
	
	
	
	public void run()
	{
		System.out.println("waiting "+Thread.currentThread().getName());
		//latch.countDown();
		try {
			latch.await();
			System.out.println(" reached ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class CyclicBarrierDemo {

	public void m2(Map<Integer,Integer> map)
	{
		System.out.println(map);
	}
	public void m1(Map<Integer,Integer> map)throws Exception
	{
		System.out.println(map);
		
	}
	public static void main(String[] args) {
		
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		
		CyclicBarrierDemo ob=new CyclicBarrierDemo();
		//ob.m1= ob::m2;
		//CountDownLatch latch = new CountDownLatch(3);
		Task2 task = new Task2();
		CyclicBarrier bar = new CyclicBarrier(3, task);
		Barrier obj = new Barrier(bar);
		Thread t1 = new Thread(obj,"thread1");
		Thread t2 = new Thread(obj,"thread2");
		Thread t3 = new Thread(obj,"thread3");
		t1.start();
		t2.start();
		t3.start();
		
		/*t1.start();
		t2.start();
		t3.start();*/
		Thread t4 = new Thread(obj,"thread1");
		Thread t5 = new Thread(obj,"thread2");
		Thread t6 = new Thread(obj,"thread3");
		t4.start();
		t5.start();
		t6.start();
	}
}
