package com.generic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Producer2 implements Runnable
{
	Queue<Integer> que;
	Lock lock;
	Condition producerCondition;
	Condition consumrCondition;
	 Producer2(Queue<Integer> que,Lock lock,Condition producerCondition,Condition  consumrCondition)
	 {
		 this.lock = lock;
		 this.producerCondition = producerCondition;
		 this.consumrCondition = consumrCondition;
		 this.que = que;
	 }
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			try {
				m1(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void m1(int i) throws InterruptedException
	{
		lock.lock();
		{
			while(que.size() == 3)
			{
				producerCondition.await();
			}
			que.add(i);
			System.out.println("produced -->"+i);
			consumrCondition.signal();
		}
		lock.unlock();
	}
}
class Consumer2 implements Runnable
{
	Queue<Integer> que;
	Lock lock;
	Condition producerCondition;
	Condition consumrCondition;
	Consumer2(Queue<Integer> que,Lock lock,Condition producerCondition,Condition  consumrCondition)
	 {
		 this.lock = lock;
		 this.producerCondition = producerCondition;
		 this.consumrCondition = consumrCondition;
		 this.que = que;
	 }
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void m1() throws InterruptedException
	{
		lock.lock();
		{
			while(que.size() == 0)
			{
				consumrCondition.await();
			}
			
			System.out.println("consumed -->"+que.remove());
			producerCondition.signal();
		}
		lock.unlock();
	}
}
public class ProducerConsumerUsingLock {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Queue<Integer> que = new LinkedList();
		Condition prod = lock.newCondition();
		Condition consu = lock.newCondition();
		Producer2 pro = new Producer2(que, lock, prod, consu);
		Consumer2 cons = new Consumer2(que, lock, prod, consu);
		Thread pth = new Thread(pro, "producer");
		Thread cth = new Thread(cons, "consumer");
		pth.start();
		cth.start();
		
	}
}














