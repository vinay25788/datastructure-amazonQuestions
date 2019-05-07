package com.practise.basic.producerConsumer;

import java.util.LinkedList;
import java.util.List;

class Producer implements Runnable
{
	List<Integer> list;
	int cap ;
	int number=0;
	
	Producer(int size,List<Integer> list)
	{
		this.cap = size;
		this.list = list;
	}
	
	public void run()
	{
		
		for(int i=0;i<20;i++) {
		
			try {
				produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void produce() throws InterruptedException
	{
		synchronized(list)
		{
			while(!list.isEmpty())
			{
				list.wait();
			}
			System.out.println("produces "+number);
			list.add(number++);
			list.notifyAll();
		}
	}
	
}
class Consumer implements Runnable
{
	List<Integer> list;
	int number=0;
	
	Consumer(List<Integer> list)
	{
		this.list = list;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void consumer() throws InterruptedException
	{
		synchronized(list)
		{
			while(list.isEmpty())
			{
				list.wait();
			}
			//System.out.println(list.get(0));
			System.out.println("consuming "+list.remove(0));
			list.notifyAll();
		}
	}
	
}
public class ProducerConsumerDemo {
	public static void main(String[] args) {
		List<Integer> list= new LinkedList<>();
		int cap = 5;
		Producer pr = new Producer(cap, list);
		Consumer cr = new Consumer(list);
		Thread pth = new Thread(pr,"producer");
		Thread cth = new Thread(cr,"consumer");
		pth.start();
		cth.start();
	}

}
