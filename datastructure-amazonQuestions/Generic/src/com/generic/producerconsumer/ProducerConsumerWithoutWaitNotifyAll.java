package com.generic.producerconsumer;

import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable
{
	boolean productionInProcess;
	List<Integer> list;
	
	Producer()
	{
		list = new ArrayList<>();	
		productionInProcess = true;
	}

	@Override
	public void run() {

		try {
			produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void produce() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			list.add(i);
		}
		productionInProcess = false;
		Thread.sleep(1000);
	}
	
	
}

class Consumer implements Runnable
{
	Producer pr;
	
	Consumer(Producer pr)
	{
		this.pr = pr;
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
	public void consume() throws InterruptedException
	{
		while(this.pr.productionInProcess == true)
		{
			Thread.sleep(400);
		}
		int size = this.pr.list.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+this.pr.list.remove(0));
			
		}
	}
}
public class ProducerConsumerWithoutWaitNotifyAll {
	public static void main(String[] args) {
		Producer pr = new Producer();
		Consumer con = new Consumer(pr);
		Thread pth = new Thread(pr,"producer");
		Thread cth = new Thread(con,"consumer");
		pth.start();
		cth.start();
	}
}












